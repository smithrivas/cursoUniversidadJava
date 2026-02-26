import java.util.Scanner;

public class Reto_Calificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de calificaciones ***");
        System.out.print("Ingresa la calificación(0-10): ");
        var calificacion = Double.parseDouble(new Scanner(System.in).nextLine());

        String nota;
        if (calificacion>=9 && calificacion<=10)
            nota = "A";
        else if (calificacion>=8 && calificacion<9)
            nota = "B";
        else if (calificacion>=7 && calificacion<8)
            nota = "C";
        else if (calificacion>=6 && calificacion<7)
            nota = "D";
        else if (calificacion>=0 && calificacion<6)
            nota = "F";
        else
            nota = "Valor desconocido";

        System.out.printf("La nota que obtuviste (%.2f) equivale a: %s", calificacion, nota);
    }
}
