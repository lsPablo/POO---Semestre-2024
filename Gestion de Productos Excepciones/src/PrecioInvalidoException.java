public class PrecioInvalidoException extends RuntimeException {
    public PrecioInvalidoException() {
        super("El precio no puede ser negativo o igual a 0");
    }
}
