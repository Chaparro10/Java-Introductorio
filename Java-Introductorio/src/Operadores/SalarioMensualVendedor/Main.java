package Operadores.SalarioMensualVendedor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){

        /*Problema:Una compañia de venta de carros usados paga  a su personal de ventas un salario de 1000$ mensuales
        mas una comision de 150$ de cada carro vendido , mas el 5% del valor de la venta por carro.
        Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
        Hacer un programa que calcule e imprima el salario mensual de un vendedor dado
        * */



        List<Venta > lista = new ArrayList<>();

        System.out.println("Ingresa el Total de Empleados:");
        int TotalEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de empleados"));

        for(int i=0;i<TotalEmpleados;i++){


            String Nombre=JOptionPane.showInputDialog("Ingresa el Nombre");
            int  Ventas=Integer.parseInt(JOptionPane.showInputDialog("Ingresa lo vendido:"));

               Venta v1 = new Venta(Nombre,Ventas);
               lista.add(v1);
        }

        for (Venta valor: lista) {
            System.out.println(valor.SalarioTotal());
        }
    }
}
