public class Reto_DiaSemana2 {
    public static void main(String[] args) {
        System.out.println("*** Días de la semana ***");
        var dia = 0;

        String nombreDia = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Doming";
            default -> "Invalido";
        };
        System.out.println("El día es "+nombreDia);
    }
}
