package POO.Agencia;

public class Empleado {

    private String nombre;
    private String id;
    private String puesto;
    private int Salario;

    public Empleado(String nombre, String id, String puesto, int salario) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.Salario = salario;
    }


    public void GestionarAlquiler(Cliente cte , Vehiculo ve){
            if(ve.isDisponible()){
                ve.marcarComoAlquilado();

                Alquiler alquiler = new Alquiler(cte,ve);
                cte.AgregarAlquiler(alquiler);
                System.out.println("Agregado correctamente");
            }else{
                System.out.println("El vehículo " + ve.getModelo() + " no está disponible.");
            }
            }



    }


