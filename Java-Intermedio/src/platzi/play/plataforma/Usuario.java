package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

public class Usuario {
    private String nombre;
    private String email;


    public Usuario(){}

    public  Usuario(String nombre,String email){
            this.nombre=nombre;
            this.email=email;
    }

    public void verPelicula(Pelicula pelicula){
        System.out.println(nombre +" esta viendo...");
        pelicula.reproduciendo();
    }
}