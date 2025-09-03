package Arreglos;

import javax.swing.*;

//PROBLEMA
/*
* Ingresar 6 calificaciones de un alumno en un arreglo
* despues mostraremos  las calificaciones aprobadas
* y tambien mostrar cuantos se aprobaron
* */
public class arreglos {
    public  static  double aprobatoria=7.0;
    public static void main(String[] args) {

        double arreglo[]=new double[3];
        int contadorAprobadas=0;

        //llenar el array
        for (int i=0;i<arreglo.length;i++){
                arreglo[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la calificacion "+ (i +1)));
        }

        //mostrar calificaciones aprobatorias
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]>=aprobatoria){
                contadorAprobadas++;
                System.out.println("Calificacion::: "+arreglo[i]);
            }
        }

        System.out.println("TOTAL DE APROBADAS::: "+ contadorAprobadas);





    }
}