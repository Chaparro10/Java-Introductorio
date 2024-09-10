package Ciclos.PromedioNNumeros;

import javax.swing.*;

public class main {
    public static void main(String []args){
            int numero, suma=0,elemento=0;
            float promedio;

            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));

            while(numero  > 0){

                suma += numero;
                elemento++;
                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));

            }

            promedio=suma /elemento;

        System.out.println(promedio);
    }
}
