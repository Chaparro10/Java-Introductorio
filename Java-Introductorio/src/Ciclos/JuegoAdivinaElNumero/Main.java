package Ciclos.JuegoAdivinaElNumero;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String []args){

            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
            int numeroRandom=  (int)Math.floor(Math.random()*10+1);


            while(numero != numeroRandom){

                if(numero>numeroRandom){
                    System.out.println("El numero es menor");
                }else{
                    System.out.println("El numero es mayor");
                }

                 numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
            }
        System.out.println("Lo has encontrado!! Felicidades");
    }
}
