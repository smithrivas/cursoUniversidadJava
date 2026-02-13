import java.util.Scanner;

public class RetoLogin {
    public static void main(String[] args) {
        System.out.println("*** Login ***");
        final var USUARIO = "admin";
        final var PASSWORD = "admin123";

        System.out.print("Ingrese el usuario: ");
        var usuarioIngresado = new Scanner(System.in).nextLine();
        System.out.print("Ingrese el password: ");
        var passwordIngresado = new Scanner(System.in).nextLine();

        var resultado = usuarioIngresado.equals(USUARIO) && passwordIngresado.equals(PASSWORD);
        System.out.println("Resultado de inicio de sesión: " + resultado);
    }
}
