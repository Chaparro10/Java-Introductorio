package Condicionales.ParesImpares;

import javax.swing.*;

public class main {
    public static void main(String []args){
            
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el num 1"));
        int num2 =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el num 2"));
        
        if((num1 % 2==0) && (num2 % 2 ==0)){
            System.out.println("Ambos numeros son pares");
        } else {
            System.out.println("Son Impares");
        }
    }
}
