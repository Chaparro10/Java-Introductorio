package POO.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<ArticuloMenu> menu;
    private List<Pedido> pedidos;

    public Restaurante() {
        this.menu = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void agregarArticuloMenu(ArticuloMenu articulo) {
        menu.add(articulo);
    }

    public void mostrarMenu() {
        System.out.println("Menú del Restaurante:");
        for (ArticuloMenu articulo : menu) {
            System.out.println(articulo);
        }
    }

    public Pedido crearPedido(Cliente cliente) {
        Pedido pedido = new Pedido(cliente);
        pedidos.add(pedido);
        return pedido;
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos en el restaurante:");
        for (Pedido pedido : pedidos) {
            pedido.mostrarPedido();
            System.out.println();
        }
    }
}
