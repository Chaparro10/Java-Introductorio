import platzi.play.contenido.*;
import platzi.play.exception.PeliculaExistenteException;
import platzi.play.plataforma.Plataforma;
import platzi.play.utils.FileUtils;
import platzi.play.utils.ScannerUtils;

import javax.print.Doc;
import java.util.List;


public class Main {
    public  static final String VERSION="1.0";
    public  static final String NAME="PLATZI CINEMAX";
    public  static final int SALIR=6;
    public  static final int AGREGAR=1;
    public  static final int MOSTRAR=2;
    public  static final int BUSCAR=3;
    public  static final int BUSCAR_POR_GENERO=4;
    public  static final int ELIMINAR=5;
    public  static  final int POPULAR=7;
    public  static  final int PELICULA_LARGA=8;
    public  static  final int PELICULA_CORTA=9;
    public  static  final int PELICULAS_IGUALES=10;
    public  static  final int REPRODUCIR_PELICULA=11;
    public static  final int PELICULA_MAX_REPRODUCIDA=12;
    public static void main(String[] args) {
        System.out.println(NAME +" "+ VERSION);
        Plataforma plataforma = new Plataforma(NAME);
        cargarPeliculas(plataforma);

        System.out.println("Más de "+ plataforma.totalDuracionContenido() +" minutos de contenido" );

        while (true){
                int opcionElegida=ScannerUtils.capturarNumero("""
                        Ingresa una de las siguientes opciones:
                        1.Agregar contenido
                        2.Mostrar todo
                        3.Buscar por titulo
                        4.Buscar por genero
                        5.Eliminar
                        7.Populares
                        8.Pelicula mas larga
                        9.Pelicula mas corta
                        10.Peliculas que duran lo mismo
                        11.Reproducir contenido
                        12.Pelicula mas Reproducida
                        6.Salir
                        """);
            System.out.println("Opcion elegida:"+ opcionElegida);

            switch (opcionElegida){
                case AGREGAR -> {
                    int tipo = ScannerUtils.capturarNumero("Ingresa el tipo:1-Pelicula,2-Documental");
                    String titulo = ScannerUtils.capturarTexto("Ingresa el titulo");
                    double duracion = ScannerUtils.capturarDecimal("Ingresa la duracion");
                    Genero genero = Genero.valueOf(ScannerUtils.capturarTexto("Ingresa el genero"));
//                    TestProtected contenido = new TestProtected(titulo, genero, duracion, false);
//                    contenido.calificar(4);
//                    contenido.AsignarValorStatusPelicula(true);

                    try{
                        if(tipo==1){
                            Pelicula pelicula = new Pelicula(titulo,genero,true,duracion);
                            pelicula.calificar(4.5);
                            plataforma.agregar(pelicula);
                        }
                        if(tipo==2){
                            String narrador = ScannerUtils.capturarTexto("Ingresa el narrador");
                            Documental documental = new Documental(titulo,genero,true,duracion,narrador);
                            documental.calificar(5);
                            plataforma.agregar(documental);
                        }

                    }catch (PeliculaExistenteException e){
                        System.out.println(e.getMessage());
                    }
                }
                case MOSTRAR -> plataforma.mostrarPeliculas();
                case  BUSCAR -> {
                    String titulo = ScannerUtils.capturarTexto("Ingresa el titulo a buscar");
                    Contenido contenido = plataforma.buscarPorTitulo(titulo);
                    if(contenido != null){
                        System.out.println("=========PELICULA ENCONTRADA=======");
                        System.out.println(contenido.obtenerFichaTecnica());
                    }else{
                        System.out.println("Titulo no encontrado intente nuevamente");
                    }

                }
                case BUSCAR_POR_GENERO -> {
                    Genero genero = Genero.valueOf(ScannerUtils.capturarTexto("Ingresa el genero a filtar"));
                     List<String> contenidos= plataforma.buscarPorGenero(genero);
                    if(contenidos != null){
                        System.out.println("PELICULAS ENCONTRADAS CON EL GENERO::: "+ genero);
                        System.out.println(contenidos);
                    }else{
                        System.out.println("Peliculas no encontradas con ese genero");
                    }

                }
                case ELIMINAR -> {
                    String titulo = ScannerUtils.capturarTexto("Ingresa el titulo a eliminar");
                    Contenido contenido = plataforma.buscarPorTitulo(titulo);
                    if(contenido != null){
                        plataforma.eliminar(contenido);
                    }else{
                        System.out.println("Titulo no encontrado intente nuevamente");
                    }

                }
                case  POPULAR -> {
                    System.out.println("====POPULARES====");
                    List<Contenido> contenidos =plataforma.getPopulares();
                    contenidos.forEach(contenido-> System.out.println(contenido.obtenerFichaTecnica()));
                }
                case  PELICULA_LARGA -> {
                    System.out.println("====PELICULA MAS LARGA====");
                    System.out.println(plataforma.getPeliculaLarga());
                }
                case  PELICULA_CORTA -> {
                    System.out.println("====PELICULA MAS CORTA====");
                    System.out.println(plataforma.getPeliculaCorta());
                }
                case  PELICULAS_IGUALES -> {
                    System.out.println("====PELICULA DURAN LO MISMO====");
                    List<Contenido> contenidos = plataforma.getPeliculasConMismaDuracion();
                   contenidos.forEach(contenido-> System.out.println(contenido.obtenerFichaTecnica()));
                }
                case  REPRODUCIR_PELICULA -> {
                    System.out.println("====PELICULA REPRODUCIENDO====");
                    String titulo = ScannerUtils.capturarTexto("Ingresa el titulo a reproducir");
                    Contenido contenido = plataforma.buscarPorTitulo(titulo);
                    if(contenido != null){
                        plataforma.reproducir(contenido);
                    }else{
                        System.out.println("Titulo no encontrado intente nuevamente");
                    }

                }
                case  PELICULA_MAX_REPRODUCIDA -> {
                    System.out.println("====PELICULA MAX REPRODUCIDA====");
                    Contenido contenido = plataforma.masVistas();
                    System.out.println(contenido.getTitulo());
                }
                case SALIR ->  System.exit(0);
            }
        }
    }
    private static  void cargarPeliculas(Plataforma plataforma){
        plataforma.getContenido().addAll(FileUtils.leerContenido("Java-Intermedio/contenido.txt","|"));
//        plataforma.agregar(new TestProtected("shrek", Genero.ANIMADA,100 ,true));
//        plataforma.agregar(new TestProtected("Inception",Genero.CIENCIA_FICCION,100,true));
//        plataforma.agregar(new TestProtected("Titanic",Genero.DRAMA,120,true));
//        plataforma.agregar(new TestProtected("John wick",Genero.ACCION,120,true));
//        plataforma.agregar(new TestProtected("El conjuro",Genero.TERROR,120,true));
//        plataforma.agregar(new TestProtected("Coco",Genero.ANIMADA,120,true));
//        plataforma.agregar(new TestProtected("Interstellar",Genero.CIENCIA_FICCION,120,true));
//        plataforma.agregar(new TestProtected("Joker",Genero.DRAMA,120,true));
//        plataforma.agregar(new TestProtected("Toy story",Genero.ANIMADA,120,true));
//        plataforma.agregar(new TestProtected("Avengers",Genero.ACCION,90,true));
    }
}