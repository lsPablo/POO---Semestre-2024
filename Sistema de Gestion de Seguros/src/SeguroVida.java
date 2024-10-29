public class SeguroVida extends Seguro{
    public SeguroVida(String nombreTitular, Double valorAsegurado, int edadUsuario) {
        super(nombreTitular, valorAsegurado, edadUsuario);
    }

    @Override
    public void calcularPrima(){
         prima=(400+(0.015*valorAsegurado));
        if(edadUsuario>60){
            primaFinal=prima*1.25;
        }else{
            primaFinal=prima;
        }
    }
}
