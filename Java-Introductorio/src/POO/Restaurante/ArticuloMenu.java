package POO.Restaurante;

public class ArticuloMenu {

    private String Nombre;
    private double Precio;

    public ArticuloMenu(String nombre, double precio) {
        Nombre = nombre;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return "ArticuloMenu{" +
                "Nombre='" + Nombre + '\'' +
                ", Precio='" + Precio + '\'' +
                '}';
    }
}
