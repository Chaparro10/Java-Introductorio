package platzi.play.contenido;

public class Pelicula extends Contenido{


    public Pelicula(String titulo, Genero genero, boolean disponible, double duracion){
        super(titulo, genero, disponible, duracion);
    }

    @Override
    public void reproduciendo() {
        System.out.println("Reproduciendo Pelicula");
    }

    @Override
    public String obtenerFichaTecnica() {
        return getTitulo() +"[" + getFechaEstreno().getYear() + "]" +" Genero: "+ getGenero() + " Duracion: "+ getDuracion() +" Calificicacion: "+ (getCalificacion() + " / 5" ) +" Estatus: "+ (isDisponible()==true ? "Disponible" : "No Disponible");
    }
}
