public abstract class Envio {
    double costoBase;
    double peso;

    public Envio(double costoBase, double peso) {
        this.costoBase = costoBase;
        this.peso = peso;
    }

    public abstract void calcularTiempoYCostoEntrega();

    public void validarPeso(double peso) {
        if (peso < 0){
            System.out.println("Peso invalido");
        } else {
            System.out.println("Peso: " + peso);
        }
    }
}

