package POO.Animal;

public class Perro extends  Animal implements  IMetodos{
    public Perro(String n, int edad) {
        super(n, edad);
    }

    @Override
    public void Sonido() {
        System.out.println("Guagauauauua");
    }

}
