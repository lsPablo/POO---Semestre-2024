public class EnvioInternacional extends Envio{
    String pais;

    public EnvioInternacional(double costoBase, double peso, String pais) {
        super(costoBase, peso);
        this.pais = pais;
    }

    @Override
    public void calcularTiempoYCostoEntrega(){
        int dias = 10;
        if (peso > 10){
            dias = dias + 3;
        }
        double costoAdicional = costoBase * 0.2;
        double costoTotal = costoAdicional + costoBase;
        System.out.println("El tiempo de entrega es de " + dias + " dias");
        System.out.println("El costo base de entrega es de " + costoBase);
        System.out.println("El costo total de entrega es de " + costoTotal);
        System.out.println("El lugar de destino es " + pais);

    }
}
