import java.util.Scanner;

public class Reto_EstacionDelAño {
    public static void main(String[] args) {
        System.out.println("*** identifica la estación del año ***");
        System.out.print("Ingresa el número correspondiente a un mes(1-12): ");
        var mes = Integer.parseInt(new Scanner(System.in).nextLine());
        String estacion;

        if ( mes==1 || mes==2 || mes==12 )
            estacion = "invierno";
        else if ( mes==3 || mes==4 || mes==5 )
            estacion = "primavera";
        else if ( mes==6 || mes==7 || mes==8 )
            estacion = "verano";
        else if ( mes==9 || mes==10 || mes==11 )
            estacion = "otoño";
        else
            estacion = "estación desconocida";

        System.out.printf("%nLa estación para el mes %d es %s.",mes, estacion);
    }
}
