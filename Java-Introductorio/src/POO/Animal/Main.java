package POO.Animal;

public class Main {
    public static void main(String [] args){

        //Creando los objetos o instancias de clase

        Perro p1 = new Perro("Perro1",2);
        Gato g1 = new Gato("Gaaa",24,"JJJ");

        g1.Sonido();
        System.out.println(g1);
        p1.Sonido();
    }
}
