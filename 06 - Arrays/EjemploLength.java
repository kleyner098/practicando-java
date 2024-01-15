/* Ejemplo para mostrar el uso de la longitud de un array */

public class EjemploLength {
    public static void main (String [] args) {
            
        int [] nums=new int [10] ;
        for (int i=0 ; i<nums.length; i++)
        {
            nums [i] =i*2 ;
            System.out.println(nums[i]);
        }
    }
}
