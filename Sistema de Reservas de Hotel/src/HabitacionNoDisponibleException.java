public class HabitacionNoDisponibleException extends RuntimeException {
    private static final String MENSAJE = "Habitacion NO Disponible";
    public HabitacionNoDisponibleException() {
        super(MENSAJE);
    }
}
