package Condicionales.OperadorTernario;

import javax.swing.*;

public class Main {
    public static void main(String []args){

        int []array = new int[5];

        for(int valor=0;valor<array.length;valor++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            array[valor]=numero;
        }


        for (int valorP:array) {
            System.out.println(array[valorP-1]);
             String Mensaje=(array[valorP-1]%2==0)?"Es par": "Es impar";

            System.out.println("El valor :" + array[valorP-1] + "Es:"+Mensaje);

        }

    }
}
