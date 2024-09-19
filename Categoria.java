import java.util.ArrayList;
import java.util.Random;
public class Categoria{
    public int id;
    public String nombre;
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public Random random =new Random();

    public Categoria(String nombre){
        this.id=this.random.nextInt(10001);
        this.nombre=nombre;

    }
    public void registrarProductoEnCategoria(){
        this.listaProductos=listaProductos;

    }
    public void mostrarDatos(){
        System.out.println(nombre + id + listaProductos.get(0));
        for(Producto producto : this.listaProductos){
            System.out.println(producto.getNombre());
        }
    }
}