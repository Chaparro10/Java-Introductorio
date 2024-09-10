package POO.ProjectAeropuerto;

public class pasajero {

    private  String nombre;
    private  String pasaporte;
    private  String nacionalidad;

    public pasajero(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }



    public String getPasaporte() {
        return pasaporte;
    }



    public String getNacionalidad() {
        return nacionalidad;
    }



    @Override
    public String toString() {
        return "pasajero{" +
                "nombre='" + nombre + '\'' +
                ", pasaporte='" + pasaporte + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
