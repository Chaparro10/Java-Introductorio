package platzi.play.plataforma;

import platzi.play.contenido.Contenido;

public class Usuario {
    private String nombre;
    private String email;


    public Usuario(){}

    public  Usuario(String nombre,String email){
            this.nombre=nombre;
            this.email=email;
    }

    public void verPelicula(Contenido contenido){
        System.out.println(nombre +" esta viendo...");
        contenido.reproduciendo();
    }
}