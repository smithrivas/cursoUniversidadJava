import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Validación de número ***");
        System.out.print("Ingrese un número: ");
        var num = Integer.parseInt(new Scanner(System.in).nextLine());
        if (num>0){
            System.out.println("Es positivo!");
        } else if (num<0) {
            System.out.println("Es negativo!");
        } else {
            System.out.println("Es cero!");
        }
    }
}
