package platzi.play.contenido;

import java.time.LocalDate;

public class Pelicula {

    public String titulo;
    public String descripcion;
    public double duracion;
    public String genero;
    public LocalDate fechaEstreno;
    public double calificacion;
    public boolean disponible;


    public Pelicula(){}
    public Pelicula(String titulo, String descripcion, String genero, double calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    public void reproduciendo(){
        System.out.println("Reproduciendo: " + titulo);
    }

    public  String obtenerFichaTecnica(){
        return titulo +"[" + fechaEstreno.getYear() + "]" +" Genero: "+ genero + " Duracion: "+ duracion +" Calificicacion: "+ (calificacion + " / 5" ) +" Estatus: "+ (disponible==true ? "Disponible" : "No Disponible");
    }

    public void calificar(double calificacion){
            if(calificacion>=0 && calificacion<=5){
                this.calificacion=calificacion;
            }
    }




}
