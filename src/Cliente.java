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
    }

    public void mostrarCompra(){
        System.out.println("NOMBRE CLIENTE: "+nombre);
        System.out.println("CORREO CLIENTE: "+correo);
        System.out.println("PRODUCTOS COMPRADOS: "+Producto);
    }
}
