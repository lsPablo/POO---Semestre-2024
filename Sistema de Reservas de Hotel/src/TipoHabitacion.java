public enum TipoHabitacion {
    Individual(50),
    Doble(75),
    Suit(150);


    private final int precioPorNoche;
    TipoHabitacion(int precio) {
        this.precioPorNoche = precio;
    }

    public int getPrecioPorNoche() {
        return precioPorNoche;
    }

}
