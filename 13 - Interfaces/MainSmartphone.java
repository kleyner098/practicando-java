public class MainSmartphone {
    public static void main(String[] args) {
        Smartphone motoG = new Smartphone();
        motoG.obtenerCoordenadasAproximadas(); // Obteniendo coordenadas aproximadas por wifi y GSM...
        motoG.siguiente(); //Siguiente desde reproductor de música

        // Método estático. Llamada a la interfaz no a la clase implementada
        ReproductorMusica.comercial("Motorola");  
    }  
}

interface GPS {
    public void obtenerCoordenadas();
    default public void obtenerCoordenadasAproximadas() {
        // implementación para devolver coordenadas de fuentes aproximadas
        // como wifi y móvil
        System.out.println("Obteniendo coordenadas aproximadas por wifi y GSM...");
    }
}

interface Radio {
    public void iniciarRadio();
    public void detenerRadio();

    // Ejemplo de dos interfaces con la misma firma de métodos
    default public void siguiente() {
        System.out.println("Siguiente emisora de Radio");
    }
}

interface ReproductorMusica extends Radio {

    // Ejemplo de dos interfaces con la misma firma de métodos
    default public void siguiente() {
        System.out.println("Siguiente canción del Reproductor de Música");
    }

    // Ejemplo de método estático en interfaces
    public static void comercial(String patrocinador) {
        System.out.println("Nuevo mensaje de " + patrocinador);
      }
      
}

// Implementando varios interfaces en nuestra clase
class Smartphone implements GPS,ReproductorMusica { // Separamos los interfaces por comas
    public void obtenerCoordenadas() {
        // devuelve algunas coordenadas
    }
    /* Implmentamos los métodos de radio */
    public void iniciarRadio() {
      // iniciar Radio
    }
    public void detenerRadio() {
        // detener Radio
    }

    // sin implementación de getRoughCoordinates()

    // Ejemplo de dos interfaces con la misma firma de métodos y uso de super en ese caso
    public void siguiente() {
        // Supongamos que deseas llamar a siguiente del ReproductorMusica
        ReproductorMusica.super.siguiente();
        //Radio.super.siguiente(); /* Ojo si Reproductor de musica hereda de Radio esto da error */
    }
}