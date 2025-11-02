public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto = "Lavadora";
        double precio = 12.5;
        int cantidadDisponible = 520;
        boolean estaDisponible = true;

        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidadDisponible);
        System.out.println(estaDisponible);

        nombreProducto = "Computador";
        precio = 20.5;
        cantidadDisponible = 200;
        estaDisponible = false;
        System.out.println("\n"+nombreProducto);
        System.out.println(precio);
        System.out.println(cantidadDisponible);
        System.out.println(estaDisponible);
    }
}
