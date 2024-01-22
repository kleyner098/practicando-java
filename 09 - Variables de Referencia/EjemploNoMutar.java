public class EjemploNoMutar {
    
    public static void main(String[] args) {
        int numero = 1;
        llamadaFuncion(numero);
           
        System.out.println("El número es todavia: " + numero);
    }
       
    public static void  llamadaFuncion(int numero) {
        System.out.println("Número al principio de la función: " + numero);
        numero = numero + 1;
        System.out.println("Número al final de la función: " + numero);
    }
    
}
