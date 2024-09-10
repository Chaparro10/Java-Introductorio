package POO.Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> listlibros;
    private List<Prestamo> listPrestamo;


    public Biblioteca() {
        this.listlibros = new ArrayList<>();
        this.listPrestamo = new ArrayList<>();
    }

    public void AgregarLibro(Libro libro){
        listlibros.add(libro);

    }


    public void PrestarLibro(Persona persona , String isbn){
            for(Libro li:listlibros){
                if(li.getIsbn().equals(isbn)){
                    LocalDate fechaPrestamo = LocalDate.now();
                    LocalDate fechaDevolucion = fechaPrestamo.plusDays(14); // 2 semanas de préstamo
                    Prestamo prestamo = new Prestamo(persona, li, fechaPrestamo, fechaDevolucion);
                    listPrestamo.add(prestamo);
                    System.out.println("Libro prestado con éxito.");
                    return;
                }
                System.out.println("Libro no disponible.");
            }
    }

    public void mostrarPrestamos() {
        for (Prestamo prestamo : listPrestamo) {

            System.out.println(prestamo);
        }
    }
}
