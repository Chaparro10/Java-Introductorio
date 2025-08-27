import platzi.play.contenido.Genero;
import platzi.play.contenido.Pelicula;
import platzi.play.contenido.TestProtected;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.utils.ScannerUtils;

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
                        6.Salir
                        """);
            System.out.println("Opcion elegida:"+ opcionElegida);

            switch (opcionElegida){
                case AGREGAR -> {
                    String titulo = ScannerUtils.capturarTexto("Ingresa el titulo");
                    double duracion = ScannerUtils.capturarDecimal("Ingresa la duracion");
                    Genero genero = Genero.valueOf(ScannerUtils.capturarTexto("Ingresa el genero"));
                    TestProtected pelicula = new TestProtected(titulo, genero, duracion, false);
                    pelicula.calificar(4);
                    pelicula.AsignarValorStatusPelicula(true);
                    plataforma.agregar(pelicula);
                }
                case MOSTRAR -> plataforma.mostrarPeliculas();
                case  BUSCAR -> {
                    String titulo = ScannerUtils.capturarTexto("Ingresa el titulo a buscar");
                    Pelicula pelicula= plataforma.buscarPorTitulo(titulo);
                    if(pelicula != null){
                        System.out.println("=========PELICULA ENCONTRADA=======");
                        System.out.println(pelicula.obtenerFichaTecnica());
                    }else{
                        System.out.println("Titulo no encontrado intente nuevamente");
                    }

                }
                case BUSCAR_POR_GENERO -> {
                    Genero genero = Genero.valueOf(ScannerUtils.capturarTexto("Ingresa el genero a filtar"));
                     List<String> peliculas= plataforma.buscarPorGenero(genero);
                    if(peliculas != null){
                        System.out.println("PELICULAS ENCONTRADAS CON EL GENERO::: "+ genero);
                        System.out.println(peliculas);
                    }else{
                        System.out.println("Peliculas no encontradas con ese genero");
                    }

                }
                case ELIMINAR -> {
                    String titulo = ScannerUtils.capturarTexto("Ingresa el titulo a eliminar");
                    Pelicula pelicula= plataforma.buscarPorTitulo(titulo);
                    if(pelicula != null){
                        plataforma.eliminar(pelicula);
                    }else{
                        System.out.println("Titulo no encontrado intente nuevamente");
                    }

                }
                case  POPULAR -> {
                    System.out.println("====POPULARES====");
                    List<Pelicula> peliculas =plataforma.getPopulares();
                    peliculas.forEach(contenido-> System.out.println(contenido.obtenerFichaTecnica()));
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
                    List<Pelicula> peliculas = plataforma.getPeliculasConMismaDuracion();
                   peliculas.forEach(contenido-> System.out.println(contenido.obtenerFichaTecnica()));
                }
                case SALIR ->  System.exit(0);
            }
        }
    }
    private static  void cargarPeliculas(Plataforma plataforma){
        plataforma.agregar(new TestProtected("shrek", Genero.ANIMADA,100 ,true));
        plataforma.agregar(new TestProtected("Inception",Genero.CIENCIA_FICCION,100,true));
        plataforma.agregar(new TestProtected("Titanic",Genero.DRAMA,120,true));
        plataforma.agregar(new TestProtected("John wick",Genero.ACCION,120,true));
        plataforma.agregar(new TestProtected("El conjuro",Genero.TERROR,120,true));
        plataforma.agregar(new TestProtected("Coco",Genero.ANIMADA,120,true));
        plataforma.agregar(new TestProtected("Interstellar",Genero.CIENCIA_FICCION,120,true));
        plataforma.agregar(new TestProtected("Joker",Genero.DRAMA,120,true));
        plataforma.agregar(new TestProtected("Toy story",Genero.ANIMADA,120,true));
        plataforma.agregar(new TestProtected("Avengers",Genero.ACCION,90,true));
    }
}