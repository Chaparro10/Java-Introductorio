package POO.Animal;

public class Animal {

    private String Nombre;
    private int Edad;

    public Animal(String n , int edad){
        this.Nombre=n;
        this.Edad=edad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }


}
