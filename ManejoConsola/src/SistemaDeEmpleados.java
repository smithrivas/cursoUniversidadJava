import java.util.Scanner;

public class SistemaDeEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa tu salario: ");
        var salario = Double.parseDouble(consola.nextLine());
        System.out.print("Es jefe del área (true/false)?: ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        //Imprimir los valores
        System.out.println("\nDatos empleado:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        // System.out.println("Salario: $%.2f".formatted(salario));
        System.out.printf("Salario: $%.2f%n", salario);
        System.out.println("Jefe: "+esJefe);
    }
}
