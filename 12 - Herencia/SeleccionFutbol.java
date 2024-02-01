public class SeleccionFutbol {
    

	protected int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;

    public SeleccionFutbol() {
       
	}

	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}
	// getter y setter
    
	public void concentrarse() {
        System.out.println("Estoy ocupado en una contentración");
	}

	public void viajar() {
		System.out.println("Estoy ocupado viajando");
	}
	
}
    

