package Arreglos.ArregloFormaPrimeroUltimo;

import javax.swing.*;

public class main {
    public static void main(String [] args ){


        int [] array= new int[10];

        for(int i=0;i<array.length;i++){
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));

            array[i]=valor;
        }

        //IMPRIMIR DE LA FORMA PRIMERO ULTIMO , SEGUNDO PENULTIMO

        int divisionArreglo=array.length/2;

        for(int i=0;i<divisionArreglo;i++){
            System.out.println("Combinacion="+array[i] + "-"+(array.length-i));

        }
    }
}
