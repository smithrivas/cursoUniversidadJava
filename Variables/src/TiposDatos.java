public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos
        // Enteros (Valor default 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoEntero = 2147483647;
        System.out.println("tipoEntero = " + tipoEntero);
        long tipoLong = 98765432100L; // La L para indicar que es Long, sino lo toma como int
        System.out.println("tipoLong = " + tipoLong);

        // Flotante (Valor default 0.0)
        float tipoFloat = 3.14F; // La F para indicar que es Float, sino lo toma como double
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315; // D para indicar que es tipo double(opcional)
        
        // Caracter (Valor default '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        
        // Booleano (Valor default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (referencia)
        String nombre = null; // Valor default null
        System.out.println("nombre = " + nombre);
    }
}
