package CompaniaDeEnvios;

import java.util.ArrayList;

public class ComboPostal extends ElementoEnvio{
	private ArrayList<ElementoEnvio>elementos;
	
	public ComboPostal(int nroTracking) {
		super(nroTracking);
		this.elementos = new ArrayList<>();
	}
	
//	public boolean tieneMismaCiudadDestino() {
//		boolean noTiene = true;
//		int i = 0;
//		while()
//	}
	
	public void addElemento(ElementoEnvio e1) {
		if(e1.getCiudadDestino().equals(this.getCiudadDestino())) {
			this.elementos.add(e1);
			e1.setNroTracking(this.getNroTracking());
		}//si la ciudad de destino no es igual no lo agrego
	}
	
	@Override
	public void setNroTracking(int nroTracking) {
		//me cambio el numero yo
		super.setNroTracking(nroTracking);
		//y a mis hijos
		for(ElementoEnvio elemento:elementos) {
			elemento.setNroTracking(nroTracking);
		}
	}
	
	@Override
	public Persona getDestinatario() {
		return this.elementos.get(0).getDestinatario();
	}
	
	public Persona getRemitente() {
		return this.elementos.get(0).getRemitente();
	}

	public int getPeso() {
		int sum=0;
		for(ElementoEnvio elemento:elementos) {
			sum+=elemento.getPeso();
		}
		return sum;
	}
	
	
}
