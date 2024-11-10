public class NumeroDeNochesInvalidoException extends RuntimeException {
    private static final String MENSAJE = "Por favor, ingrese un número de noches mayor a 0.";
    public NumeroDeNochesInvalidoException() {
        super(MENSAJE);
    }
}
