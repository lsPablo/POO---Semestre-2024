public class SeguroAuto extends Seguro {

    public SeguroAuto(String nombreTitular, Double valorAsegurado, int edadUsuario) {
        super(nombreTitular, valorAsegurado, edadUsuario);
    }

    @Override
    public void calcularPrima() {
         prima = (300 + (0.05 * valorAsegurado));
        if (edadUsuario < 25) {
             primaFinal = prima * 1.15;
        } else {
             primaFinal = prima;
        }

    }
}

