public class Reto1_Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Generador de emails ***");
        var nombre = " Brayan Smith Rivas ";
        var empresa = "Caja Social";
        var dominio = ".com.co";

        var nombreEmail = nombre.strip().replace(" ", ".").toLowerCase();
        System.out.println("Nombre usuario: " + nombre);
        System.out.println("Nombre usuario normalizado: " + nombreEmail);

        var dominioNormalizado = "@"+empresa.replace(" ", "").toLowerCase()+dominio;
        System.out.println("\nNombre empresa: " + empresa);
        System.out.println("Extensión del dominio: " + dominio);
        System.out.println("empresaEmail: " + dominioNormalizado);

        var email = nombreEmail+dominioNormalizado;
        System.out.println("\nEmail final generado: " + email);
    }
}
