package Condicionales.Multiplo10;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
            /*
            * Problema:Dado un array de n Elementos , averiguar cual de ellos es multiplo de 10
            *
            * */


        int TotalArray= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del array"));

        int []array = new int[TotalArray] ;


        for (int i=0;i< array.length;i++){
            int Valor =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor "+(i+1)));

            array[i]=Valor;
        }


        for (int vv:
             array) {
            System.out.println(vv);


            String mensaje=(vv%10==0)?"Es multiplo": "No es Multiplo";
            System.out.println(mensaje);
        }



    }
}
