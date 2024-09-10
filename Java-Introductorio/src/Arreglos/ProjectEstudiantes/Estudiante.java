package Arreglos.ProjectEstudiantes;

public class Estudiante {

    private String Nombre;
    private int Matricula;
    private int Nota1;
    private int Nota2;
    private int Nota3;
    public Estudiante(String nombre,int matricula,int Nota1,int Nota2,int Nota3){
        this.Nombre=nombre;
        this.Matricula=matricula;
        this.Nota1=Nota1;
        this.Nota2=Nota2;
        this.Nota3=Nota3;
    }


    public double Promedio(){
        int promedio=(Nota1+Nota2+Nota3)/3;
        return promedio;
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + Nombre + '\'' +
                ", Matricula=" + Matricula +
                '}';
    }
}
