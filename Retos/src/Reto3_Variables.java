public class Reto3_Variables {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de hoteles ***");
        var nombreCliente = "Brayan Smith Rivas";
        var diasEstancia = 5;
        var tarifaDiaria = 90000.50;
        var vistaAlMar = false;

        System.out.println("Nombre del cliente= " + nombreCliente);
        System.out.println("Días de estancia = " + diasEstancia);
        System.out.println("Tarifa diaria = $" + tarifaDiaria);
        System.out.println("Tiene vista al mar? = " + vistaAlMar);

        diasEstancia = 4;
        tarifaDiaria = 85000.70;
        vistaAlMar = true;

        System.out.println("\n*** Factura modificada ****");
        System.out.println("Nombre del cliente= " + nombreCliente);
        System.out.println("Días de estancia = " + diasEstancia);
        System.out.println("Tarifa diaria = $" + tarifaDiaria);
        System.out.println("Tiene vista al mar? = " + vistaAlMar);
    }
}
