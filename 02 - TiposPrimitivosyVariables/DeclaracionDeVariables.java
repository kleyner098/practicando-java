public class DeclaracionDeVariables {

    public static void main(String[] args) { 

        /* Este código tiene errores intencionalmente 

        double pi = 3.14;
        double pi = 3.141592653; // Declarar una variable con el mismo nombre da error

        System.out.println("El valor de pi es: " + pi);*/

        int valor = 10;
        System.out.println(valor);
        valor = 4;      // Asignamos un nuevo valor a la variable
        System.out.println(valor);

        boolean asignacionEnterosFuncionara = false;
        //asignacionEnterosFuncionara = 42; // No funciona

        int entero = 10;
        //asignacionEnterosFuncionara = entero; // Tampoco lo hace esto

        double a = 3.14;
        double b = 22.0;
        double c = a * b * b;

        System.out.println(c);

        double pi = 3.14;
        double radio = 22.0;
        double areaCirculo = pi * radio * radio;

        System.out.println(areaCirculo);

       
        final double PI = 3.141592653589793;  // Declaración de una constante
        
        final double DIAS_SEMANA;
        DIAS_SEMANA = 7;
        System.out.println(DIAS_SEMANA);
        //DIAS_SEMANA = 10.4; // Da error lo vemos marcado en rojo por el programa
     
        }
}
