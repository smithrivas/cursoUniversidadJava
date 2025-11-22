public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas (.format) ***");
        var nombre = "Brayan";
        var edad = 32;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s \nEdad: %d \nSalario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);
        System.out.println("\n*** Metodo printf ***");
        System.out.printf("Nombre: %s \nEdad: %d \nSalario: $%.2f \n", nombre, edad, salario);

        var numeroEmpleado = 12;
        // Formateo con textblock
        mensaje = """
                %nDetalle persona:\s
                ---------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // Formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle persona 2:\s
                ---------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
