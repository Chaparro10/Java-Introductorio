package Condicionales.NumeroMayorAOtro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){


            /*
            * Problema:Dado dos numeros identicar cual es mayor o si son iguales
            *
            * */

            int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));


            if(numero1 >numero2){
                System.out.println("Numero 1 es mayor");
            }else if (numero2>numero1) {
                System.out.println("Numero 2 es mayor");
            }else{
                System.out.println("Son iguales");
            }


            /*Haciendolo con un array*/


        int [] array = new int[]{1,2,3,4,5,5,6,7,8};

        int mayor=array[0];
        int menor=array[0];
        List<Integer> Lista= new ArrayList<>();
        for (int i=1;i<array.length;i++) {

            if(mayor<array[i]){
               mayor =array[i];

            }else if(mayor>array[i]){
                menor=array[i];
            }else{
                    Lista.add(array[i]);
            }
            /* else if(mayor==va) {
                arrayIguales[va]=va;

            }else{
                 menor=va;
                System.out.println(menor);
            }*/

            //System.out.println(va);
           // System.out.println(arrayIguales);

        }
        System.out.println(mayor);
        System.out.println(menor);
        System.out.println(Lista);
    }
}


