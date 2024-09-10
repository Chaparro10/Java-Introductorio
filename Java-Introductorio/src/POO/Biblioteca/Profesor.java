package POO.Biblioteca;

public class Profesor extends  Persona{


    private String departamento;
    public Profesor(String nombre, String id,String depa) {
        super(nombre, id);
        this.departamento=depa;
    }



    @Override
    public void MostrarInfo() {
        System.out.println("Profesor:"+getNombre() +"ID:"+getId() +"Departamento:"+departamento);
    }
}
