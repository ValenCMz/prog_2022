package SistemaElectoral;

public class Persona {
	private String nombre;
	private long dni;
	
	public Persona(String nombre, long dni) {
		this.nombre = nombre;
		this.dni = dni;	
	}
	
	public long getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Persona p = (Persona)obj;
			return p.getDni()==this.getDni();
		}catch(Exception e) {
			return false;
		}
	}
}
