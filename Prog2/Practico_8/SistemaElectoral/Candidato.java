package SistemaElectoral;

public class Candidato extends Persona{
	private String partidoPolitico;
	private String agrupacion;
	
	public Candidato(String nombre,long dni,String partidoPolitico, String agrupacion) {
		super(nombre, dni);
		this.partidoPolitico = partidoPolitico;
		this.agrupacion = agrupacion;
	}
	
	public String getPartidoPolitico() {
		return this.partidoPolitico;
	}
	
	public String getAgrupacion() {
		return this.agrupacion;
	}
}
