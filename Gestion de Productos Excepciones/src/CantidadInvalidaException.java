public class CantidadInvalidaException extends RuntimeException {
    public CantidadInvalidaException() {
        super("La cantidad es negativa");
    }
}
