import java.util.Scanner;

public class Reto_NumeroMayor {
    public static void main(String[] args) {
        System.out.println("*** Número Mayor ***");
        System.out.print("Ingresa el primer número: ");
        var num1 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Ingresa el segundo número: ");
        var num2 = Integer.parseInt(new Scanner(System.in).nextLine());

        int mayor = num1>num2 ? num1 : num2;
        System.out.println("El número mayor es: "+mayor);

    }
}
