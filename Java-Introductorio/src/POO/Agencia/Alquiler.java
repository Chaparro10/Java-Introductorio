package POO.Agencia;

import java.time.LocalDate;

public class Alquiler {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double montoTotal;

    public Alquiler(Cliente cliente, Vehiculo vehiculo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = LocalDate.now();
        this.fechaFin = fechaInicio.plusDays(7); // un alquiler de 7 días
        this.montoTotal = calcularMonto();
    }

    public double calcularMonto() {
        // Monto base por día por vehículo, puede ser más complejo en una implementación real
        double montoPorDia = 50.0;
        return montoPorDia * (fechaFin.toEpochDay() - fechaInicio.toEpochDay());
    }

    public void mostrarInfo() {
        System.out.println("Alquiler:");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Vehículo: " + vehiculo.getModelo());
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Fin: " + fechaFin);
        System.out.println("Monto Total: $" + montoTotal);
    }
}
