import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Cliente> lstClientes = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        int op;
        boolean estado=true;

        do {
            System.out.println("""
                    1.CREAR CLIENTE
                    2.COMPRAR LAPTOP
                    3.COMPRAR CELULAR 
                    4.MOSTAR STOCK
                    5.SALIR
                    """);

            op = teclado.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("INGRESA EL NOMBRE: ");
                    String nombre = teclado.next();
                    System.out.println("INGRESA EL CORREO: ");
                    String correo = teclado.next();
                    List<Producto> lstproducto = new ArrayList<>();
                    lstClientes.add(new Cliente(nombre, correo, lstproducto));
                }
                case 2 -> {
                    System.out.println();
                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {
                    estado = false;
                }
                default -> {
                    System.out.println("OPCION INVALIDA");
                }
            }
        } while (estado);


    }
}