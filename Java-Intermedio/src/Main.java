import platzi.play.contenido.Pelicula;
import platzi.play.contenido.TestProtected;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.utils.ScannerUtils;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static final String VERSION="1.0";
    public  static final String NAME="PLATZI CINEMAX";
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(NAME +" "+ VERSION);

        String titulo = ScannerUtils.capturarTexto("Ingresa el titulo");
        double duracion = ScannerUtils.capturarDecimal("Ingresa la duracion");
        String genero = ScannerUtils.capturarTexto("Ingresa el genero");


        Plataforma plataforma = new Plataforma(NAME);
        TestProtected pelicula = new TestProtected(titulo, genero, duracion, false);
        pelicula.calificar(4);
        pelicula.AsignarValorStatusPelicula(true);
        System.out.println(pelicula.obtenerFichaTecnica());

        Usuario usuario = new Usuario("Usuario 1","usuario1@gmail.com");
        usuario.verPelicula(pelicula);


        plataforma.agregar(pelicula);
        System.out.println("=======LISTADO DE PELICULAS=========");
        System.out.println("PELICULAS TOTAL: "+ plataforma.getContenido().size());
        plataforma.mostrarPeliculas();
        plataforma.eliminar(pelicula);
        System.out.println("PELICULAS DESPUES DE ELIMINAR");
        plataforma.mostrarPeliculas();



    }
}