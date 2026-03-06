import java.util.Scanner;

public class Reto_Calculadora {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var salir = false;
        var num1 = 0.00;
        var num2 = 0.00;
        var operacion = 0.00;
        while (!salir){
            System.out.print("""
                *** Calculadora en Java ***
                Operaciones que puedes realizar:
                \t1. Suma
                \t2. Resta
                \t3. Multiplicación
                \t4. División
                \t5. Salir
                
                Escoja una opción:\s""");

            var opcion = scanner.nextLine();
            switch (opcion){
                case "1" -> {
                    System.out.print("Ingresa el valor 1: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingresa el valor 2: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    operacion = num1+num2;
                    System.out.printf("Resultado suma: %.2f%n%n", operacion);
                }
                case "2" -> {
                    System.out.print("Ingresa el valor 1: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingresa el valor 2: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    operacion = num1-num2;
                    System.out.printf("Resultado resta: %.2f%n%n", operacion);
                }
                case "3" -> {
                    System.out.print("Ingresa el valor 1: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingresa el valor 2: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    operacion = num1*num2;
                    System.out.printf("Resultado multiplicación: %.2f%n%n", operacion);
                }
                case "4" -> {
                    System.out.print("Ingresa el valor 1: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingresa el valor 2: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    if (num2 == 0)
                        System.out.print("Error: División por cero\n\n");
                    else{
                        operacion = num1/num2;
                        System.out.printf("Resultado división: %.2f%n%n", operacion);
                    }
                }
                case "5" -> {
                    salir = true;
                    System.out.println("Saliendo del programa de Calculadora!");
                }
                default -> System.out.println("Opción invalida, selecciona otra opción...\n");
            }
        }
    }
}
