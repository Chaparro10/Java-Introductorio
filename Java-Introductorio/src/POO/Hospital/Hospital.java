package POO.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String Nombre;
    private String Direccion;
    private List<Paciente> listpacientes;
    private List<Doctor> listdoctores;

    private List<Cita> listCitas;


    public Hospital(String nombre, String direccion) {
        Nombre = nombre;
        Direccion = direccion;
        this.listpacientes = new ArrayList<>();
        this.listdoctores = new ArrayList<>();
        this.listCitas = new ArrayList<>();
    }

    public void registrarPaciente(Paciente paciente){

            listpacientes.add(paciente);
        System.out.println("Paciente agregado correctamente");

    }
    public void agregarDoctor(Doctor doctor){
        listdoctores.add(doctor);
        System.out.println("Doctor agregado correctamente");
    }


    public void ProgramarCita(Cita cita){
            listCitas.add(cita);
    }

    public  void MostrarCitasPorPaciente(Paciente paciente){
        for (Paciente pa: listpacientes
             ) {
            if (pa.equals(paciente)){

            }
        }
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", listpacientes=" + listpacientes +
                ", listdoctores=" + listdoctores +
                ", listCitas=" + listCitas +
                '}';
    }
}
