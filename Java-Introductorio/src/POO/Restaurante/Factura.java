package POO.Restaurante;

public class Factura {

    private Pedido pedido;
    private double total;

    public Factura(Pedido pedido) {
        this.pedido = pedido;
        this.total = pedido.calcularTotal();
    }

    public void mostrarFactura() {
        System.out.println("Factura:");
        pedido.mostrarPedido();
        System.out.println("Total a pagar: $" + total);
    }


}
