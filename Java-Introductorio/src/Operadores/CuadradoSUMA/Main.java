package Operadores.CuadradoSUMA;

import javax.swing.*;

public class Main {
    public static void main(String []args){


            int Numero =Integer.parseInt(JOptionPane.showInputDialog("Ingresa a"));
        int Numero2 =Integer.parseInt(JOptionPane.showInputDialog("Ingresa b"));

        double formula= Math.pow(Numero,2) + Math.pow(Numero2,2) + 2 * (Numero*Numero2);

        System.out.println("Prueba:"+formula);


    }
}
