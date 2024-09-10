package POO.Biblioteca;

public class Main {
    public static void main(String []args){
        Biblioteca biblioteca = new Biblioteca();


        //Creacion de los libros
        Libro li1= new Libro("Prueva","Pruebaaa","jsjs");

        biblioteca.AgregarLibro(li1);

        //Creacion de los usuarios
        Estudiante e1 = new Estudiante("Pepe","123","SISTEMAS");
        Profesor p1 = new Profesor("KJJJJ","jjjj","SISTEMAS");

        biblioteca.PrestarLibro(e1,"jsjs");
        biblioteca.PrestarLibro(p1,"jsjs");

        biblioteca.mostrarPrestamos();
    }
}
