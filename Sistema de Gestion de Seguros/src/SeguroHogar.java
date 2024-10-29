public class SeguroHogar extends Seguro {
    public boolean zonaDeRiesgo;
    public String zona;

    public SeguroHogar(String nombreTitular, Double valorAsegurado, int edadUsuario, boolean zonaDeRiesgo) {
        super(nombreTitular, valorAsegurado, edadUsuario);
        this.zonaDeRiesgo = zonaDeRiesgo;
    }


        @Override
        public void calcularPrima () {
            prima = (500 + (0.02 * valorAsegurado));
            if (zonaDeRiesgo == true) {
                primaFinal = prima * 1.2;
            } else {
                primaFinal = prima;
            }
        }

        @Override
        public void detallesSeguro () {
            if (zonaDeRiesgo == true) {
                zona = "Esta en una zona de riesgo";
            } else {
                zona = "La propiedad no esta en una zona de riesgo";
            }
        super.detallesSeguro();
        System.out.println(zona);

    }
}
