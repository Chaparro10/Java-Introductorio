package POO.ProjectAeropuerto;

import javax.print.DocFlavor;

public class Aeropuerto {

    private String nombre;
    private String ciudad;
    private String pais;
    private Compania ListaCompania[] = new Compania[2];
    private int numCompania;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Compania[] listaCompania) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.ListaCompania = listaCompania;
        this.numCompania = listaCompania.length;
    }

    public void insertarCompania(Compania compania){
        System.out.println("Aqui "+ListaCompania);
        ListaCompania[numCompania]=compania;
        numCompania++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compania[] getListaCompania() {
        return ListaCompania;
    }

    public int getNumCompania() {
        return numCompania;
    }

    public Compania getCompaniaIndice(int i){
        return  ListaCompania[i];
    }

    public Compania getCompaniaNombre(String Nombre){
        boolean encontrado=false;
        Compania valor=null;
        for(int i=0;i<ListaCompania.length;i++){
            System.out.println("Aquii 2"+ ListaCompania[i].getNombre());
            if(Nombre.equals(ListaCompania[i].getNombre())){
                encontrado=true;
                valor=ListaCompania[i];
                break;

            }
        }

        return  valor;
    }
}
