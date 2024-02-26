

public class Jugador {
    /*  Atributos - los inicializaremos con el constructor */
    protected int agilidad; // Este atributo es comun a todos
    protected int fisico;
    protected int reflejos;
    protected int velocidad;
    
    protected int atributoPropioAtaque;  // Estos atributos cambian
    protected int atributoPropioDefensa;
    protected double probabilidadAtaque;
    protected double probabilidadDefensa;

    protected String tipo = "prueba.Jugador de Campo"; /* prueba.Jugador de Campo por defecto o prueba.Portero */

    public Jugador(int agilidad,int fisico, int reflejos, int velocidad){
        this.agilidad = agilidad;
        this.fisico = fisico;
        this.reflejos = reflejos;
        this.velocidad = velocidad;
    }

    public double atacar(){
        return probabilidadAtaque*agilidad*atributoPropioAtaque;
    }

    public double defender(){
        return probabilidadDefensa*agilidad*atributoPropioDefensa;
    }
    /* Necesario para comprobar si el jugador es un portero */
    public String getTipo(){
        return tipo;
    }
}

class Portero extends Jugador {

    public Portero (int agilidad,int fisico, int reflejos, int velocidad){
        super(agilidad,fisico,reflejos,velocidad);
        atributoPropioAtaque = fisico;
        atributoPropioDefensa = reflejos;
        probabilidadAtaque = 0.05;
        probabilidadDefensa = 0.75;
        tipo = "Portero";
    }
}

class Defensa extends Jugador {

    public Defensa (int agilidad,int fisico, int reflejos, int velocidad){
        super(agilidad,fisico,reflejos,velocidad);
        atributoPropioAtaque = velocidad;
        atributoPropioDefensa = fisico;
        probabilidadAtaque = 0.25;
        probabilidadDefensa = 0.75;
    }
}

class Medio extends Jugador {

    public Medio (int agilidad,int fisico, int reflejos, int velocidad){
        super(agilidad,fisico,reflejos,velocidad);
        atributoPropioAtaque = velocidad;
        atributoPropioDefensa = fisico;
        probabilidadAtaque = 0.5;
        probabilidadDefensa = 0.5;
    }
}

class Delantero extends Jugador {

    public Delantero (int agilidad,int fisico, int reflejos, int velocidad){
        super(agilidad,fisico,reflejos,velocidad);
        atributoPropioAtaque = velocidad;
        atributoPropioDefensa = fisico;
        probabilidadAtaque = 0.75;
        probabilidadDefensa = 0.25;
    }

}
