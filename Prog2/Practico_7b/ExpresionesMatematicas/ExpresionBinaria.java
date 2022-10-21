package ExpresionesMatematicas;

public abstract class ExpresionBinaria extends Expresion{
	private Operador operador;
	private Expresion e1;
	private Expresion e2;
	
	public ExpresionBinaria(Operador operador, Expresion e1, Expresion e2) {
		this.operador = operador;
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	
	public String getOperador() {
		return this.getOperador();
	}
	
	public abstract int getValor();
	
}
