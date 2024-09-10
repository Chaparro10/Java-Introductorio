package Condicionales.SalarioSemanal;

import javax.swing.*;

public class main {
    public static void main(String []args){

            /*
            * Problema:Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera
            * si trabaja 40 horas o menos se les paga 16 pesos la hora
            * si trabaja mas de 40 horas por cada una de las 40 horas se les paga 16 mas 20 por cada extra
            *
            * */



                int hora_normal=16;
                int hora_extras=20;
                double sueldo=0;
                double aux=0;
                int HorasTrabajadas =Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas"));

                if(HorasTrabajadas<=40){
                        sueldo=HorasTrabajadas*hora_normal;
                }else{
                   aux = HorasTrabajadas %40;
                    System.out.println(aux);
                   sueldo=(40 * hora_normal) + (aux * 20 );
                }

        System.out.println(sueldo);

    }
}
