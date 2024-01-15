import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main (String [] args) {

        // Pruebas
        /*Random random = new Random();
        String [] posilidadesJugador = {"piedra","papel","tijera"};
        
        for (int i=0;i<=100;i++){
            //System.out.println(getSeleccionOrdenador());
            int randomIndex = random.nextInt(3);
            String seleccionJugador = posilidadesJugador[randomIndex];
            System.out.println("Seleccion ordenador: " +getSeleccionOrdenador()+" \tSeleccion jugador " + 
                 seleccionJugador + " \t " + jugarRonda(seleccionJugador, getSeleccionOrdenador()));
        }*/

        Scanner sc = new Scanner(System.in);
        String seleccionJugador = sc.nextLine(); // No estoy haciendo ninguna comprobacion
        String resultado = jugarRonda(seleccionJugador, getSeleccionOrdenador());
        System.out.println(resultado);
        sc.close(); // Cerramos el recurso

    }

    static public String getSeleccionOrdenador(){

        // Creamos un objeto Random (aleatorio)
        Random random = new Random();
        // generate random number from 0 to 2
        int number = random.nextInt(3);
        
        switch(number){
            case 0:
                return "Piedra";
            case 1: 
                return "Papel";
            case 2:
                return "Tijera";
        }

        return "Error";
    }

    static public String jugarRonda(String SeleccionJugador,String SeleccionOrdenador){

        if(SeleccionJugador.equalsIgnoreCase(SeleccionOrdenador)){
            return "Empate, " + SeleccionJugador + " es igual a " + SeleccionOrdenador;
        }

        /* Cambiar a SeleccionOrdenador y SeleccionJugador para que vean los problemas  */
        switch(SeleccionOrdenador){ // Cambiar a Seleccion Jugador para hacer saltar los problemas
            case "Piedra":
                return (SeleccionJugador.equalsIgnoreCase("Papel")) ? 
                "Ganas, Papel gana a Piedra" : "Pierdes, Piedra gana a Tijera";
             
            case "Papel":
                return (SeleccionJugador.equalsIgnoreCase("Tijera")) ? 
                "Ganas, Tijera gana a Papel" : "Pierdes, Papel gana a Piedra";

            case "Tijera":
                return (SeleccionJugador.equalsIgnoreCase("Piedra")) ? 
                "Ganas, Piedra gana a Tijera" : "Pierdes, Piedra gana a Papel"; // Erroneo
        }
        return "";

    }
}