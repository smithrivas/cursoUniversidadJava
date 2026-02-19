import java.util.Scanner;

public class Reto_SistemaBancario {
    public static void main(String[] args) {
        System.out.println("***Sistema Bancario***");
        System.out.print("Desea salir del sistema? (true/false): ");
        var salirSistema = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        // Aplicando logica inversa
        if (!salirSistema){
            System.out.println("Continuamos en el sistema...");
        }else{
            System.out.println("...Saliendo del sistema");
        }
    }
}
