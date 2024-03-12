public class Cajero{
    public static void main (String [] args){
    Cuenta c = new Cuenta(); 
    try{
        c.ingresar(100); 
        c.extraer (20);
        c.extraer (120);
    }catch (SaldoInsuficienteException e){
        System.out.println (e.getMessage());
    }
        
    System.out.println("Fin del programa");
    }
}

    