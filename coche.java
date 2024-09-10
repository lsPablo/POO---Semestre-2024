public class coche {
    String marca;
    String modelo;
    int año;
    int añoActual = 2024;

    public coche (String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: "+marca+
                            ", Modelo: "+modelo+
                            ", Año: "+año);
    }

    public void calcularEdadDelCoche(){
        System.out.println("El coche tiene un total de " +(añoActual - año)+ " años \n");
    }
    
    }
    
