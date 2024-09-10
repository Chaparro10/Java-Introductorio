package Operadores.CantidadDinero;

import java.util.Scanner;

public class Main {
    public static void main(String []args){


        /*
        * Problema:Guillermo tiene N dolares . Luis tiene la mitad de lo que posee guillermo.Juan tiene la mitad de lo que poseen Luis
        * y Guillermo Juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres
        *
        * */


        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de dinero de Guillermo:");
        int DineroGuillermo= entrada.nextInt();

        double DineroLuis= DineroGuillermo / 2;

        double DineroJuan= (DineroGuillermo + DineroLuis) /2;


        double Total= (DineroGuillermo+DineroLuis+DineroJuan);
        System.out.println("Total de dinero entre los 3:"+Total);

    }
}
