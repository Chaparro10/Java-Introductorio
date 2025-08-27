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
    public static void main(String[] args) {
        System.out.println(NAME +" "+ VERSION);
        Plataforma plataforma = new Plataforma(NAME);
        cargarPeliculas(plataforma);

        while (true){
                int opcionElegida=ScannerUtils.capturarNumero("""
                        Ingresa una de las siguientes opciones:
                        1.Agregar contenido
                        2.Mostrar todo
                        3.Buscar por titulo
                        4.Buscar por genero
                        5.Eliminar
                        6.Salir
                        """);
            System.out.println("Opcion elegida:"+ opcionElegida);

            switch (opcionElegida){
                case AGREGAR -> {
                    String titulo = ScannerUtils.capturarTexto("Ingresa el titulo");
                    double duracion = ScannerUtils.capturarDecimal("Ingresa la duracion");
                    String genero = ScannerUtils.capturarTexto("Ingresa el genero");
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
                    String genero = ScannerUtils.capturarTexto("Ingresa el genero a filtar");
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
                case SALIR ->  System.exit(0);
            }
        }
    }
    private static  void cargarPeliculas(Plataforma plataforma){
        plataforma.agregar(new TestProtected("shrek","animacion",120,true));
        plataforma.agregar(new TestProtected("Inception","Ciencia ficcion",120,true));
        plataforma.agregar(new TestProtected("Titanic","Drama",120,true));
        plataforma.agregar(new TestProtected("John wick","Accion",120,true));
        plataforma.agregar(new TestProtected("El conjuro","Terror",120,true));
        plataforma.agregar(new TestProtected("Coco","animacion",120,true));
        plataforma.agregar(new TestProtected("Interstellar","Ciencia ficcion",120,true));
        plataforma.agregar(new TestProtected("Joker","Drama",120,true));
        plataforma.agregar(new TestProtected("Toy story","animacion",120,true));
        plataforma.agregar(new TestProtected("Avengers","Accion",120,true));
    }
}