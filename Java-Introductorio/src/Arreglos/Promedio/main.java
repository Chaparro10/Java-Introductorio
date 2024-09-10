package Arreglos.Promedio;

import javax.swing.*;

public class main {
    public static void main(String [] args ){



            int TotalArray= Integer.parseInt(JOptionPane.showInputDialog("Ingresa las vueltas"));


            float [] array = new float[TotalArray];


            for(int i=0;i<array.length;i++){
                float Valor = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor" + ( i+1)));

                array[i]=Valor;
            }

            double promedio=0;
            double sumatoria=0;
            int elemento= array.length;

        for (float valor :array
             ) {
                sumatoria +=valor;
        }
        promedio= sumatoria/elemento;
        System.out.println("El promedio,"+promedio);
    }
}
