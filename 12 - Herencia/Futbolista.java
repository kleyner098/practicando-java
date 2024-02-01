public class Futbolista extends SeleccionFutbol {
    private int dorsal;
	private String demarcacion;
	
	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

    // getter y setter

	public void jugarPartido() {
        System.out.println("Estoy jugando un partido");
	}

	public void entrenar() {
		System.out.println("Estoy entrenando");
	}

    @Override // Anotación opcional que indica que se está sobrescribiendo un método
    public void concentrarse(){
        System.out.println("Estoy ocupado en la concentración haciendo cosas de jugador");
    }
}