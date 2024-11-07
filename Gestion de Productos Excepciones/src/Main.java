import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;

        try {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

                System.out.print("Ingrese el precio del producto: ");
                 precio = scanner.nextDouble();


            System.out.print("Ingrese la cantidad en inventario: ");
            int cantidad = scanner.nextInt();
            Producto producto = new Producto(nombre, precio, cantidad);


            producto.mostrarDetalles();

        } catch (ProductoInvalidoException | PrecioInvalidoException | CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
