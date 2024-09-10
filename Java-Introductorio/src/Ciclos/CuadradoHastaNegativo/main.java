package Ciclos.CuadradoHastaNegativo;

import Condicionales.Multiplo10.Main;

import javax.swing.*;

public class main {
    public static void main(String [] args){

        int numero =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));

        while (numero > 0){

            double cuadrado= Math.pow(numero,2);
            System.out.println(cuadrado);
            numero =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));

        }
    }
}
