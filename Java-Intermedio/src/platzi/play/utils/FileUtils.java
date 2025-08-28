package platzi.play.utils;

import platzi.play.contenido.Genero;
import platzi.play.contenido.Pelicula;
import platzi.play.contenido.TestProtected;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FileUtils {

    public static  void escribirArchivo(Pelicula contenido,String Separator){
        String linea = String.join(Separator,contenido.getTitulo(),
                String.valueOf(contenido.getDuracion()),
                contenido.getGenero().name(),
                String.valueOf(contenido.getCalificacion()),
                String.valueOf(contenido.getFechaEstreno()));

        try{
                Files.writeString(Paths.get("Java-Intermedio/contenido.txt"),
                        linea + System.lineSeparator(),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("Error escribiendo el archivo :"+ e.getMessage());
        }

    }

    public static List<Pelicula> leerContenido(String path,String Separator){
        List<Pelicula> contenidoDesdeArchivo= new ArrayList<>();

        try{
            List<String> lineas = Files.readAllLines(Paths.get(path));
            lineas.forEach(linea->{
                String[] datos = linea.split(Pattern.quote(Separator));

                if(datos.length==5){
                    String titulo=datos[0];
                    double duracion=Double.parseDouble(datos[1]);
                    Genero genero=Genero.valueOf(datos[2]);
                    double calificacion= datos[3].isBlank() ? 0 : Double.parseDouble(datos[3]);

                    TestProtected pelicula = new TestProtected(titulo, genero,duracion,true);
                    pelicula.calificar(calificacion);
                    contenidoDesdeArchivo.add(pelicula);
                }
            });
        } catch (
                IOException e) {
            System.out.println("Error leyendo el archivo "+ e);
        }
        return contenidoDesdeArchivo;
    }
}
