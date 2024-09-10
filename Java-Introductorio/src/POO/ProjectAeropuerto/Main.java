package POO.ProjectAeropuerto;

import javax.swing.*;

public class Main {

    static  Aeropuerto aeropuertos  []= new Aeropuerto[2];

    public static void main(String [] args){

            //CREACION DEL MENU



            InsertarDatosAeropuerto(aeropuertos);
       aeropuertos[0].getCompaniaNombre("Aeroru");


    }
    public static void InsertarDatosAeropuerto(Aeropuerto aero []){
            aero[0]= new AeropuertoPublico("Prueba","Lima","Peru",50000);
            aero[0].insertarCompania( new Compania("Aeroru"));
            aero[0].getCompaniaNombre("AeroPeru").InsertarVuelo(new Vuelo("JB1","LIMA","ORCA",1500,25));
            aero[0].getCompaniaNombre("AeroPeru").getVueloIdentificador("JB1").insertarPasajero(new pasajero("Hola","123","MXN"));

        aero[1]= new AeropuertoPublico("PruebaB","Lima","Peru",50000);
        aero[1].insertarCompania( new Compania("AeroPeru"));
        aero[1].getCompaniaNombre("AeroPeru").InsertarVuelo(new Vuelo("JB1","LIMA","ORCA",1500,25));
        aero[1].getCompaniaNombre("AeroPeru").getVueloIdentificador("JB1").insertarPasajero(new pasajero("Hola","123","MXN"));
    }
}
