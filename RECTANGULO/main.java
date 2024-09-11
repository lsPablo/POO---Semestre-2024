import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los datos del rectangulo del rectangulo");

        System.out.println("Ingresa la altura del rectangulo");
        double alturaUno = sc.nextDouble();
  

        System.out.println("Ingresa la base del rectangulo");
        double ladoUno = sc.nextDouble();


        System.out.println("\nCuadradoUno \n");
       Rectangulo rectanguloUno = new Rectangulo(ladoUno, alturaUno);
   
        rectanguloUno.calcularperimetro(ladoUno, alturaUno);
        rectanguloUno.calculararea(ladoUno,  alturaUno);
        rectanguloUno.calcularperimetro((int) ladoUno, (int)alturaUno);
        rectanguloUno.calculararea((int)alturaUno, (int)ladoUno);

    }
}