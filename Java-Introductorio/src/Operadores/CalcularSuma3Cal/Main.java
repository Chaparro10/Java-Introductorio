package Operadores.CalcularSuma3Cal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){


        int totalArray=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion "));
        int [] array = new int[totalArray];

        for(int i=0;i <array.length;i++){
            int valor =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion "+ (i+1)));
            array[i]=valor;
        }
        int cal=0;

        for (int valor:array) {
            cal += valor;
        }
        System.out.println("Calificaciones sumadas"+cal);
    }
}
