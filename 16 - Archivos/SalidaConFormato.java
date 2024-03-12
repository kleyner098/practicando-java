import java.util.Calendar;

public class SalidaConFormato {
    public static void main(String[] args) {

        double cuad=Math.PI*Math.PI; 
        //System.out.printf("El cuadrado de %1$.4f es %2$.2f",Math.PI, cuad);
        
        Calendar c = Calendar.getInstance(); 
    
        System.out.printf("%1$tH:%1$tM:%1$tS---%1$td de %1$tB"+ " de %1$ty", c);

        System.out.println("\n"+ c);

    }
}
