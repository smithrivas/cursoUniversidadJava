public class Reto_AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Reto acumulador suma utilizando un ciclo while ***");
        var contador = 1;
        var acumulador = 0;
        while (contador<=5){
            // acumulador = acumulador+contador++;
            acumulador+=contador++;
        }
        System.out.println("Suma total: "+acumulador);
    }
}
