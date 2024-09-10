package POO.ProjectAeropuerto;

public class AeropuertoPrivado extends  Aeropuerto{


    private String [] listaempresas = new String[10];
    private int numEmpresa;
    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compania[] listaCompania, String[] empresas, int numEmpresa) {
        super(nombre, ciudad, pais, listaCompania);
        this.listaempresas = empresas;
        this.numEmpresa = empresas.length;
    }

    public void insertarEmpresas(String empresa[ ]){
            this.listaempresas=empresa;
            this.numEmpresa=empresa.length;
    }

    public String[] getListaempresas() {
        return listaempresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }

    public  void insertarEmpresa(String e){
            listaempresas[numEmpresa]=e;
            numEmpresa++;
    }


}
