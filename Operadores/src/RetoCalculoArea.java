import java.util.Scanner;

public class RetoCalculoArea {
    public static void main(String[] args) {
        System.out.println("*** Cálculo Area Y Perímetro De Un Rectangulo***");
        System.out.print("Ingrese la base del rectángulo: ");
        var base = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Ingrese la altura del rectángulo: ");
        var altura = Integer.parseInt(new Scanner(System.in).nextLine());

        // Calculos
        var area = base*altura;
        var perimetro = 2*(base+altura);

        System.out.println("Área del rectangulo: " + area);
        System.out.println("Perimetro del rectangulo: " + perimetro);
    }
}


