import java.util.Scanner;

public class FeedbackBisiestos {
    public static void main (String [] args) {
             
        Scanner sc = new Scanner(System.in);
        int año = sc.nextInt();

        /*boolean esBisiesto = (año % 4 == 0) && ((año % 100 != 0) || ((año % 100 == 0)&&(año % 400 ==0)));
        System.out.println(esBisiesto?"Es un año bisiesto":"No es un año bisiesto");*/

        System.out.println((año % 4 == 0) && ((año % 100 != 0) || 
         ((año % 100 == 0) && (año % 400 ==0)))?"Es un año bisiesto":"No es un año bisiesto");

        sc.close();
    }
}
