public class EjemploFinally {

    public static void main(String[] argumentos) {
        try{
            int s=4/0;
            System.out.println("El programa sigue");
        }catch (ArithmeticException e){
            System.out.println("Se ha producido un error al intentar dividir por 0");
        }finally{
            System. out .println ("Aquí pondremos lo que queremos ejecutar siempre");
        }
        System. out .println ("Final del main");
    }
        
}
