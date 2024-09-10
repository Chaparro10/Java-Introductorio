package Arreglos.IndicarOrdenamiento;

import javax.swing.*;

public class main {
    public static void main(String [] args){

        int [] arrgelo = new int[10];

        for(int i=0;i<10;i++){
            int Valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"+(i+1)));

            arrgelo[i]=Valor;
        }

        ///Validacion
        boolean IsOrdenamiento=true;
        for(int i=0;i<9;i++){

            if(arrgelo[i]<arrgelo[i + 1]){//Creciente
                IsOrdenamiento=true;
            }else if(arrgelo[i]>arrgelo[i + 1]){// Decreciente
                IsOrdenamiento=false;
            }

        }
        String Result=(IsOrdenamiento)?"Creciente":"Decreciente";
        System.out.println(Result);
    }
}
