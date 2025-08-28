package platzi.play.plataforma;

import platzi.play.contenido.Contenido;
import platzi.play.contenido.Genero;
import platzi.play.contenido.ResumenContenido;
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
        System.out.println("TOTAL DE PELICULAS::: "+ contenido.size());
//        for(Pelicula element:contenido){
//            System.out.println("Pelicula: "+ element.obtenerFichaTecnica());
//        }

        //lambdas
        contenido.forEach(contenido-> System.out.println("Pelicula: "+ contenido.obtenerFichaTecnica()));
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

}
