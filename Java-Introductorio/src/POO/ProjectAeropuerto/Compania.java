package POO.ProjectAeropuerto;

public class Compania {

    private String nombre;
    private  Vuelo ListaVuelo[]= new Vuelo[2];
    private  int NumVuelo=0;

    public Compania(String nombre){
        this.nombre=nombre;
    }

    public Compania(String nombre, Vuelo[] listaVuelo) {
        this.nombre = nombre;
        ListaVuelo = listaVuelo;
        NumVuelo = listaVuelo.length;
    }

    public void InsertarVuelo(Vuelo vuelo){
        ListaVuelo[NumVuelo]=vuelo;
        NumVuelo++;
    }

    public String getNombre() {
        return nombre;
    }

    public Vuelo[] getListaVuelo() {
        return ListaVuelo;
    }

    public int getNumVuelo() {
        return NumVuelo;
    }

    public Vuelo getVueloIndice(int i){
        return  ListaVuelo[i];
    }
    public Vuelo getVueloIdentificador(String ID){
        boolean encontrado=false;
        Vuelo valor=null;
            for(int i=0;i<ListaVuelo.length;i++){
                    if(ID ==ListaVuelo[i].getIdentificador()){
                        encontrado=true;
                        valor=ListaVuelo[i];
                        break;
                    }
            }
            return valor;
    }
}
