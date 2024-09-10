package POO.Agencia;

public class Camioneta extends Vehiculo{

    private int CapacidadCarga;

    public Camioneta(String marca, String modelo, int año, int kilometraje, boolean disponible, int capacidadCarga) {
        super(marca, modelo, año, kilometraje, disponible);
        this.CapacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    @Override
    void MostrarInfo() {

    }
}
