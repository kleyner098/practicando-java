
/*  Cómo saber los valores por defecto de los tipos primitivos de datos en Java
 *  Metemos los tipos en una clase y realizamos la impresión por pantalla
 */

class ValoresPorDefecto {

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    void imprimirValoresIniciales() { 

        System.out.println("Tipo Variable\tValor Inicial");
        System.out.println("boolean\t\t" + t);
        System.out.println("char\t\t[" + c + "]");
        System.out.println("byte\t\t" + b);
        System.out.println("short\t\t" + s);
        System.out.println("int\t\t" + i);
        System.out.println("long\t\t" + l);
        System.out.println("float\t\t" + f);
        System.out.println("double\t\t" + d);
            
    }
}