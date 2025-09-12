package platzi.play.utils;

import platzi.play.contenido.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FileUtils {

    public static  void escribirArchivo(Contenido contenido, String Separator){
        String linea = String.join(Separator,contenido.getTitulo(),
                String.valueOf(contenido.getDuracion()),
                contenido.getGenero().name(),
                String.valueOf(contenido.getCalificacion()),
                String.valueOf(contenido.getFechaEstreno()));

        try{
            String lineaFinal;

            if(contenido instanceof Documental documental){
                    lineaFinal="DOCUMENTAL" + Separator + linea + Separator + documental.getNarrador();
            }else{
                lineaFinal ="PELICULA" + Separator + linea;
            }

                Files.writeString(Paths.get("Java-Intermedio/contenido.txt"),
                        lineaFinal + System.lineSeparator(),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("Error escribiendo el archivo :"+ e.getMessage());
        }

    }

    public static List<Contenido> leerContenido(String path, String Separator){
        List<Contenido> contenidoDesdeArchivo= new ArrayList<>();

        try{
            List<String> lineas = Files.readAllLines(Paths.get(path));
            lineas.forEach(linea->{
                String[] datos = linea.split(Pattern.quote(Separator));

                String tipoContenido=datos[0];

                if(("PELICULA".equalsIgnoreCase(tipoContenido) && datos.length==6) || ("DOCUMENTAL".equalsIgnoreCase(tipoContenido) && datos.length==7)){
                    String titulo=datos[1];
                    double duracion=Double.parseDouble(datos[2]);
                    Genero genero=Genero.valueOf(datos[3]);
                    double calificacion= datos[4].isBlank() ? 0 : Double.parseDouble(datos[4]);

                    Contenido contenido;

                    if("PELICULA".equalsIgnoreCase(tipoContenido)){
                        contenido = new Pelicula(titulo,genero,true,duracion);
                        contenido.calificar(3);
                    }else{
                        String narrador=datos[6];
                        contenido = new Documental(titulo,genero,true,duracion,narrador);
                        contenido.calificar(3);
                    }

//                    TestProtected pelicula = new TestProtected(titulo, genero,duracion,true);
//                    pelicula.calificar(calificacion);
                    contenidoDesdeArchivo.add(contenido);
                }
            });
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo "+ e);
        }
        return contenidoDesdeArchivo;
    }
}
