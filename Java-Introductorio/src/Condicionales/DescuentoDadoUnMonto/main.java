package Condicionales.DescuentoDadoUnMonto;

import javax.swing.*;

public class main {
    public static void main(String[]args){
             double descuento=0.20;

             double Valor= Double.parseDouble( JOptionPane.showInputDialog("Ingresa el valor"));
            double total=0;
            double desc=0;
                if(Valor>300){
                    desc = Valor * descuento;
                    total=Valor-desc;
                }else{
                    total=Valor;
                }

        System.out.println(total);


    }
}
