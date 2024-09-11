import java.util.Scanner;

public class main{
    public static void main(String[] args) {
    
        double largo;
        double ancho;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el largo del rectangulo: ");
        largo=sc.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo: ");
        ancho=sc.nextDouble();
        
        Rectangulo rectanguloUsuario = new Rectangulo(largo, ancho);

        rectanguloUsuario.calcularArea(largo, ancho);
        rectanguloUsuario.calcularPerimetro(largo, ancho);
        

        
    }
}