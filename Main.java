import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar categorias");
            System.out.println("5. Registrar categorias");
            System.out.println("6. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                if(!inventario.validarExistenciadeCategorias()){
                    System.out.println("\n No existen categorias en el sistema");
                    break;

                }
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el id de la categoria en la cual registraras el producto");
                    int Idcategoria = scanner.nextInt();
                    //Metodo para verificar que ese scanner exista

                    scanner.nextLine();

                    System.out.println("Ingresa el stock del producto");
                    int stock = scanner.nextInt();

                    System.out.println(nombre);

                    Producto producto = new Producto(nombre, precio, descripcion, Idcategoria, stock);
                    inventario.registrarProducto(producto);

                    System.out.println("\nProducto registrado correctamente");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();

                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;

                case 4:
                inventario.mostrarCategorias();
                    break;
                case 5:
                System.out.println("Seleccionaste la opcion para registrar una categoria");
                System.out.println("Ingresa el nombre de la categoria");
                String nombreCategoria = scanner.nextLine();

                scanner.nextLine();

                Categoria categoria =new Categoria(nombreCategoria);
                inventario.registrarCategoria(categoria);
                System.out.println("\nCategoria registrada correctamente");
                break;
                case 6:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}