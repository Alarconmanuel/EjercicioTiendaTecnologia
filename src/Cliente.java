import java.util.ArrayList;
import java.util.List;

public class Cliente {
    protected String nombre;
    protected String correo;
    protected List<Producto> Producto = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String correo, List<Producto> producto) {
        this.nombre = nombre;
        this.correo = correo;
        Producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getProducto() {
        return Producto;
    }

    public void setProducto(List<Producto> producto) {
        Producto = producto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", Producto=" + Producto +
                '}';
    }

    public void comprarProducto(Producto producto, int cantidad){
        if (producto.getCantidadStoke() >= cantidad) {
            producto.setCantidadStoke(producto.getCantidadStoke() - cantidad);
            this.Producto.add(producto);
            System.out.println("Compra realizada con éxito.");
        } else {
            System.out.println("No hay suficiente stock.");
        }
    }

    public void mostrarCompra(){
        System.out.println("NOMBRE CLIENTE: " + nombre);
        System.out.println("CORREO CLIENTE: " + correo);
        System.out.println("PRODUCTOS COMPRADOS:");
        double totalCompra = 0;
        for (Producto p : Producto) {
            p.mostrarDetalle();
            int cantidad = p.getCantidadStoke(); // Aquí se guarda como "stock", pero representa lo comprado
            double total = ((Vendible) p).calcularPrecioVenta(cantidad);
            System.out.println("Cantidad comprada: " + cantidad + ", Total: $" + total);
            totalCompra += total;
        }
        System.out.println("TOTAL COMPRA: $" + totalCompra);
    }
}
