import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import platzi.play.utils.ScannerUtils;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("PLATZI PLAY!");

            String titulo = ScannerUtils.capturarTexto("Ingresa el titulo");
        double duracion = ScannerUtils.capturarDecimal("Ingresa la duracion");
        String genero = ScannerUtils.capturarTexto("Ingresa el genero");

        Pelicula pelicula = new Pelicula();

        pelicula.titulo=titulo;
        pelicula.duracion=duracion;
        pelicula.fechaEstreno= LocalDate.now();
        pelicula.disponible=true;
        pelicula.genero=genero;
        pelicula.calificar(4);

        System.out.println(pelicula.obtenerFichaTecnica());


        Usuario usuario = new Usuario("Usuario 1","usuario1@gmail.com");

        usuario.verPelicula(pelicula);

    }
}