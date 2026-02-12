public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a=3, b=-2, resultado;
        var c = true;
        
        // Operador unario +
        resultado = +a;
        System.out.println("resultado = " + resultado);
        // Operador unario -
        resultado = -a;
        System.out.println("resultado = " + resultado);

        // Operadores unitarios / Decremento
        a = 3;
        resultado = ++a; // Primero se incrementa, luego se asigna
        System.out.println("resultado = " + resultado);
        a = 3;
        resultado = a++; // Primero se asigna el valor original, luego se incrementa
        System.out.println("resultado = " + resultado);
        System.out.println("a = " + a);
    }
}
