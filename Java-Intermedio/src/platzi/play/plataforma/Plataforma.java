package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Plataforma {
    private  String nombre;
    private List<Pelicula> contenido;

    public Plataforma(String nombre){
            this.nombre=nombre;
            this.contenido=new ArrayList<>();
    }

    public void agregar(Pelicula elemento){
        this.contenido.add(elemento);
    }

    public List<Pelicula> getContenido(){
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
    public void eliminar(Pelicula element){
        this.contenido.remove(element);
        System.out.println("Pelicula eliminada: "+ element.obtenerFichaTecnica());
    }
    public Pelicula buscarPorTitulo(String titulo){
//        for(Pelicula element:contenido){
//            if(element.getTitulo().equalsIgnoreCase(titulo)){
//                return element;
//            }
//        }
//        return  null;
        //con stream
       return contenido.stream().filter(s->s.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);
    }

    public  List<String> buscarPorGenero(String genero){
        List<String> titulos = contenido.stream()
                .filter(s -> s.getGenero().equalsIgnoreCase(genero))
                .map(Pelicula::getTitulo)   // convierte cada Pelicula a su String titulo
                .collect(Collectors.toList());
        return titulos;
    }
}
