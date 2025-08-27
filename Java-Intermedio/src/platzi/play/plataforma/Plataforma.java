package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;

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
        for(Pelicula element:contenido){
            System.out.println("Pelicula: "+ element.obtenerFichaTecnica());
        }
    }
    public void eliminar(Pelicula element){
            this.contenido.remove(element);
        System.out.println("Pelicula eliminada: "+ element.obtenerFichaTecnica());
    }
}
