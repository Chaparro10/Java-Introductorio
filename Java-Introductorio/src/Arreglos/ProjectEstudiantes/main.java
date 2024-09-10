package Arreglos.ProjectEstudiantes;

import javax.swing.*;

public class main {
    public static void main(String []args){


            Estudiante [] array = new Estudiante[2];

            for (int i=0;i<2;i++){
                String nombre=JOptionPane.showInputDialog("Ingresa el nombre");
                int matricula=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la matrixula"));
                int valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota"));
                int valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota 2"));
                int valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota 3"));
                Estudiante estudiante = new Estudiante(nombre,matricula,valor,valor1,valor2);
                array[i]=estudiante;
            }

        System.out.println("Valoress ingresados");
        for (Estudiante e:array
             ) {
            System.out.println("Promedio por alumno:"+ e+ "-"+e.Promedio());
        }
    }
}
