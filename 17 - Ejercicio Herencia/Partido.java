

import java.util.Random;

public class Partido {
    public static void main(String[] args) {
       
        Equipo local = new Equipo();
        Equipo visitante = new Equipo();
        boolean bola = true; // true si tiene la bola el equipo local

        Random rd = new Random(); // Para seleccionar jugadores de forma aleatoria
        Jugador atacante,defensor;
        int[] contador = {0,0} ; // Para llevar la cuenta del tanteo de los equipos (local en la primera posición, visitante en la segunda)

         /* Hacer un bucle for que repita esto varias veces */
        for (int i=1;i<91;i++){ // Una jugada por cada minuto 

            String idat = (bola) ? "local":"visitante";     // Cadena para identificar equipo atacante
            String iddef = (bola) ? "visitante":"local";    // Cadena para identificar equipo defensor

            // Definimos dos jugadores aleatorios para nuestra jugada segun quien tenga la bola
            if (bola){ // Tiene la bola el equipo local
                atacante = local.getJugador(rd.nextInt(11));
                defensor = visitante.getJugador(rd.nextInt(11));
            }
            else{
                atacante = visitante.getJugador(rd.nextInt(11));
                defensor = local.getJugador(rd.nextInt(11));
            }

            // Vemos quien gana la jugada
            if (atacante.atacar()>=defensor.defender()){  // Gana la jugada el atacante
                
                if (defensor.getTipo().equals("Portero")){  // Si el porte es quien defiende y pierde se marca gol
                    if (bola){
                        System.out.println("Goooooooooooooool del equipo local");
                        contador[0]++; // Actualizamos nuestro contador
                        bola = false; // Saca el equipo visitante
                    }
                    else {
                        System.out.println("Goooooooooooooool del equipo visitante");
                        contador[1]++; // Actualizamos nuestro contador
                        bola = true; // Saca el equipo local s
                    }
                }
                // Si no, el equipo no tuvo exito pero el equipo rival no consiguió robar la bola
                else System.out.println(i + " " +contador[0] + " " + contador[1]+ " El atacante del equipo "+idat+" ataca sin éxito");
            }
            else { // Gana la jugada el defensor
                System.out.println(i +" " + contador[0] + " " + contador[1] + " El defensor del equipo "+iddef+" roba la bola");
                bola = !bola; // La bola cambia al equipo contrario
            }

            /* Para parar las iteraciones */
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

    }

        



    }
}
