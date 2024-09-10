package Condicionales.OrdenarNumeros;

import javax.swing.*;
import java.util.Arrays;

public class main {
    public static void main(String []args){



        int []array = new int[3];

            for(int i=0;i<array.length;i++){
                int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el num"+(i+1)));

                array[i]=num1;
            }




        int []aux = new int[3];


        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i]; // Inicializar aux con los valores originales
        }


        for (int i = 0; i < aux.length - 1; i++) {
            for (int j = i + 1; j < aux.length; j++) {
                if (aux[i] < aux[j]) {
                    int temp = aux[i];
                    aux[i] = aux[j];
                    aux[j] = temp;
                }
            }
        }

        // Imprimir el array ordenado
        for (int v : aux) {
            System.out.println("Valor: " + v);
        }




    }
}
