package Arreglos;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String []args){
        Persona persona = new Persona();
        Persona personas[]= {
                new Persona("Prueba1",21),
                new Persona("Prueba2",233),
                new Persona("Prueba3",2)};


      List<Persona> personaList= persona.getMayorEdad(personas);
        System.out.println("================Personas mayor de edad=============");
        personaList.forEach(s-> System.out.println(s.getNombre()));
        System.out.println("===================================================");

        System.out.println("=================EL MAYOR=================");
        System.out.println(persona.getMayor(personas));
        System.out.println("===========================================");
    }

}
