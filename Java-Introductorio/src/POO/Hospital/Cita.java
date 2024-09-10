package POO.Hospital;

import java.time.LocalDateTime;

public class Cita {

    private Paciente paciente;
    private Doctor doctor;
    private LocalDateTime fechaHora;
    private String motivoConsulta;

    public Cita(Paciente paciente, Doctor doctor, LocalDateTime fechaHora, String motivoConsulta) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fechaHora = fechaHora;
        this.motivoConsulta = motivoConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "paciente=" + paciente +
                ", doctor=" + doctor +
                ", fechaHora=" + fechaHora +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                '}';
    }
}
