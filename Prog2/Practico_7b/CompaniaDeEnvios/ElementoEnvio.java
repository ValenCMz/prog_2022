package CompaniaDeEnvios;

public abstract class ElementoEnvio {

	private int nroTracking;
	
	public ElementoEnvio( int nroTracking) {
		this.nroTracking = nroTracking;
	}
	
	//no abstraemos esta funcion ya que se va a utilizar en los 2 hijos y si no tendriamos q hacer este set 2 veces
	public void setNroTracking(int nroTracking) {
		this.nroTracking = nroTracking;
	}
	
	public int getNroTracking() {
		return this.nroTracking;
	}
	
	public abstract Persona getDestinatario();//el envio conoce su destinatario, pero el combo no
	public abstract Persona getRemitente();
	
	//metodo template, metodo concreto q invoca metodo abstracto de la misma clase
	public String getCiudadDestino() {
		return this.getDestinatario().getCiudad();
	}
	
	public abstract int getPeso();
}
