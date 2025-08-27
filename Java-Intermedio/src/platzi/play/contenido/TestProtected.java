package platzi.play.contenido;

public class TestProtected  extends Pelicula{
    public TestProtected(String titulo, String genero, double duracion, boolean disponible) {
        super(titulo, genero, duracion, disponible);
    }
    public  void AsignarValorStatusPelicula(boolean status){
            setDisponible(status);
    }
}
