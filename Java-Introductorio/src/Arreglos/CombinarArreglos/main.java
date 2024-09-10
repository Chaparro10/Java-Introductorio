package Arreglos.CombinarArreglos;

import javax.swing.*;

public class main {
    public static void main(String [] args){


        /**
         *Problema:Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma
         * 1A , 1B
         *
         *
         */


        int [] arrayA = new int[5];
        int [] arrayB= new int[5];
        int [] combinacion= new int[10];

        for(int i=0;i<5;i++){

                int valorA=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del arrayA"+(i+1)));
                arrayA[i]=valorA;
                int valorB=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del arrayB"+(i+1)));
                arrayB[i]=valorB;



        }
        //Aqui se hace la combinacion

        int contador=0;
        for (int i=0;i<5;i++){
                combinacion[contador]=arrayA[i];
                contador++;
                combinacion[contador]=arrayB[i];
                contador++;
        }

        for (int valor:combinacion
             ) {
            System.out.println(valor);
        }

    }
}
