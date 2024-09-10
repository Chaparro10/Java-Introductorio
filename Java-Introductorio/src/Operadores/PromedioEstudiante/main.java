package Operadores.PromedioEstudiante;

import javax.swing.*;
import java.sql.Array;

public class main {
    public static void main(String []args) {


        int totalVuelta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de registros"));
       // int[] array = new int [totalVuelta];

        estudiante [] array = new estudiante[totalVuelta];


        for (int i=0 ;i<array.length;i++) {


            String Nombre =JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
            int cal1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion 1"));
            int cal2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion 2"));
            int cal3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion 3"));
            int cal4=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion 4"));

            estudiante  e = new estudiante(Nombre,cal1,cal2,cal3,cal4);

            array[i]=e;
        }

        for (estudiante valor: array
             ) {
            System.out.println(valor.Promediar());
        }

    }
}
