import java.util.ArrayList;

public class Inventario {

    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public ArrayList<Categoria> listaCategorias = new ArrayList<>();

    public void registrarProducto(Producto producto) {

        this.listaProductos.add(producto);
    }

    public void registrarCategoria(Categoria categoria) {

        this.listaCategorias.add(categoria);
    }

    public void eliminarProducto(int idProductoEliminar) {
        int longitudOriginal = this.listaProductos.size(); // 3

        this.listaProductos.removeIf((producto) -> producto.getId() == idProductoEliminar);

        if (longitudOriginal != this.listaProductos.size()) {
            System.out.println("El producto con el ID: " + idProductoEliminar + " fue eliminado con exito");
        } else {
            System.out.println("No existe ningun producto con el ID: " + idProductoEliminar);
        }
    }

    public void mostrarProductos() {
        System.out.println("\n*** PRODUCTOS EN EL SISTEMA ***");

        if (this.listaProductos.size() == 0) {
            System.out.println("\nNo existen productos en el sistema");
            return;
        }

        int iterador = 1;
        for (Producto producto : this.listaProductos) {
            System.out.println("\nProducto: " + iterador);
            System.out.println(producto.mostrarProducto());
            iterador++;
        }
    }
    public void mostrarcategorias(){
        System.out.println("\n### TODAS LAS CATEGORIAS ###");
        if (this.listaCategorias.size() == 0) {
            System.out.println("\nNo existen categorias");
            return;

        }
        for (Categoria categoria : this.listaCategorias) {
            System.out.println(categoria.mostrarUnaCategoria());
        }
    }

    public void mostrarCategoriasProductos() {
        System.out.println("\n*** CATEGORIA ***");
        if (this.listaCategorias.size() == 0) {
            System.out.println("\nNo existen categorias");
            return;
        }
        for (Categoria categoria : this.listaCategorias) {
            System.out.println(categoria.mostrarUnaCategoria());

            if (categoria.listaProductos.size() == 0) {
                System.out.println("\nEsa categoria no contiene ningun producto");

            }else{
                for (Producto producto : categoria.listaProductos) {
                    System.out.println("**Productos**");
                    System.out.println(producto.mostrarProducto());
                }
            }
        }
    }
    public Categoria buscarCategoriaPorId(int idCategoria) {
        for (Categoria categoria : this.listaCategorias) {
            if (categoria.id == idCategoria) {
                return categoria;
            }
        }
        return null;
    }

    public boolean validarExistenciadeCategorias() {
        return this.listaCategorias.size() > 0;
    }
}
