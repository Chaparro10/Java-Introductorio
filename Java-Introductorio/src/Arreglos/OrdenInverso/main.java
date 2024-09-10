package Arreglos.OrdenInverso;

import javax.swing.*;

public class main {
    public static void main(String []args){


        float []array = new float[5];

        for (int i=0;i<array.length;i++){
            float Valor= Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor"+(i+1)));

            array[i]=Valor;
        }

       for(int i= array.length -1; i>=0;i--){
           System.out.println(array[i]);
       }
    }
}
