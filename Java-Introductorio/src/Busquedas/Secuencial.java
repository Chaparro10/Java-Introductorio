package Busquedas;

import javax.swing.*;

public class Secuencial {
    public static void main(String []args){


            int [] array = new int[]{1,2,3,4,5,67,8};
            boolean isSearch=false;
            int dato=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato a buscar"));
            int posicion=0;
            int j=0;




           for(int i=0;i<7;i++){
               if (dato ==array[i]){
                   isSearch=true;
                   posicion=i;
               }
           }
        String mensaje=isSearch? ("Si existe en la posicion "+posicion) : "No existe";

        System.out.println(mensaje);
    }
}
