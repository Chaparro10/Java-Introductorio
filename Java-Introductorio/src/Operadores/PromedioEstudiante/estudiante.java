package Operadores.PromedioEstudiante;

public class estudiante {

    private String Nombre;
    private int Cal1;
    private int Cal2;
    private int Cal3;
    private int Cal4;

    public estudiante(String nombre, int cal1, int cal2, int cal3, int cal4) {
        this.Nombre = nombre;
        this.Cal1 = cal1;
        this.Cal2 = cal2;
        this.Cal3 = cal3;
        this.Cal4 = cal4;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCal1() {
        return Cal1;
    }

    public void setCal1(int cal1) {
        Cal1 = cal1;
    }

    public int getCal2() {
        return Cal2;
    }

    public void setCal2(int cal2) {
        Cal2 = cal2;
    }

    public int getCal3() {
        return Cal3;
    }

    public void setCal3(int cal3) {
        Cal3 = cal3;
    }

    public int getCal4() {
        return Cal4;
    }

    public void setCal4(int cal4) {
        Cal4 = cal4;
    }

    public String Promediar(){
        double valor1=0.10;
        double valor2=0.25;
        double valor3=0.25;
        double valor4=0.40;

        double promedio=(Cal1 * valor1) + (Cal2* valor2) + (Cal3*valor3) +(Cal4 * valor4);
        return " estudiante" +
                "Nombre="+Nombre + ",Promedio="+ promedio;
    }

    @Override
    public String toString() {
        return "estudiante{" +
                "Nombre='" + Nombre + '\'' +
                ", Cal1=" + Cal1 +
                ", Cal2=" + Cal2 +
                ", Cal3=" + Cal3 +
                ", Cal4=" + Cal4 +
                '}';
    }
}
