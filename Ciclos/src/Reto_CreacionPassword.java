import java.util.Scanner;

public class Reto_CreacionPassword {
    public static void main(String[] args) {
        final var LIMITE_PASSWORD = 6;
        var condicion = false;
        String password;

        System.out.println("*** Creación de password ***");

        while (!condicion){
            System.out.print("Ingrese el password deseado(mínimo 6 caracteres): ");
            password = new Scanner(System.in).nextLine();
            if (password.length() >= LIMITE_PASSWORD){
                System.out.println("Password valido!");
                condicion = true;
            }else
                System.out.println("Valor incorrecto, tenga en cuenta que debe contener al menos 6 caracteres.\n");
        }
    }
}
