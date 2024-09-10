package POO.Biblioteca;

public class Estudiante  extends  Persona{



    private String carrera;

    public Estudiante(String nombre, String id,String carre) {
        super(nombre, id);
        this.carrera=carre;

    }

    @Override
    public void MostrarInfo() {
        System.out.println("Estudiante:"+getNombre() + "ID:"+getId() + "carrera"+carrera);
    }
}
