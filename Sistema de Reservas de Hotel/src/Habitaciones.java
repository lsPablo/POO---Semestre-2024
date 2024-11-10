public class Habitaciones {

    public TipoHabitacion tipoHabitacion;
    public double precioPorNoche;
    public boolean disponibilidad;
    public int noches;

    public Habitaciones(TipoHabitacion tipoHabitacion, boolean disponibilidad) {
        this.tipoHabitacion = tipoHabitacion;
        this.precioPorNoche = tipoHabitacion.getPrecioPorNoche();
        this.disponibilidad = disponibilidad;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public String datosHabitaciones(){
        return "Habitacion "+tipoHabitacion+ "\n Precio: $"+precioPorNoche;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void reservarHabitacion(int noches){
        double precioTotal=this.noches*this.precioPorNoche;
        System.out.println("Reserva total exitosa por "+noches+" noches");
        System.out.println("Costo total: $"+precioTotal);
        setDisponibilidad(false);
    }
}
