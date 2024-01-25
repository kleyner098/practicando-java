public class CarreraCaracoles {
    public static void main(String[] args) {

        // Creamos nuestro array de Caracoles
        Caracol [] carreraCaracoles = new Caracol[9];
        
        // Asignamos dorsales a nuestros Caracoles
        for(int contador=0; contador<carreraCaracoles.length ; contador++){ 
            carreraCaracoles[contador] = new Caracol(contador+1);
        } 

        int ganador = 0;
        while (ganador == 0) { // Repetimos el bucle hasta que tengamos un ganador
            for (Caracol caracol : carreraCaracoles) {
                ganador = caracol.incrementarRecorrido();
                System.out.println(caracol.toString());
                if (ganador != 0) break;
            }

            System.out.println("");

            /* Para parar las iteraciones */
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
        }

        System.out.println("El ganador es el caracol número: " + ganador);

    }
}
