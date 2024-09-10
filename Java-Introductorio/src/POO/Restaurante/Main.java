package POO.Restaurante;

public class Main {
    public static  void main(String []args){



        Restaurante restaurante = new Restaurante();

        // Crear artículos del menú
        ArticuloMenu pizza = new ArticuloMenu("Pizza", 8.99);
        ArticuloMenu burger = new ArticuloMenu("Burger", 5.99);
        ArticuloMenu soda = new ArticuloMenu("Soda", 1.99);

        // Agregar artículos al menú del restaurante
        restaurante.agregarArticuloMenu(pizza);
        restaurante.agregarArticuloMenu(burger);
        restaurante.agregarArticuloMenu(soda);
        // Mostrar el menú
        restaurante.mostrarMenu();

        // Crear clientes
        Cliente cliente1 = new Cliente("Kevin", "C001");
        Cliente cliente2 = new Cliente("Ana", "C002");

        // Crear pedidos
        Pedido pedido1 = restaurante.crearPedido(cliente1);
        pedido1.agregarArticulo(pizza);
        pedido1.agregarArticulo(soda);

        Pedido pedido2 = restaurante.crearPedido(cliente2);
        pedido2.agregarArticulo(burger);
        pedido2.agregarArticulo(soda);

        // Mostrar los pedidos
        restaurante.mostrarPedidos();

        // Generar factura para el primer pedido
        Factura factura1 = new Factura(pedido1);
        factura1.mostrarFactura();
    }


}
