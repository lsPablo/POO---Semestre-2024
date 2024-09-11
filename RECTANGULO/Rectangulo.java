public class Rectangulo {
    double largo;
    double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void calcularArea(int largo, int ancho) {
        System.out.println("El área del rectángulo es de: " + (largo * ancho));
    }

    public void calcularArea(double largo, double ancho) {
        System.out.println("El área del rectángulo es de: " + (largo * ancho));
    }

    public void calcularPerimetro(int largo, int ancho) {
        System.out.println("El perímetro del rectángulo es de: " + (2 * (largo + ancho)));
    }

    public void calcularPerimetro(double largo, double ancho) {
        System.out.println("El perímetro del rectángulo es de: " + (2 * (largo + ancho)));
    }
}
