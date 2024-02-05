

public class MainSeleccion {

    public static void main(String[] args) {
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        iniesta.entrenar();
        iniesta.jugarPartido();
        iniesta.viajar();
        iniesta.concentrarse();

        SeleccionFutbol [] seleccionados = new SeleccionFutbol[11];
        seleccionados[0] = iniesta;
        seleccionados[0].viajar();

    }
}
