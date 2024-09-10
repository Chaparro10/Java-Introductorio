package Arreglos.EliminarElementoArray;

import javax.swing.*;

public class main {
    public static void main(String [] args){
        int []array = new int[10];

        for (int i=0;i<10;i++){
            int valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"+(i+1)));
            array[i]=valor;
        }
        int pos;
        do{
             pos =Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion"));
        }while(pos<0 || pos>9);

        for(int i=pos;i<9;i++){
            array[i]=array[i+1];
        }

        for (int va:array
             ) {
            System.out.println(va);
        }
    }
}
