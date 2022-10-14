package Parcialito;

import java.util.ArrayList;

public class Producto {
	//Solo estoy agregando las cosas q necesito para resolver los puntos, lo demas asumo que ya esta resuelto en figura1
	private ArrayList<String>componentes;
	
	public boolean tieneComponente(String componenteBuscado) {
		return componentes.contains(componenteBuscado);
	}
	
}
