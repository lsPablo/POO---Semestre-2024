public class Main {
    public static void main(String[] args) {
        coche cochePrimero = new coche("Fiat", "Multipla", 2017 );
        cochePrimero.mostrarInformacion();
        cochePrimero.calcularEdadDelCoche();

        coche cocheSegundo = new coche("BMW", "M3 GTR", 2003 );
        cocheSegundo.mostrarInformacion();
        cocheSegundo.calcularEdadDelCoche();

        coche cocheTercero = new coche("Reliant", "Robin", 1973 );
        cocheTercero.mostrarInformacion();
        cocheTercero.calcularEdadDelCoche();
    }

}