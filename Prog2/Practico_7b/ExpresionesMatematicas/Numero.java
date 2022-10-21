package ExpresionesMatematicas;

public class Numero extends Expresion{
	private int valor;
	
	public Numero(int valor) {
		this.valor=valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public String getOperador() {
		return null;
	}


}
