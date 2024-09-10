package POO.Restaurante;

public class Empleado extends Persona {

    private double Sueldo;
    private String Puesto;

    public Empleado(String nombre, String id, double sueldo, String puesto) {
        super(nombre, id);
        this.Sueldo = sueldo;
        this.Puesto = puesto;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Empleado:"+ getNombre() +"Puesto:"+Puesto + "Sueldo :"+Sueldo);
    }
}
