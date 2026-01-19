public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private int contador;

    public Pedido(Cliente cliente, int n) {
        this.cliente = cliente;
        productos = new Producto[n];
        contador = 0;
    }

    public void agregarProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
        }
    }

    public double total() {
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += productos[i].getPrecio();
        }
        return suma;
    }

    public void mostrar() {
        System.out.println(cliente);
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("Total a pagar: S/ " + total());
    }
}