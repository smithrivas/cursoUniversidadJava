import java.util.Scanner;

public class Reto_SistemaAutenticación {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticación");
        final var USUARIO_SISTEMA = "admin";
        final var PASSWORD_SISTEMA = "123";

        System.out.print("Ingresa tu usuario: ");
        var usuario = new Scanner(System.in).nextLine().strip().toLowerCase();
        System.out.print("Ingresa tu password: ");
        var password = new Scanner(System.in).nextLine().strip().toLowerCase();

        /*
        if (usuario.equals(USUARIO_SISTEMA) && password.equals(PASSWORD_SISTEMA)){
            System.out.println("Bienvenido al sistema!");
        } else if (!usuario.equals(USUARIO_SISTEMA) && password.equals(PASSWORD_SISTEMA)) {
            System.out.println("Usuario invalido, por favor corregirlo!");
        } else if (usuario.equals(USUARIO_SISTEMA) && !password.equals(PASSWORD_SISTEMA)) {
            System.out.println("Password invalido, por favor corregirlo!");
        } else if (!usuario.equals(USUARIO_SISTEMA) && !password.equals(PASSWORD_SISTEMA)) {
            System.out.println("Usuario y password inválidos");
        }
         */
        var mensajeAutenticacion = switch (usuario){
            case USUARIO_SISTEMA -> {
                if (PASSWORD_SISTEMA.equals(password))
                    yield "Bienvenido al sistema!";
                else
                    yield "Password incorrecto, por favor corregirlo!";
            }
            default -> {
                if (PASSWORD_SISTEMA.equals(password))
                    yield "Usuario invalido, por favor corregirlo!";
                else
                    yield "Usuario y password inválidos";
            }
        };

        System.out.println(mensajeAutenticacion);
    }
}
