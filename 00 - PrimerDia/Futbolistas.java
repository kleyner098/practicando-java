class Futbolistas {
    public static void main(String[] args) {
       
        // Ejemplo arrays + switch con cadenas
        String[] jugador =  {"delantero","medio","defensa","portero","entrenador"};
        
        System.out.println(jugador[5]);
        

        for (int i=0;i<jugador.length;i++){
            switch (jugador[i]) {
                case "delantero":
                    System.out.println("El delantero chuta");
                    break;

                case "medio":
                    System.out.println("El medio pasa el balon");
                    break;

                case "defensa":
                case "portero":
                    System.out.println("Defienden gol");
                    break;
        
                default:
                    System.out.println("Hola, entrenador");
                    break;
            }
        }

    }

         



    }