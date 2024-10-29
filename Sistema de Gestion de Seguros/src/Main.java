public class Main {
    public static void main(String[] args) {
        System.out.println("==== BIENVENIDO A SEGUROS BANANAMEX =====");
        System.out.println("__SEGUROS AUTOS__");
        SeguroAuto seguroAuto1 = new SeguroAuto("Pablo Cesar", 800.00, 30);
        seguroAuto1.calcularPrima();
        seguroAuto1.detallesSeguro();
        
        SeguroAuto seguroAuto2 = new SeguroAuto("Policarpio", 1000.00, 22);
        seguroAuto2.calcularPrima();
        seguroAuto2.detallesSeguro();

        System.out.println("__SEGUROS HOGAR__");
        SeguroHogar seguroHogar1 = new SeguroHogar("Cesar", 1050.00, 43, true);
        seguroHogar1.calcularPrima();
        seguroHogar1.detallesSeguro();

        SeguroHogar seguroHogar2 = new SeguroHogar("Policarpio", 1050.00, 43, false);
        seguroHogar2.calcularPrima();
        seguroHogar2.detallesSeguro();

        System.out.println("__SEGUROS VIDA__");
        SeguroVida seguroVida1 = new SeguroVida("Rosa Elia", 1000.00, 22);
        seguroVida1.calcularPrima();
        seguroVida1.detallesSeguro();

        SeguroVida seguroVida2 = new SeguroVida("Jesus Valencia", 1000.00, 65);
        seguroVida2.calcularPrima();
        seguroVida2.detallesSeguro();

    }
}