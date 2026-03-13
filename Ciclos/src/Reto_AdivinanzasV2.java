import java.util.Random;
import java.util.Scanner;

public class Reto_AdivinanzasV2 {
    public static void main(String[] args) {
        System.out.println("*** Adivina el número ***");
        System.out.println("Tienes 10 intentos para adivinar el número entre 1 y 50!");
        var random = new Random();

        var numeroSecreto = random.nextInt(50)+1;
        var numero = 0;
        var intentos = 0;
        final var INTENTOS_MAXIMOS = 10;

        while (numeroSecreto != numero && intentos < INTENTOS_MAXIMOS){
            System.out.print("Ingresa el número (1-50): ");
            numero = new Scanner(System.in).nextInt();

            if (numeroSecreto < numero) {
                System.out.println("El número secreto es menor, intenta de nuevo\n");
            }else if (numeroSecreto > numero){
                System.out.println("El número secreto es mayor, intenta de nuevo\n");
            }

            intentos++;
        }

        if (numero == numeroSecreto) {
            System.out.println("Felicitaciones! Adivinaste, el número era "+numero);
            System.out.println("Intentos: "+intentos);
        }else{
            System.out.println("Perdiste, alcanzaste los intentos máximo!");
            System.out.println("El número correcto era "+numero);
        }
    }
}
