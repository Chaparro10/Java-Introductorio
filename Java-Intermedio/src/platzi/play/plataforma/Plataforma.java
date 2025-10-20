package platzi.play.plataforma;

import platzi.play.contenido.*;
import platzi.play.exception.PeliculaExistenteException;
import platzi.play.utils.FileUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Plataforma {
    private  String nombre;
    private List<Contenido> contenido;
    private Map<Contenido,Integer> vizualizaciones;

    public Plataforma(String nombre){
            this.nombre=nombre;
            this.contenido=new ArrayList<>();
            this.vizualizaciones= new HashMap<>();
    }

    public void reproducir(Contenido elemento){
       this.contarVisualizaciones(elemento);
       elemento.reproduciendo();
    }

    public void contarVisualizaciones(Contenido elemento){
            int conteoActual=vizualizaciones.getOrDefault(elemento,0);
            System.out.println(elemento.getTitulo() +" ha sido reproducido "+ conteoActual +" veces");
            vizualizaciones.put(elemento,conteoActual + 1);
    }

    public void agregar(Contenido elemento){
        Contenido contenido= this.buscarPorTitulo(elemento.getTitulo());
        if(contenido != null){
            throw  new PeliculaExistenteException(elemento.getTitulo());
        }

        FileUtils.escribirArchivo(elemento,"|");
        this.contenido.add(elemento);
    }

    public List<Contenido> getContenido(){
        return  contenido;
    }
    public void mostrarPeliculas(){
        System.out.println("TOTAL DE PELICULAS::: "+ contenido.stream().filter(s->s instanceof  Pelicula).count());
//        for(Pelicula element:contenido){
//            System.out.println("Pelicula: "+ element.obtenerFichaTecnica());
//        }

        //lambdas
        //contenido.forEach(contenido-> System.out.println("Pelicula: "+ contenido.obtenerFichaTecnica()));


        List<Pelicula> peliculas= contenido.stream().filter(s-> s instanceof  Pelicula).map(f->(Pelicula) f)
                .toList();
        peliculas.forEach(contenido-> System.out.println("Pelicula::::"+ contenido.obtenerFichaTecnica()));
    }

    public void mostrarDocumentales(){
        System.out.println("TOTAL DE DOCUMENTALES::: "+ contenido.stream().filter(s->s instanceof Documental).count());
        List<Documental> documentals= contenido.stream().filter(s-> s instanceof  Documental).map(f->(Documental) f)
                .toList();
        documentals.forEach(contenido-> System.out.println("Documental:::: "+ contenido.obtenerFichaTecnica()));
    }

    public List<ResumenContenido> getResumenes(){
        return contenido.stream().map(c ->new ResumenContenido(c.getTitulo(),c.getDuracion(),c.getGenero())).toList();
    }
    public void eliminar(Contenido element){
        this.contenido.remove(element);
        System.out.println("Pelicula eliminada: "+ element.obtenerFichaTecnica());
    }
    public Contenido buscarPorTitulo(String titulo){
//        for(Pelicula element:contenido){
//            if(element.getTitulo().equalsIgnoreCase(titulo)){
//                return element;
//            }
//        }
//        return  null;
        //con stream
       return contenido.stream().filter(s->s.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);
    }

    public  List<String> buscarPorGenero(Genero genero){
        List<String> titulos = contenido.stream()
                .filter(s -> s.getGenero().equals(genero))
                .map(Contenido::getTitulo)   // convierte cada Pelicula a su String titulo
                .collect(Collectors.toList());
        return titulos;
    }

    public double totalDuracionContenido(){
        return contenido.stream().mapToDouble(s->s.getDuracion()).sum();
    }

    public List<Contenido> getPopulares(){
        return  contenido.stream().sorted(Comparator.comparingDouble(Contenido::getCalificacion).reversed())
                .toList();
//        return contenido.stream().filter(s->s.getCalificacion()>3)
//                .map(Pelicula::obtenerFichaTecnica)
//                .toList();
    }

    public String getPeliculaLarga(){
        return  contenido.stream().sorted(Comparator.comparingDouble(Contenido::getDuracion).reversed()).map(Contenido::obtenerFichaTecnica).findFirst().orElse(null);
    }
    public String getPeliculaCorta(){
        return  contenido.stream().sorted(Comparator.comparingDouble(Contenido::getDuracion)).map(Contenido::obtenerFichaTecnica).findFirst().orElse(null);
    }

    public List<Contenido> getPeliculasConMismaDuracion() {
        return contenido.stream()
                .collect(Collectors.groupingBy(Contenido::getDuracion))
                .values().stream()
                .filter(lista -> lista.size() > 1)   // solo duraciones repetidas
                .flatMap(List::stream)               // aplana
                .collect(Collectors.toList());
    }


    public Contenido masVistas(){
        int maxReproducciones=0;
        Contenido maxReproducida=null;
            for(Map.Entry<Contenido,Integer> entry:vizualizaciones.entrySet()){
                if(entry.getValue()>maxReproducciones){
                    maxReproducciones=entry.getValue();
                    maxReproducida=entry.getKey();
                }
            }
            return  maxReproducida;
    }

    public void getContenidoPromocionable(){
        List<Promocinable> promocinables= contenido.stream().filter(s->s instanceof  Promocinable)
                .map(f->(Promocinable) f)
                .toList();
        promocinables.forEach(s-> System.out.println(s.promocionar()));

    }
    //METODOS DE PRACTICA (SE HICIERON EN OTRO PROYECTO)
    /*


    //Obtener todas las películas ordenadas por título alfabéticamente.
    public List<Pelicula> getAllOrdenadas(){
        return contenido.stream().sorted(Comparator.comparing(Pelicula::getTitulo)).toList();
    }
   // Contar cuántas películas tienen una duración menor a 90 minutos.

    public int getCountDuracionMenor90(){
        return (int) contenido.stream().filter(p->p.getDuracion()<90).count();
    }

    //Verificar si existe alguna película con calificación mayor a 9
    public void verificarCalificacionMayor9(){
        boolean existe = contenido.stream().anyMatch(p -> p.getCalificacion() > 9);
        if (existe) {
            System.out.println("Sí existen películas con calificación mayor a 9");
        }
    }

    //Obtener una lista de todos los géneros únicos presentes en la plataforma.
    public List<String> getAllGeneros(){
        return contenido.stream()
                .map(Pelicula::getGenero)
                .distinct()
                .toList();
    }


    //Obtener el título de todas las películas en mayúsculas
    public List<String> getAllTituloMayusculas(){
        return  contenido.stream().map(p->p.getTitulo().toUpperCase()).toList();
    }
    //Filtrar las películas que tienen una palabra específica en el título
    public List<Pelicula> getAllByPalabra(String palabra){
        return  contenido.stream().filter(p->p.getTitulo().contains(palabra)).toList();
    }

    //Agrupar las películas por género en un Map
    public Map<String, List<Pelicula>> agrupacionPorGenero(){
        return contenido.stream()
                .collect(Collectors.groupingBy(Pelicula::getGenero));
    }

    //Sumar la duración total solo de las películas de un género específico
    public double getDuracionGenero(String genero){
        return  contenido.stream()
                .filter(p->p.getGenero().equalsIgnoreCase(genero))
                .mapToDouble(p->p.getDuracion()).sum();
    }

    //Obtener las tres películas peor calificadas
    public List<Pelicula> getTop3Peor(){
        return  contenido.stream().sorted(Comparator.comparing(pelicula -> pelicula.getCalificacion())).limit(3).toList();
    }

    //Obtener una lista de películas cuyo título comienza con una letra específica
    public List<Pelicula> getAllWithFirstCharacter(String caracter){
        return  contenido.stream().filter(p->p.getTitulo().startsWith(caracter)).toList();
    }


    //Verificar si todas las películas tienen una duración mayor a un valor dado
    public void verificarDuracion(double duracion){
        boolean todas = contenido.stream()
                .allMatch(p->p.getDuracion()>duracion);

        if(todas){
            System.out.println("Todas la peliculas son mayor a esa duracion");
        }
    }

    //Obtener el promedio de calificación por género
    public Map<String,Double> getAllPromedioByGenero(){
        return contenido.stream().collect(Collectors.groupingBy(
                Pelicula::getGenero,                     // Agrupar por género
                Collectors.averagingDouble(Pelicula::getCalificacion) // Promedio de calificación
        ));
    }

    //Contar cuántas películas hay por género
    public Map<String,Long> getCountByGenere(){
        return contenido.stream().collect(Collectors.groupingBy(
                Pelicula::getGenero,                     // Agrupar por género
                Collectors.counting()// contar
        ));
    }

    //Obtener los títulos de películas únicos ordenados alfabéticament
    public List<Pelicula> getUnicos(){
        return  contenido.stream().distinct().sorted(Comparator.comparing(Pelicula::getTitulo)).toList();
    }

    //Obtener un conjunto (Set) de todas las calificaciones únicas existentes
    public Set<Double> getCalificacionesUnicas() {
        return contenido.stream()
                .map(Pelicula::getCalificacion)
                .collect(Collectors.toSet());
    }


    
    */

}
