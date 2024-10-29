public abstract class Seguro {

    public String nombreTitular;
    public Double valorAsegurado;
    public int edadUsuario;
    public Double prima;
    public Double primaFinal;


    public  Seguro(String nombreTitular, Double valorAsegurado, int edadUsuario) {
        this.nombreTitular = nombreTitular;
        this.valorAsegurado = valorAsegurado;
        this.edadUsuario = edadUsuario;
    }

    public abstract void calcularPrima();

    public void detallesSeguro() {
        System.out.println("Nombre: " + nombreTitular);
        System.out.println("Edad: " + edadUsuario);
        System.out.println("Valor Asegurado: $" + valorAsegurado);
        System.out.println("Prima inicial: $" + prima);
        System.out.println("Prima final: $" + primaFinal);

    }


}
