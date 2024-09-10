package Condicionales.CaracterEsMayucula;

import javax.swing.*;

public class main {
    public static void main(String []args) {

        char letra = JOptionPane.showInputDialog("Ingresa la letra").charAt(0);


      String Mensaje=(Character.isUpperCase(letra))? "Es Mayucula": "Es minuscula";

        System.out.println(Mensaje);
    }
}
