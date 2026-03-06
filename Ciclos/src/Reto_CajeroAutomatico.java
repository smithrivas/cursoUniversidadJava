import java.util.Scanner;

public class Reto_CajeroAutomatico {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var salir = false;
        var saldo = 1000.00;

        while (!salir){
            System.out.print("""
                \n*** Aplicación Cajero Automático ***
                Operaciones que puedes realizar:
                \t1. Consultar saldo
                \t2. Retirar
                \t3. Depositar
                \t4. Salir
                
                Escoje una opción:\s""");
            var opcion = scanner.nextLine();

            switch (opcion){
                case "1"->System.out.println("Tu saldo actual es $"+saldo);
                case "2"->{
                    System.out.print("Ingrese el monto a retirar: ");
                    var retiro = Double.parseDouble(scanner.nextLine());
                    if (retiro >= 0 && retiro <= saldo){
                        saldo-=retiro;
                        System.out.printf("Tu nuevo saldo es: %.2f%n%n",saldo);
                    }else
                        System.out.printf("No cuentas con el saldo suficiente, tu saldo actual es: %.2f%n",saldo);
                }
                case "3"->{
                    System.out.print("Ingrese el monto a depositar: ");
                    var deposito = Double.parseDouble(scanner.nextLine());
                    if (deposito>0){
                        saldo+=deposito;
                        System.out.printf("Tu nuevo saldo es: %.2f%n",saldo);
                    }else{
                        System.out.print("Ingresa un monto valido!\n");
                    }
                }
                case "4"-> salir = true;
                default -> System.out.println("Opción invalida!");
            }
        }
        System.out.println("\nSaliendo del cajero automático. Hasta pronto!");
    }
}
