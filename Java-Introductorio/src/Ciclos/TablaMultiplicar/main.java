package Ciclos.TablaMultiplicar;

import javax.swing.*;

public class main {
    public static void main(String []args){

        int valor=0;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));


        while (numero>0){

            System.out.println("......Tabla...........:::::"+numero);

            for(int i=1;i<=10;i++){
                valor=(numero * i);
                System.out.println("Tabla:"+ numero +"x"+i + ":"+ valor);
            }

             numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));

        }
    }
}
