package POO.Agencia;

abstract class Vehiculo {
    private String marca;
    private String Modelo;
    private int año;
    private int Kilometraje ;

    private boolean disponible;


    public Vehiculo(String marca, String modelo, int año, int kilometraje, boolean disponible) {
        this.marca = marca;
         this.Modelo = modelo;
        this.año = año;
        this.Kilometraje = kilometraje;
        this.disponible = true;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAño() {
        return año;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void marcarComoAlquilado(){
        disponible=false;
    }
    public void marcarComoDisponible(){
        disponible=true;
    }

    abstract void MostrarInfo();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", año=" + año +
                ", Kilometraje=" + Kilometraje +
                ", disponible=" + disponible +
                '}';
    }
}
