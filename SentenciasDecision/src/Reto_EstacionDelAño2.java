import java.util.Scanner;

public class Reto_EstacionDelAño2 {
    public static void main(String[] args) {
        System.out.println("*** identifica la estación del año ***");
        System.out.print("Ingresa el número correspondiente a un mes(1-12): ");
        var mes = Integer.parseInt(new Scanner(System.in).nextLine());
        String estacion = switch (mes){
            case 1, 2, 12 -> "invierno";
            case 3, 4, 5 -> "primavera";
            case 6, 7, 8 -> "verano";
            case 9, 10, 11 -> "otoño";
            default -> "desconocida";
        };
        System.out.printf("%nLa estación para el mes %d es %s.",mes, estacion);
    }
}
