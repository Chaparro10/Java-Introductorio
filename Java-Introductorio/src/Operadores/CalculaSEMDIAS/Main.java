package Operadores.CalculaSEMDIAS;

import javax.swing.*;

public class Main {

    public static void main(String []args) {

        /*
         * Ejercicio 7: Construir un programa que dado un numero total de horas , devuelva el numero de semanas, dias y horas
         * equivalentes.Por ejemplo,Dado un total de 1000 horas , debe mostrar 5 semanas , 6 dias y 16 horas,
         *
         * */
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el num de registros:"));

        int[] array = new int[horas];

        for (int i = 0; i < array.length; i++) {
            int TotalHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las Horas"));

            array[i] = TotalHoras;
        }




        for (int valor:array
             ) {
                Calculo(valor);
        }

    }

    public static void Calculo(int valor){
        int  dias = valor % 168 /24;
        float semana= valor/168;
        float horas_corridas =valor %24 ;

        System.out.println("Dias"+dias+ "Sem"+semana + "hora"+horas_corridas);
    }
}
