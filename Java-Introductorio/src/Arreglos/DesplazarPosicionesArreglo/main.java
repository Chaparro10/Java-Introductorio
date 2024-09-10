package Arreglos.DesplazarPosicionesArreglo;

import javax.swing.*;

public class main {
    public static void main(String []args){


            //DESPLAZAR POSICIONES DE UN ARREGLO

        int []array = new int[10];

        for(int i=0;i<8;i++){
            int valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"+(i+1)));

            array[i]=valor;
        }

            int val=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));
            int posicion=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion"));
            array[posicion]=val;

            for(int j=posicion;j>=10;j--){
                array[j+1]=array[j];
            }


        for (int valor:array
             ) {
            System.out.println(valor);
        }
    }
}
