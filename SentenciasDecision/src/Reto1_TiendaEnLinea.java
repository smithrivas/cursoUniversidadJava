import java.util.Scanner;

public class Reto1_TiendaEnLinea {
    public static void main(String[] args) {

        final var MONTO_COMPRA_DESC = 1000.00;

        System.out.println("***Tienda en línea***");
        System.out.print("Cual fue el monto de tu compra?: ");
        var compra = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.print("Eres miembro de la tienda? (true/false): ");
        var miembro = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        double descuento;

        if (compra>=MONTO_COMPRA_DESC && miembro){
            descuento = 0.10;
        } else if (miembro) {
            descuento = 0.05;
        } else {
            descuento = 0;
        }

        double descuentoAplicado = compra*descuento;
        double total = compra-descuento;

        if(descuento!=0){
            System.out.printf("""
                    %nFelicidades!, has obtenido un descuento del %.0f%%
                    \tMonto de compra inical: $%.2f 
                    \tDescuento: $%.2f
                    \tValor total con descuento: $%.2f
                    """, descuento*100, compra, descuentoAplicado, total);
        }else {
            System.out.printf("""
                    %nNo obtuviste ningún tipo de descuento :(
                    Te invitamos a hacerte miembro de la tienda!
                    Monto final de la compra: $%.2f
                    """, compra);
        }
    }
}
