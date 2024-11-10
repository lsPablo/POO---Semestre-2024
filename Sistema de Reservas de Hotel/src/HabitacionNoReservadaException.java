public class HabitacionNoReservadaException extends RuntimeException {
    private static final String MENSAJE = "Esta habitacion NO esta reservada";
    public HabitacionNoReservadaException() {
        super(MENSAJE);
    }
}
