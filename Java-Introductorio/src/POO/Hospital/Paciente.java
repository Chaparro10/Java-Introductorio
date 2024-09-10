package POO.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona{

    String HistorialClinico ;
     List<String> enfermedaPreeexistente;

    public Paciente(String nombre, String id, int edad, String historialClinico) {
        super(nombre, id, edad);
        HistorialClinico = historialClinico;
        this.enfermedaPreeexistente = new ArrayList<>();
    }

    public void agregarEnfermedadPreexistente(String enfermedad) {
        enfermedaPreeexistente.add(enfermedad);
    }
    public String getHistorialClinico() {
        return HistorialClinico;
    }

    public List<String> getEnfermedaPreeexistente() {
        return enfermedaPreeexistente;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Paciente"+getNombre());
    }

    @Override
    public String toString() {
        return "Paciente{"+ getNombre() +" HistorialClinico='" + HistorialClinico + '\'' +
                ", enfermedaPreeexistente=" + enfermedaPreeexistente +
                '}';
    }
}
