
public class Operaciones {
    public static void main(String[] args) {

        int calculoConParentesis = (1 + 1) + 3 * (2 + 5);
        System.out.println(calculoConParentesis); // Imprime 23

        int calculoSinParentesis = 1 + 1 + 3 * 2 + 5;
        System.out.println(calculoSinParentesis); // Imprime 13

        System.out.println("Yo soy 22: " + 2 + 2);
        System.out.println("Cuatro: " + (2 + 2)); // La precedencia por parentesis aplica
        
    }
}