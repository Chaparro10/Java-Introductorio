package POO.Hospital;

public class Doctor extends  Persona {

    private  String especialidad;
    private String Licencia;

    public Doctor(String nombre, String id, int edad, String especialidad, String licencia) {
        super(nombre, id, edad);
        this.especialidad = especialidad;
        this.Licencia = licencia;
    }


    public void RecertarMedicamento(Paciente paciente , RecetaMedica receta){
        System.out.println("Recetando al paciente "+paciente.getNombre());
    }
    @Override
    public void MostrarInfo() {

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getLicencia() {
        return Licencia;
    }
}
