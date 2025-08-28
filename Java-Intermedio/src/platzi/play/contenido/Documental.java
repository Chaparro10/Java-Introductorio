package platzi.play.contenido;

public class Documental extends Contenido{
        private String narrador;


    public  Documental(String titulo, Genero genero, boolean disponible, double duracion){
        super(titulo, genero, disponible, duracion);
    }

    @Override
    public void reproduciendo() {
        System.out.println("Reproduciendo Documental");
    }

    @Override
    public String obtenerFichaTecnica() {
        return getTitulo() +"[" + getFechaEstreno().getYear() + "]" +" Genero: "+ getGenero() + " Duracion: "+ getDuracion() +" Calificicacion: "+ (getCalificacion() + " / 5" ) +" Estatus: "+ (isDisponible()==true ? "Disponible" : "No Disponible") +" Narrador:: "+ narrador;
    }

    public  Documental(String titulo, Genero genero, boolean disponible, double duracion,String narrador){
            super(titulo, genero, disponible, duracion);
            this.narrador=narrador;
    }

    public String getNarrador() {
        return narrador;
    }
}
