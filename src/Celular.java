public class Celular extends Producto implements Vendible{
    protected int bateria;
    protected int camaraResolucion;

    public Celular(String nombre, String marca, double precio, int cantidadStoke, int bateria, int camaraResolucion) {
        super(nombre, marca, precio, cantidadStoke);
        this.bateria = bateria;
        this.camaraResolucion = camaraResolucion;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(int camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public String toString() {
        return super.toString()+"Celular{" +
                "bateria=" + bateria +
                ", camaraResolucion=" + camaraResolucion +
                '}';
    }

    Celular celular1 = new Celular("REDMI10", "XIAOMI", 800000, 30, 4000, 50);
    Celular celular2 = new Celular("RENO10", "OPPO", 1200000, 15, 4500, 48);
    Celular celular3 = new Celular("A31", "SAMSUNG", 950000, 12, 3850, 45);


    @Override
    public void mostrarDetalle() {
        System.out.println("NOMBRE COMPUTADOR: "+nombre);
        System.out.println("MARCA COMPUTADOR: "+marca);
        System.out.println("PRECIO: "+precio);
        System.out.println("STOCK: "+cantidadStoke);
        System.out.println("CAPACIDAD BATERIA: "+bateria+" mA");
        System.out.println("RESOLUCIÓN DE LA CAMARA: "+camaraResolucion+" MP");
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        cantidad = 0;
        if (cantidad>5){
            precio = precio*0.9;
        }
        return precio;
    }
}
