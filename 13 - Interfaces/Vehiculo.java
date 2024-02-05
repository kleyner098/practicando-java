public interface Vehiculo {

    public String matricula = ""; // Firma de campos
    public double maxVel=0.0;
    public void arrancar(); // Firma de métodos
    public void detener();

    // Método predeterminado, definimos su implementación ya en la interfaz
    default void claxon(){  
      System.out.println("Sonando claxon");
    }
}

class Coche implements Vehiculo {
    public void arrancar() {
        System.out.println("arrancando motor...");
    }
    public void detener() {
        System.out.println("deteniendo motor...");
    }
}

class Camion implements Vehiculo {
    public void arrancar() {
        System.out.println("arrancando el motor del camión...");
    }
    public void detener() {
        System.out.println("deteniendo el motor del camión...");
    }
}

class Arrancador {
    // método estático, se puede llamar sin instanciar la clase
    public static void arrancarMotor(Vehiculo vehiculo) {
        vehiculo.arrancar();
    }
}