package POO.ProjectAeropuerto;

public class Vuelo {

    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;

    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private pasajero listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros=0;
        this.listaPasajeros = new pasajero[numMaxPasajeros];
    }

    public void insertarPasajero(pasajero pasajerova){
            listaPasajeros[numActualPasajeros]=pasajerova;
            numActualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    public pasajero[] getListaPasajeros() {
        return listaPasajeros;
    }

    //Obtener pasajero por iterador
    public pasajero getPasajeroIterador(int i){
        return listaPasajeros[i];
    }
    //Obtener pasajero en base al passport
    public pasajero getPasajeroPassport(String passport){
        boolean encontrado=false;
        pasajero valor=null;
        for (int i=0;i<listaPasajeros.length;i++) {
            if (listaPasajeros[i].getPasaporte() == passport){
                encontrado=true;
                valor=listaPasajeros[i];
                break;
            }
        }

        return valor;
    }

}
