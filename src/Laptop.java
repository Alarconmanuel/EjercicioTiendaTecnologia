import java.util.ArrayList;
import java.util.List;

public class Laptop extends Producto implements Vendible {
    protected  String procesador;
    protected double memoriaRam;

    public Laptop(String nombre, String marca, double precio, int cantidadStoke, String procesador, double memoriaRam) {
        super(nombre, marca, precio, cantidadStoke);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return super.toString()+"Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRam=" + memoriaRam +
                '}';
    }

    Laptop laptop1 = new Laptop("IDEAPAD", "LENOVO",2150000, 10, "INTEL CORE i3", 16 );
    Laptop laptop2 = new Laptop("VIVOBOOK", "ASUS",1950000, 15, "AMD RYZEN 5", 32 );
    Laptop laptop3 = new Laptop("INSPIRION", "DELL",2550000, 20, "INTEL CORE i7", 16 );

    @Override
    public void mostrarDetalle() {
        System.out.println("NOMBRE COMPUTADOR: "+nombre);
        System.out.println("MARCA COMPUTADOR: "+marca);
        System.out.println("PRECIO: "+precio);
        System.out.println("STOCK: "+cantidadStoke);
        System.out.println("PROCESADOR: "+procesador);
        System.out.println("MEMORIA RAM: "+memoriaRam+" GB");
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
