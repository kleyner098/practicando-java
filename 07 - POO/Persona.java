public class Persona {
    
    /* Variables de instancia o Atributos de objeto */
    private String nombre;
    private int edad;

    /* Método constructor */
    public Persona(String nombreInicial) {
        this.edad = 0;
        this.nombre = nombreInicial;
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
        return this.nombre + ", edad " + this.edad + " años";
    }

}
