import java.util.Scanner;

public class Reto_CreacionPasswordV2 {
    public static void main(String[] args) {

        final var LIMITE_PASSWORD = 6;
        String password;

        System.out.println("*** Creación de password ***");
        System.out.print("Ingrese el password deseado(mínimo 6 caracteres): ");
        password = new Scanner(System.in).nextLine();

        while (password.length() < LIMITE_PASSWORD){
            System.out.println("El password no cumple con los requisitos, debe tener mínimo 6 caracteres.\n");
            System.out.print("Ingrese un nuevo valor de password: ");
            password = new Scanner(System.in).nextLine();
        }
        System.out.println("El valor de password es válido: "+password);
    }
}
