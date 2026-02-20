public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");

        // Par o inpar
        var numero = 1;
        var resultado = (numero%2 == 0) ? "Es número par" : "Es número inpar";
        System.out.println("Resultado número: " + resultado);

        // Calcular si es mayor de edad
        var edad = 18;
        var resultado2 = (edad>=18) ? "eres mayor de edad" : "eres menor de edad";
        System.out.println("\nTienes "+edad+" años, "+resultado2);

        // positivo, negativo o cero
        numero = 0;
        resultado = (numero>0) ? "Positivo" : (numero<0) ? "Negativo" : "Es cero";
        System.out.println("\nResultado número: " + resultado);
    }
}
