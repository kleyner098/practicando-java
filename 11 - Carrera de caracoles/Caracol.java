public class Caracol {
    private int dorsal;
    private double recorrido;
    private final int META = 10;

    /* Método constructor */
    public Caracol(int dorsal) {
        this.dorsal = dorsal;
        this.recorrido = 0;
    }
    
    /* Para calcular el recorrido de los caracoles, devuelve 0 si no han llegado
     * y el número del dorsal si lo han hecho
     */
    public int incrementarRecorrido() {
        this.recorrido = this.recorrido + Math.random();
        return (this.recorrido>=META) ? dorsal: 0 ; // Devolvemos 0 para todos los que no son el ganador
    }

    /* Para mostrar el recorrido de los caracoles
     */
    public String toString(){
        String salida = "";
        String llegada = "";
        double recorridoEntero = Math.floor(this.recorrido);

        for (int i=0;i<recorridoEntero;i++){
            salida = salida + "_";
        }
        for (int i=0;i<(META-recorridoEntero);i++){
            llegada = llegada + " ";
        }
       return salida+this.dorsal+llegada+"|";
       
    }

}