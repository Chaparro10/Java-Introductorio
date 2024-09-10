package POO.Hospital;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String []args){

        Hospital h1 = new Hospital("LA","CLN");
        Doctor d1 = new Doctor("Pablo","123",34,"MM","MLC");
        Paciente p1 = new Paciente("Pedro","123",25,"Ninguno");

        h1.agregarDoctor(d1);
        h1.registrarPaciente(p1);

        Cita cita1 = new Cita(p1, d1, LocalDateTime.now(), "Chequeo de rutina");
        h1.ProgramarCita(cita1);

        System.out.println(h1);

        //RECETAR MEDICAMENTO
        RecetaMedica receta1 = new RecetaMedica(d1, p1, "Tomar un comprimido cada 8 horas.");
        receta1.agregarMedicamentoReceta("Paracetamol");
        receta1.agregarMedicamentoReceta("Ibuprofeno");
        d1.RecertarMedicamento(p1, receta1);


    }
}
