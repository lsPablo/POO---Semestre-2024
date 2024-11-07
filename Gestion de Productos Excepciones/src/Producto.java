public class Producto {

    public String nombre;
    public double precio;
    public int cantidad;
    public double precioTotal;

    public Producto(String nombre, double precio, int cantidad) {
        if(nombre==null || nombre.isEmpty()){
         throw new ProductoInvalidoException();
        }
        if(precio<=0){
            throw new PrecioInvalidoException();
        }

        if(cantidad<=0){
            throw new CantidadInvalidaException();
        }

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void calcularValorTotal(){
         precioTotal = precio*cantidad;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio total: "+precioTotal);
    }


}
