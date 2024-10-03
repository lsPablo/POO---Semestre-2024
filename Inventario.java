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
            System.out.println("Se eliminó el prodcuto con el ID: " + idProductoEliminar);
        } else {
            System.out.println("No existe un producto con el ID: " + idProductoEliminar);
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
            System.out.println("\nEste es el producto: " + iterador);
            System.out.println(producto.mostrarProducto());
            iterador++;
        }
    }

    public void registrarProductoEnCategoria(int idcategoria, Producto producto){
        for (int i = 0; i < this.listaCategorias.size(); i ++){
            Categoria categoria = this.listaCategorias.get(i);
            if (categoria.id == idcategoria) {
                categoria.registrarProductoEnCategoria();
            }
        }
    }

    public void mostrarCategorias(){
        for (int i = 0; i < this.listaCategorias.size(); i ++){
            Categoria categoria = this.listaCategorias.get(i);
            System.out.println("Esta es la categoria "+(i + 1)+":\nId: "+categoria.id+", Nombre: "+categoria.nombre);
            System.out.println("");
        }
    }

    public void mostrarCategoriasConProductos(){
        for (int i = 0; i < this.listaCategorias.size(); i ++){
            Categoria categoria = this.listaCategorias.get(i);
            System.out.println("Esta es la categoria "+(i + 1)+":\nId: "+categoria.id+", Nombre: "+categoria.nombre);
            System.out.println("Productos:");

            for (int j = 0; j < categoria.listaProductos.size(); j ++){
                Producto producto = categoria.listaProductos.get(j);
                System.out.println("Este es el producto " + (j + 1));
                System.out.println( producto.mostrarProducto());
                System.out.println("");
            }

            System.out.println("");
        }
    }

    public boolean validarExistenciadeCategorias(){
        return this.listaCategorias.size() > 0;
    }

    public boolean validarExistenciadeCategoria(int idCategoria){
        for (int i = 0; i < this.listaCategorias.size(); i ++){
            Categoria categoria = this.listaCategorias.get(i);
            if (categoria.id == idCategoria) {
                return true;
            }
        }

        return false;
    }
}