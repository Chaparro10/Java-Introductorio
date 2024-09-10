package Arreglos.LlenarArreglo;

import javax.swing.*;

public class main {
    public static void main(String []args){


            int Elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingresa los elementos"));

            char [] array =  new char[Elemento];

            for (int i=0;i<array.length;i++){
                    char ele = JOptionPane.showInputDialog("Ingresa el caracter"+(i+1)).charAt(0);

                    array[i]=ele;
            }

        for (char e: array
             ) {
            System.out.println(e);
        }
    }
}
