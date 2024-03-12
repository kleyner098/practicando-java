public class ClasesEnvoltorio {

    public static void main(String[] args) {

        Integer i2 = Integer.valueOf("101011", 2); 
        // Convierte 101011 a 43 y asigna el valor 43 al objeto Integer i2 
        Float f2 = Float.valueOf("3.14f"); // asigna 3.14 al objeto // Float f2


        byte b = i2.byteValue(); // convierte el valor de i2 a byte 
        short s = i2.shortValue(); // otro método de xxxValue para números enteros 
        double d = i2.doubleValue(); // otro más
        System.out.println("i2 " + i2 + " d " + d );

        short s2 = f2.shortValue(); // convierte el valor de f2's a short 
        System.out.println("s2" + s2); // el resultado es 3 (truncado, no redondeado)

        double d4 = Double.parseDouble("3.14"); // convierte un String a un primitivo 
        System.out.println("d4 = " + d4); // el resultado es d4 = 3.14        
        Double d5 = Double.valueOf("3.14"); // crea un objeto Double
        System.out.println(d5 instanceof Double); // el resultado es "true" 
        long L2 = Long.parseLong("101010", 2); // binary String a 
        System.out.println("L2 = " + L2); // resultado es: L2 = 42 
        Long L3 = Long.valueOf("101010", 2); // binary String a Long objecto 
        System.out.println("L3 value = " + L3); // resultado es: L3 value = 42 

    
        System.out.println("d5 = "+ d5.toString() ); // result is d = 3.14 
        String d6 = Double.toString(3.14); // d = "3.14"

        int p = 5; 
        Integer n = Integer.valueOf(p);

        int p2 = 5; 
        Integer n2 = p2;





    }
    
}
