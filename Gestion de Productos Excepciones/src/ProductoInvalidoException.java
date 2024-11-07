public class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException() {
        super("El nombre del producto no puede estar vacio o estar nulo ");
    }
}
