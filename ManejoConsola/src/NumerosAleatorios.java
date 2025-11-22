import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números aleatorios ***");
        var random = new Random();

        // Generar un número aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Numero Aleatorio = " + numeroAleatorio);
        var numeroAleatorio2 = random.nextInt(10)+1;
        System.out.println("numeroAleatorio2 = " + numeroAleatorio2);
        var booleanAleatorio = random.nextBoolean();
        System.out.println("booleanAleatorio = " + booleanAleatorio);
        var doubleAleatorio = random.nextDouble()*10;
        System.out.println("doubleAleatorio = " + doubleAleatorio);
    }
}
