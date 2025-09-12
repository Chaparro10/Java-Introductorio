package platzi.play.contenido;

public class TestProtected  extends Contenido {
    public TestProtected(String titulo, Genero genero, double duracion, boolean disponible) {
        super(titulo, genero, disponible, duracion);
    }
    public  void AsignarValorStatusPelicula(boolean status){
            setDisponible(status);
    }

    @Override
    public void reproduciendo() {

    }

    @Override
    public String obtenerFichaTecnica() {
        return "";
    }
}
