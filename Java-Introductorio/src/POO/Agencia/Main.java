package POO.Agencia;

public class Main {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("Alquileres Rápidos", "Ciudad Central");

        // Crear y agregar vehículos
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 20000, true,"Sedan");
        Camioneta camioneta1 = new Camioneta("Ford", "Ranger", 2018, 50000, true,1000);
        agencia.agregarVehiculo(auto1);
        agencia.agregarVehiculo(camioneta1);

        // Crear clientes
        Cliente cliente1 = new Cliente("Kevin", "C001", 30, "ABC12345");
        Cliente cliente2 = new Cliente("Ana", "C002", 28, "XYZ67890");

        // Registrar clientes en la agencia
        agencia.registrarCliente(cliente1);
        agencia.registrarCliente(cliente2);

        // Mostrar vehículos disponibles
        agencia.mostrarVehiculosDisponibles();

        // Crear empleado
        Empleado empleado1 = new Empleado("Carlos", "E001", "Agente de Alquiler", 35000);

        // Gestionar alquileres
        empleado1.GestionarAlquiler(cliente1, auto1);

        // Registrar alquiler en la agencia
        Alquiler alquiler1 = new Alquiler(cliente1, auto1);
        agencia.registrarAlquiler(alquiler1);

        // Mostrar historial de alquileres
        agencia.mostrarHistorialAlquileres();
    }
}
