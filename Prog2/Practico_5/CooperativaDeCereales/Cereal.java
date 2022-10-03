package CooperativaDeCereales;


import java.util.ArrayList;

public class Cereal {
	private String nombre;
	ArrayList<String>minerales;
	
	public Cereal(String nombre) {
		this.nombre = nombre;
		this.minerales = new ArrayList<>();
	}

	public ArrayList<String> getMinerales(){
		return new ArrayList<>(minerales);
	}

	//el cereal cumple si tiene todos los minerales que el lote tambien tiene
	public boolean cerealCumple(Lote lote) {		
		return this.minerales.containsAll(lote.getMinerales());
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre :" + this.getNombre();
	}
}
