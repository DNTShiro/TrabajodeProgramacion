public class Aplicacion {

    public Pedido crearPedido() {
        Cliente c;
        Producto p1, p2;
        Pedido ped;

        c = new Cliente("12345678", "Juan Perez");

        p1 = new Producto("P01", "Cuaderno", 5.50);
        p2 = new Producto("P02", "Lapicero", 1.50);

        ped = new Pedido(c, 5);
        ped.agregarProducto(p1);
        ped.agregarProducto(p2);

        return ped;
    }
}