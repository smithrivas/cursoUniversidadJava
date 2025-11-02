public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de Var en java ***");
        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        // var: asigna automáticamente el tipo de dato, se tiene que inicializar, no se puede crear con valor null, el tipo de dato que se asigne no se puede modificar posteriormente.
    }
}
