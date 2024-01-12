import java.util.Random;

public class UsoRandom {
    public static void main (String [] args) {

        // Creamos un objeto Random (aleatorio)
        Random random = new Random();
        // generate random number from 0 to 3
        int number = random.nextInt(4);
        System.out.println(number);

    }
}
