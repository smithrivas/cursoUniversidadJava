import java.util.Scanner;

public class RetoTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Ticket De Venta ***");

        System.out.println("Ingrese el valor de cada uno de los 3 productos: ");
        var producto1 = Double.parseDouble(new Scanner(System.in).nextLine());
        var producto2 = Double.parseDouble(new Scanner(System.in).nextLine());
        var producto3 = Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("Aplicar algún descuento(%)?: ");
        var valorDescuento = Double.parseDouble(new Scanner(System.in).nextLine());

        var totalSinInpuesto = producto1+producto2+producto3;
        var descuento = totalSinInpuesto*(valorDescuento/100.0);
        var totalConDescuento = totalSinInpuesto-descuento;
        var impuesto = totalConDescuento*0.19;
        var totalConImpuesto = totalConDescuento+impuesto;
        var factura = """
                *** Factura de compra ***
                \tProducto 1: $%.2f
                \tProducto 2: $%.2f
                \tProducto 3: $%.2f
                \tTotal sin impuesto: $%.2f
                \tDescuento: $%.2f
                \tTotal con descuento: $%.2f\n
                \tImpuesto(19%%): $%.2f
                \tTotal con impuesto: $%.2f
                """.formatted(producto1, producto2, producto3, totalSinInpuesto, descuento, totalConDescuento, impuesto, totalConImpuesto);
        System.out.println(factura);
    }
}
