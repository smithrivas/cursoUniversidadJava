public class ComparacionesCadena {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        System.out.print("Cadena1 es igual a Cadena 2: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
