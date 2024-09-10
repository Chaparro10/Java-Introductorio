package POO.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;

    private List<ArticuloMenu> listarticulos;

    public Pedido(Cliente cliente){
        this.cliente=cliente;
        this.listarticulos= new ArrayList<>();
    }

    public void agregarArticulo(ArticuloMenu articulo) {
       listarticulos.add(articulo);
    }

    public double calcularTotal() {
        double total = 0;
        for (ArticuloMenu articulo : listarticulos) {
            total += articulo.getPrecio();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("Pedido para " + cliente.getNombre() + ":");
        for (ArticuloMenu articulo : listarticulos) {
            System.out.println(articulo);
        }
        System.out.println("Total: $" + calcularTotal());
    }
}
