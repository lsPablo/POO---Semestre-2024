public class CalculadoraImpuestos {
    int ingresos;
    double porcentajeImpuestos;
    double dividendos;
    double exencion;

    // Constructor
    public CalculadoraImpuestos(int ingresos, Double porcentajeImpuestos, Double dividendos, Double exencion) {
        this.ingresos = ingresos;
        this.porcentajeImpuestos = porcentajeImpuestos;
        this.dividendos = dividendos;
        this.exencion = exencion;
    } 


    public void calcularImpuestos(int ingresos) {
        System.out.println("Los impuestos son un total de: $" + (ingresos + 0.15));
    }

    public void calcularImpuestos(int ingresos, double porcentajeImpuestos) {
        System.out.println("Los impuestos son un total de: $" + (ingresos * (porcentajeImpuestos / 100)));
    }

    public void calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion) {
        double impuestosE = (dividendos * (porcentajeImpuestos / 100));
        if (impuestosE > exencion) {
            System.out.println("Los impuestos son un total de: $" + (impuestosE - exencion));
        } else {
            System.out.println("Los impuestos son un total de: $0");
        }
    }

}

   


