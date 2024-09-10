package POO.Biblioteca;

import java.time.LocalDate;

public class Prestamo {

    private Persona persona;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Persona persona, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.persona = persona;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "persona=" + persona +
                ", libro=" + libro +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
