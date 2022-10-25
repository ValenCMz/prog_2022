package CompaniaDeEnvios;

public class Carta extends ElementoEnvio{
	private Persona destinatario;
	private Persona remitente;
	private boolean envioDomicilio;
	private int peso;
	
	public Carta(Persona destinatario, Persona remitente, boolean envioDomicilio, int peso, int nroTracking) {
		super(nroTracking);
		this.destinatario=destinatario;
		this.remitente = remitente;
		this.envioDomicilio = envioDomicilio;
		this.peso= peso;
	}
		
	@Override
	public Persona getDestinatario() {
		return this.destinatario;
	}

	public int getPeso() {
		return this.peso;
	}
	
	public Persona getRemitente() {
		return this.remitente;
	}
}
