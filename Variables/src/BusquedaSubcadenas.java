public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas - indexOf
        var cadena1 = "Hola mundo";
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        var indice2 = cadena1.indexOf("o");
        System.out.println("Primera letra o = " + indice2);
        var indice3 = cadena1.lastIndexOf("o");
        System.out.println("Última letra o = " + indice3);

        // Reemplazar subcadenas
        var cadena = "Hola mundo";
        System.out.println("cadena original= " + cadena);
        var nuevaCadena = cadena.replace("mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Caracteres especiales
        // \n = Salto de linea
        // \t = Tabulador
        // \' = Escapa la comilla simple *Aplica también para "
        // \\ = Barra invertida
    }
}
