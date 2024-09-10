package Operadores.SalarioSemanalEmpleado;

import javax.swing.*;

public class Main {
    public static void main(String[]args){



        int horas_Trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las Horas Trabajadas:"));
        double salario_por_hora=Double.parseDouble(JOptionPane.showInputDialog("Ingresa salario por Hora:"));

        double Total_Salario=horas_Trabajadas * salario_por_hora;

        System.out.println("El salario total para el empleado:"+Total_Salario);

    }
}
