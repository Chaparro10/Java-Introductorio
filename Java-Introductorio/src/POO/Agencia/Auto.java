package POO.Agencia;

public class Auto extends  Vehiculo{


    private String Tipo;

    public Auto(String marca, String modelo, int año, int kilometraje, boolean disponible, String tipo) {
        super(marca, modelo, año, kilometraje, disponible);
        Tipo = tipo;
    }


    public String getTipo() {
        return Tipo;
    }

    @Override
    void MostrarInfo() {

    }
}
