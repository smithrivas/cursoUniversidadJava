public class GeneradorDeEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de emails ***");
        var nombre = "Brayan Smith Rivas";
        var empresa = "Dispapeles Colombia";
        var dominio = ".com.co";
        var usuarioNormalizado = nombre.toLowerCase().replace(" ", ".");
        var dominioNormalizado = "@"+empresa.toLowerCase().replace(" ", "")+dominio;
        var emailFinal = usuarioNormalizado+dominioNormalizado;

        System.out.println("Nombre usuario: "+nombre);
        System.out.println("Nombre usuario normalizado: "+usuarioNormalizado);
        System.out.println("\nNombre empresa: "+empresa);
        System.out.println("Extensión del dominio: "+dominio);
        System.out.println("Dominio de email normalizado: "+dominioNormalizado);
        System.out.println("\nEmail final generado = " + emailFinal);
    }
}
