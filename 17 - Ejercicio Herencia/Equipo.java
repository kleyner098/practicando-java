

import java.util.Random;

public class Equipo {
     /* Creamos dos arrays de 11 jugadores 1 portero, 2 defensas, 5 medios y 3 atacantes
        Los valores de los atributos serán aleatorios 
        En cada momento se seleccionará un jugador aleatorio del equipo */

        private Jugador[] equipo; 

        /* En el constructor creamos nuestro equipo */
        public Equipo(){
            equipo = new Jugador[11];
            Random rd = new Random(); //Para generar números aleatorios entre 0 y 10
            equipo[0] = new Portero(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[1] = new Defensa(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[2] = new Defensa(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[3] = new Medio(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[4] = new Medio(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[5] = new Medio(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[6] = new Medio(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[7] = new Medio(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[8] = new Delantero(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));
            equipo[9] = new Delantero(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));;
            equipo[10] = new Delantero(rd.nextInt(11),rd.nextInt(11),rd.nextInt(11),rd.nextInt(11));; 
        }

        /* Necesito una función que devuelva un jugador en función del indice */
        public Jugador getJugador(int index){
            return equipo[index];
        }


        
}
