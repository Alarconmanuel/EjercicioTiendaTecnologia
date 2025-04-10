abstract public class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadStoke;

    public Producto() {
    }

    public Producto(String nombre, String marca, double precio, int cantidadStoke) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadStoke = cantidadStoke;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStoke() {
        return cantidadStoke;
    }

    public void setCantidadStoke(int cantidadStoke) {
        this.cantidadStoke = cantidadStoke;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStoke=" + cantidadStoke +
                '}';
    }

    public abstract void mostrarDetalle();
}
