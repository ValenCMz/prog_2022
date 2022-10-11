package SistemaDeAlquiler;


//*Permitir alquilar un determinado item a un cliente hasta una fecha determinada
//*Llevar control de los items alquilados a cada cliente
public abstract class Item {
	private String nombre;
	private String id;
	private int fechaLimite;
	private int fechaInicio;
	
	public Item(String nombre, String id, int fechaLimite, int fechaInicio) {
		this.nombre = nombre;
		this.id = id;
		this.fechaLimite = fechaLimite;
		this.fechaInicio = fechaInicio;
	}
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract boolean sePuedeAlquilar();
	
	public abstract void actualizar();
}
