public class EjemploCatch {
    public static void main(String[] argumentos) {
        try{
            int s=4/0;
            System.out.println("El programa sigue"); 
        } catch (ArithmeticException e){
            System.out.println("Se ha producido un error al intentar dividir por 0");
        } catch (Exception e){
            System. out .println ("Excepción general");
        }
        System. out .println ("Final del main");
        }
    }
    