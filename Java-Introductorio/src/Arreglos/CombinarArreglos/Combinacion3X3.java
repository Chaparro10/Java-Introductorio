package Arreglos.CombinarArreglos;

import javax.swing.*;

public class Combinacion3X3 {

    public static void main(String [] args){
        int [] arrayA = new int[6];
        int [] arrayB = new int[6];
        int [] arrayCombinacion = new int[12];



        for (int i=0;i<6;i++){
            int ValorA=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor A"+(i+1)));
            arrayA[i]=ValorA;
            int ValorB=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor B"+(i+1)));
            arrayB[i]=ValorB;
        }

        //COMBINACION DE 3 X 3
        int contador=0;

        for(int i=0;i<6;i+=3){
            for(int j=0;j<3;j++){
                    arrayCombinacion[contador]=arrayA[i +j];
                    contador++;
            }
            for(int j=0;j<3;j++){
                arrayCombinacion[contador]=arrayB[i + j];
                contador++;
            }
        }

        System.out.println("Array resultante");
        for (int valor:arrayCombinacion
             ) {
            System.out.println(valor);
        }


    }
}
