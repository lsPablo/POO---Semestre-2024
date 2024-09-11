import java.util.Scanner;
public class MainImpuestos{

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la opción deseada:");
        System.out.println("1. Calcular impuestos solo con ingresos");
        System.out.println("2. Calcular impuestos con ingresos y porcentaje de impuestos");
        System.out.println("3. Calcular impuestos con dividendos, porcentaje de impuestos y exención");

        int opcion = scanner.nextInt();
        CalculadoraImpuestos calculadora;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese los ingresos: ");
                int ingresos = scanner.nextInt();
                calculadora = new CalculadoraImpuestos(0, 0.0, 0.0, 0.0);
                calculadora.calcularImpuestos(ingresos);
                break;

            case 2:
                System.out.print("Ingrese los ingresos: ");
                ingresos = scanner.nextInt();
                System.out.print("Ingrese el porcentaje de impuestos: ");
                double porcentajeImpuestos = scanner.nextDouble();
                calculadora = new CalculadoraImpuestos(ingresos, porcentajeImpuestos, 0.0, 0.0);
                calculadora.calcularImpuestos(ingresos, porcentajeImpuestos);
                break;

            case 3:
                System.out.print("Ingrese los dividendos: ");
                double dividendos = scanner.nextDouble();
                System.out.print("Ingrese el porcentaje de impuestos: ");
                porcentajeImpuestos = scanner.nextDouble();
                System.out.print("Ingrese la exención: ");
                double exencion = scanner.nextDouble();
                calculadora = new CalculadoraImpuestos(0, porcentajeImpuestos, dividendos, exencion);
                calculadora.calcularImpuestos(dividendos, porcentajeImpuestos, exencion);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        
    }
}

