public class SistemaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de hoteles ***");
        var titulo = "Reservación #1";
        var nombreCliente = "Brayan Rivas";
        var diasEstancia = 4;
        var tarifaDiaria = 70000;
        var vistaAlMar = true;

        System.out.println("\n"+titulo);
        System.out.println("Nombre: "+nombreCliente);
        System.out.println("Dias estancia: "+diasEstancia);
        System.out.println("Tarifa diaria: $"+tarifaDiaria);
        System.out.println("Tiene vista al mar?: "+vistaAlMar);

        titulo = "Reservación #2";
        nombreCliente = "Laura Rivas";
        diasEstancia = 6;
        tarifaDiaria = 65000;
        vistaAlMar = false;

        System.out.println("\n"+titulo);
        System.out.println("Nombre: "+nombreCliente);
        System.out.println("Dias estancia: "+diasEstancia);
        System.out.println("Tarifa diaria: $"+tarifaDiaria);
        System.out.println("Tiene vista al mar?: "+vistaAlMar);
    }
}
