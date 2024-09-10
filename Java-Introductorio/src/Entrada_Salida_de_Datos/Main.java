package Entrada_Salida_de_Datos;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un valor:");
        int numero = entrada.nextInt();


        //UTILIZANDO JOPTIONPANE

        String cadena= JOptionPane.showInputDialog("Ingresa una cadena");
        int entero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
    }
}
