public class Reto2_Variables {
    public static void main(String[] args) {
        System.out.println("*** Detalle producto ***");
        String producto = "Producto1";
        double precio = 10000.50;
        int cantidadDisponible = 40;
        boolean estaDisponible = true;

        System.out.println("Producto = " + producto);
        System.out.println("Precio = $" + precio);
        System.out.println("Cantidad = " + cantidadDisponible);
        System.out.println("Está disponible? = " + estaDisponible);

        producto = "Producto Actualizado";
        precio = 8000.30;
        cantidadDisponible = 0;
        estaDisponible = false;

        System.out.println("\n*** Variables modificadas ***");
        System.out.println("Producto = " + producto);
        System.out.println("Precio = $" + precio);
        System.out.println("Cantidad = " + cantidadDisponible);
        System.out.println("Está disponible? = " + estaDisponible);
    }
}
