package POO.Hospital;

import java.util.ArrayList;
import java.util.List;

public class RecetaMedica {

    private Doctor doctor;
    private Paciente paciente;

    private List<String> medicamentos;
    private String indicaciones;

    public RecetaMedica(Doctor doctor, Paciente paciente,  String indicaciones) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.medicamentos = new ArrayList<>();
        this.indicaciones = indicaciones;
    }

    public void agregarMedicamentoReceta(String medicamento){
        medicamentos.add(medicamento);
        System.out.println("Medicamento agregado correctamente");
    }

    public void MostrarInfo(){
        System.out.println("Medicamento:"+medicamentos +"Paciente"+paciente +"Doctor"+doctor);
    }
}
