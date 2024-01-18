public class EjemploFunciones {
    public static void main (String [] args) {
            
        funcionEntero();
        System.out.println(funcionString(0));
        System.out.println(funcionString(7));
        funcionBoolean(true,"Hola");
        procedimiento(8,"Rodrigo");

    }

    static int funcionEntero()//Función sin parámetros
    {
        int suma = 5+5;
        return suma; //Termina la ejecución del método
    }

    static public String funcionString(int n)//método con un parámetro
    {
        if(n == 0)//Usamos el parámetro en la función
        {
            return "a"; //Si n es cero retorna a
            //Notar que de aquí para abajo no se ejecuta nada más
        }
        return "x";//Este return sólo se ejecuta cuando n NO es cero
    }

    static boolean funcionBoolean(boolean n, String mensaje)//Método con dos parámetros
{
        if(n)//Usamos el parámetro en el método
        {
            System.out.println(mensaje);//Mostramos el mensaje
        }
        return n; //Usamos el parámetro como valor a retornar
}

    static void procedimiento(int n, String nombre) //Notar el void
    {
        if(n > 0 && !nombre.equals(""))//usamos los dos parámetros
        {
            System.out.println("hola " + nombre);
            return; //Si no ponemos este return se mostraría hola y luego adiós
        }
        //También podríamos usar un else en vez del return
        System.out.println("adios");
    }
}
