package POO.Agencia;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private String ubicacion;
    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;
    private List<Empleado> empleados;
    private List<Alquiler> alquileres;

    public Agencia(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public void mostrarVehiculosDisponibles() {
        System.out.println("Vehículos disponibles en " + nombre + ":");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.isDisponible()) {
                System.out.println(vehiculo);
            }
        }
    }

    public void mostrarHistorialAlquileres() {
        System.out.println("Historial de Alquileres en " + nombre + ":");
        for (Alquiler alquiler : alquileres) {
            alquiler.mostrarInfo();
            System.out.println();
        }
    }
}
