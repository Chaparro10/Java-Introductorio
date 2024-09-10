package POO.Agencia;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String id;
    private int edad;
    private  String Licencia;

    private List<Alquiler> alquilerList;


    public Cliente(String nombre, String id, int edad, String licencia) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.Licencia = licencia;
        this.alquilerList= new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getLicencia() {
        return Licencia;
    }

    public List<Alquiler> getAlquilerList() {
        return alquilerList;
    }

    public void AgregarAlquiler(Alquiler alquilers){
            alquilerList.add(alquilers);
        System.out.println("Alquiler agregado correctamente");
    }

    public void mostrarInfo(){
        System.out.println("cliente:"+nombre +"Licencia"+Licencia);
    }
}
