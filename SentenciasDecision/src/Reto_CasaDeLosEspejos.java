import java.util.Scanner;

public class Reto_CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** Casa de los espejos ***");
        System.out.print("Cual es tu edad?: ");
        var edad = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Te da miedo la oscuridad?(true/false): ");
        var miedo = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        if (edad>=10 && !miedo){
            System.out.println("Puedes entrar a la casa de los espejos!!!");
        } else {
            System.out.println("No puedes entrar, la casa de los espejos podría darte miedo");
        }
    }
}
