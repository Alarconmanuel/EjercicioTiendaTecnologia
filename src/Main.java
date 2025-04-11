import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Cliente> lstClientes = new ArrayList<>();
        List<Laptop> lstLaptos = new ArrayList<>();
        List<Celular> lstCelulares = new ArrayList<>();

        Laptop laptop1 = new Laptop("IDEAPAD", "LENOVO",2150000, 10, "INTEL CORE i3", 16 );
        Laptop laptop2 = new Laptop("VIVOBOOK", "ASUS",1950000, 15, "AMD RYZEN 5", 32 );
        Laptop laptop3 = new Laptop("INSPIRION", "DELL",2550000, 20, "INTEL CORE i7", 16 );
        lstLaptos.add(laptop1); lstLaptos.add(laptop2); lstLaptos.add(laptop3);

        Celular celular1 = new Celular("REDMI10", "XIAOMI", 800000, 30, 4000, 50);
        Celular celular2 = new Celular("RENO10", "OPPO", 1200000, 15, 4500, 48);
        Celular celular3 = new Celular("A31", "SAMSUNG", 950000, 12, 3850, 45);
        lstCelulares.add(celular1); lstCelulares.add(celular2); lstCelulares.add(celular3);

        Scanner teclado = new Scanner(System.in);
        int op;
        boolean estado=true;

        do {
            System.out.println("""
                    1.CREAR CLIENTE
                    2.COMPRAR LAPTOP
                    3.COMPRAR CELULAR 
                    4.MOSTAR STOCK
                    5.COMPRAS DE LOS CLIENTES
                    6.SALIR
                    """);

            op = teclado.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.print("INGRESA EL NOMBRE: ");
                    String nombre = teclado.next();
                    System.out.print("INGRESA EL CORREO: ");
                    String correo = teclado.next();
                    List<Producto> productosCliente = new ArrayList<>();
                    Cliente cliente = new Cliente(nombre, correo, productosCliente);
                    lstClientes.add(cliente);
                    System.out.println("CLIENTE CREADO CON ÉXITO.");
                }
                case 2 -> {
                    if (lstCelulares.isEmpty()) {
                        System.out.println("Primero debes crear un cliente.");
                        break;
                    }
                    System.out.println("LAPTOS DISPONIBLES");
                    for (int i = 0; i < lstLaptos.size(); i++) {
                        System.out.println((i + 1) + ". " + lstLaptos.get(i).getNombre() + " - Stock: " + lstLaptos.get(i).getCantidadStoke());
                    }
                    System.out.print("Seleccione una laptop: ");
                    int i = teclado.nextInt() - 1;
                    if (i >= 0 && i < lstLaptos.size()) {
                        System.out.print("Ingrese cantidad a comprar: ");
                        int cantidad = teclado.nextInt();
                        Cliente cliente = lstClientes.get(lstClientes.size() - 1);
                        cliente.comprarProducto(lstLaptos.get(i), cantidad);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                }
                case 3 -> {
                    if (lstCelulares.isEmpty()) {
                        System.out.println("Primero debes crear un cliente.");
                        break;
                    }
                    System.out.println("CELULARES DISPONIBLES");
                    for (int i = 0; i < lstCelulares.size(); i++) {
                        System.out.println((i + 1) + ". " + lstCelulares.get(i).getNombre() + " - Stock: " + lstCelulares.get(i).getCantidadStoke());
                    }
                    System.out.print("Seleccione un celular: ");
                    int index = teclado.nextInt() - 1;
                    if (index >= 0 && index < lstCelulares.size()) {
                        System.out.print("Ingrese cantidad a comprar: ");
                        int cantidad = teclado.nextInt();
                        Cliente cliente = lstClientes.get(lstClientes.size() - 1);
                        cliente.comprarProducto(lstCelulares.get(index), cantidad);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                }
                case 4 -> {
                    System.out.println("STOCK LAPTOPS");
                    for (Laptop l : lstLaptos) {
                        l.mostrarDetalle();
                        System.out.println();
                    }
                    System.out.println("STOCK CELULARES");
                    for (Celular c : lstCelulares) {
                        c.mostrarDetalle();
                        System.out.println();
                    }
                }
                case 5 -> {
                    if (lstClientes.isEmpty()) {
                        System.out.println("No hay clientes registrados.");
                        break;
                    }
                    for (Cliente cliente : lstClientes) {
                        cliente.mostrarCompra();
                    }
                }
                case 6 -> {
                    estado = false;
                    System.out.println("HASTA PRONTO");
                }
                default -> {
                    System.out.println("OPCION INVALIDA");
                }
            }
        } while (estado);
    }
}