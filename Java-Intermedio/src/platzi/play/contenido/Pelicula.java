package platzi.play.contenido;

import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private String descripcion;
    private double duracion;
    private Genero genero;
    private LocalDate fechaEstreno=LocalDate.now();
    private double calificacion;
    private boolean disponible;

/*
    *********** private ***************
    Acceso más restringido.
    Solo se puede acceder dentro de la misma clase.
    Ni siquiera una subclase o una clase del mismo paquete puede verlo.
    Se usa mucho para atributos y para métodos que no deben ser usados desde fuera.
 */




    public Pelicula(){}
    public Pelicula(String titulo, Genero genero,boolean disponible, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.disponible=disponible;
        this.duracion=duracion;
    }

    public void reproduciendo(){
        System.out.println("Reproduciendo: " + titulo);
    }

    public  String obtenerFichaTecnica(){
        System.out.println("========status======="+disponible);
        return titulo +"[" + fechaEstreno.getYear() + "]" +" Genero: "+ genero + " Duracion: "+ duracion +" Calificicacion: "+ (calificacion + " / 5" ) +" Estatus: "+ (disponible==true ? "Disponible" : "No Disponible");
    }

    public void calificar(double calificacion){
            if(calificacion>=0 && calificacion<=5){
                this.calificacion=calificacion;
            }
    }
    public boolean isDisponible(){
        return this.disponible;
    }
    protected void setDisponible(boolean status){
        this.disponible=status;
    }

    public String getTitulo() {
        return titulo;
    }
    public Genero getGenero() {
        return genero;
    }

    public double getDuracion() {
        return duracion;
    }
    public double getCalificacion() {
        return calificacion;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }
}
