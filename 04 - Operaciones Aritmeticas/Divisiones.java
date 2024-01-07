
public class Divisiones {
    public static void main(String[] args) {

        int resultado = 3 / 2;
        System.out.println(resultado); // El resultado es 1

        double dividendoPuntoFlotante = 3.0 / 2;
        System.out.println(dividendoPuntoFlotante); // El resultado es 1.5

        double divisorPuntoFlotante = 3 / 2.0;
        System.out.println(divisorPuntoFlotante); // El resultado es 1.5

        int primero = 3;
        int segundo = 2;

        double resultado1 = (double) primero / segundo;
        System.out.println(resultado1); //  El resultado es 1.5

        double resultado2 = primero / (double) segundo;
        System.out.println(resultado2); //  El resultado es 1.5

        double resultado3 = (double) (primero / segundo);
        System.out.println(resultado3); //  El resultado es 1.0 

        int entero = (int) 3.0 / 2;
        System.out.println(entero); // El resultado es 1

        
    }
}