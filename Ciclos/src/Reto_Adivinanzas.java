import java.util.Scanner;

public class Reto_Adivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Adivina el número ***");
        System.out.println("Tienes 10 intentos para adivinar el número entre 1 y 50!");
        int numero;
        int numeroSecreto = (int)(Math.random()*50+1);
        var detener = false;
        var intentos = 0;

        while (!detener) {
            System.out.print("Qué número es?: ");
            numero = Integer.parseInt(new Scanner(System.in).nextLine());
            intentos++;
            if (numero == numeroSecreto){
                System.out.println("Felicitaciones! Adivinaste, el número era "+numero);
                System.out.println("Intentos: "+intentos);
               detener = true;
            } else if (numeroSecreto < numero) {
                System.out.println("El número secreto es menor, intenta de nuevo\n");
            }else{
                System.out.println("El número secreto es mayor, intenta de nuevo\n");
            }
        }
    }
}
