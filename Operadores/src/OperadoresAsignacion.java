public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de asignación ***");
        // Asignación
        var miNumero = 10;
        int miNumero2;       
        miNumero2 = 15;
        
        // +=
        miNumero += 5; // numero = numero+5
        System.out.println("miNumero = " + miNumero);
        // -=, *=, /= y %=
        miNumero *= 2;
        System.out.println("miNumero = " + miNumero);

        // Asignación de varias variables
        int a = 10, b = 15, c = 20; // Var solo permite una variable
        System.out.printf("a = %d%nb = %d%nc = %d", a, b, c);
    }
}
