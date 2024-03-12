public class Cuenta {
    private double saldo; 
    public Cuenta(){
        saldo = 0;
    }
    public void ingresar (double c)
    {
        saldo += c;
    }
    //el método declara la excepción que puede provocar
    public void extraer (double c)throws SaldoInsuficienteException
    {
        if (saldo<c) {
        //creación y lanzamiento de la excepción
            throw new SaldoInsuficienteException("Error: Saldo en números rojos");
       
        }else{
            saldo -= c;
        }
    }
    public double getSaldo(){
        return saldo;
    }
}    
