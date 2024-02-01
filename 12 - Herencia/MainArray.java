public class MainArray {
    public static void main(String[] args) {

        /* Modelado de las efectividades en el ejercicio de Pokemon */
        double[][] efectividad = {{0.5, 0.5, 2, 2}, {2, 0.5, 0.5, 1}, {0.5, 2, 0.5, 0.5}, {1, 1, 1, 0.5}};
        /* Agua = 0; Fuego = 1; Planta = 2; Electrico 3 */
        /* Primero defensor; Segundo atacante */
        System.out.println("" + efectividad[0][0]);
        System.out.println("" + efectividad[0][2]);
    }
    
}
