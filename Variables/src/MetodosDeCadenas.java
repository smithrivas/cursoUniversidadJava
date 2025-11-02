public class MetodosDeCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";

        // Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Conv a mayuscula
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // Conv a minusculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);
        System.out.println(cadena1.toLowerCase());

        // Eliminar espacios inicio/fin cadena
        var cadena2 = " Brayan Rivas ";
        System.out.println("cadena con espacios = " + cadena2);
        System.out.println("cadena sin espacios = " + cadena2.trim());
    }
}
