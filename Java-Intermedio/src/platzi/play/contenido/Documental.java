package platzi.play.contenido;

public class Documental extends Contenido{
        private String narrador;


    public  Documental(String titulo, Genero genero, boolean disponible, double duracion){
        super(titulo, genero, disponible, duracion);
    }
    public  Documental(String titulo, Genero genero, boolean disponible, double duracion,String narrador){
            super(titulo, genero, disponible, duracion);
            this.narrador=narrador;
    }

    public String getNarrador() {
        return narrador;
    }
}
