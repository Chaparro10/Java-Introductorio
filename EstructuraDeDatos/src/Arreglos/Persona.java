package Arreglos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public  Persona(String nombre, int edad){
            this.nombre=nombre;
            this.edad=edad;
    }

    public String getNombre(){
        return  nombre;
    }
    public int getEdad(){
        return  edad;
    }

    public  List<Persona> getMayorEdad(Persona[] personas){
          return Arrays.stream(personas).filter(s->s.edad>18).toList();
    }

    public Optional<String> getMayor(Persona[] personas){
        return  Arrays.stream(personas).sorted(Comparator.comparingInt(Persona::getEdad)).map(f->f.nombre).findFirst();
    }

}
