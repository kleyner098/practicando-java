public class Persona {
    
    /* Variables de instancia o Atributos de objeto */
    private String nombre;
    private int edad;
    private static int contadorPersonas; // atributo estático

    /* Método constructor */
    public Persona(String nombre) {
       this(nombre,0); // Llamamos al segundo constructor con edad 0 
    }

    /* Constructor alternativo */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++; // Incrementamos el atributo estático
    }

    /* Métodos */
    public void presentarse() {
        System.out.println("Mi nombre es " + this.nombre 
        + " y tengo " + this.edad + " año(s)");
    }

    /* Método para modificar estado */
    public void crecer() {
        this.edad = this.edad + 1;
    }

    /* Sobrecarga de métodos */
    public void crecer(int years) {
        this.edad = this.edad + years;
    }

    /* Método devolver un entero */
    public int devolverEdad() {
        return this.edad;
    }

    /* Es mayor de Edad */
    public boolean esMayorDeEdad() {
        if (this.edad < 18) {
            return false;
        }
        return true;
    }

    /* Ejemplo de getter  */
    public String getNombre(){
        return this.nombre;
    }

    /* Ejemplo de setter  */
     public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /* Ejemplo de toString */
    public String toString() {
        return this.nombre + ", edad " + this.edad + " years";
    }

    /* Método estático */
    public static int getContadorPersonas () {
        return contadorPersonas; // se puede acceder sin crear una persona
      }

}
