public class Rectangulo {

    double ladoUno;
    double alturaUno;

    public Rectangulo(Double ladoUno, Double alturaUno) {

        this.ladoUno = ladoUno;
        this.alturaUno = alturaUno;
    }

public void calcularperimetro(double alturaUno, double ladoUno) {
    double perimetro = (ladoUno*2 + alturaUno*2);
    System.out.println("el perimetro del rectangulo es: "+perimetro);
}
public void calculararea(double alturaUno, double ladoUno) {
    double area = (ladoUno*alturaUno);
    System.out.println("el area del rectangulo es: "+area);

}

public void calcularperimetro(int alturaUno, int ladoUno) {

    System.out.println("\n El resultado con numeros enteros es:");
    int perimetro = (ladoUno + alturaUno)*2;
    System.out.println("El perimetro del rectangulo es: "+perimetro);
}
    public void calculararea(int alturaUno, int ladoUno) {

    int area = (ladoUno*alturaUno);
        System.out.println("El area del rectangulo es: "+area);
    }

        }