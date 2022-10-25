package PuertoDeCereales;

public class Puerto {
	private ColaDeEspera colaBarcos;
	private ColaDeEspera colaCamiones;
	
	public Puerto() {
		this.colaBarcos = new ColaDeEspera();
		this.colaCamiones = new ColaDeEspera();
	}
	
	public void descargarCamion(Camion camion) {
		if(camion==null)return;
		if(!colaCamiones.estaVacia()) {
			colaCamiones.addElemento(camion);
		}
		else {
			Barco barcoLibre = (Barco) colaBarcos.siguienteElemento();
			barcoLibre.descargar(camion);
		}
	}
	
	//funcion para cargar el barco (ordenar)
	public void cargarBarco(Barco barco) {
		if(barco==null)return;
		if(!colaBarcos.estaVacia()) {
			colaBarcos.addElemento(barco);
		}
		else {
			Camion camionLibre = (Camion) colaCamiones.siguienteElemento();
			barco.descargar(camionLibre);
		}
	}
}
