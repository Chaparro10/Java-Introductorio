package POO.Animal;

public class Gato   extends  Animal implements  IMetodos {

    private String pelaje;
    public Gato(String n, int edad, String pelaja) {
        super(n, edad);
        this.pelaje=pelaja;
    }

    @Override
    public void Sonido() {
        System.out.println("Miauuu");
    }


}
