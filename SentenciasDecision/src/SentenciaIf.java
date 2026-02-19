public class SentenciaIf {
    public static void main(String[] args) {
        var edad = 10;
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }else if (edad>=13 && edad<18){
            System.out.println("Es un adolecente");
        }else{
            System.out.println("Es un niño");
        }
    }
}
