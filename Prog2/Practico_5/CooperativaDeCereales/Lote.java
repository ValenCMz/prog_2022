package CooperativaDeCereales;

import java.util.ArrayList;

public class Lote {
	private String nombre;
	private ArrayList<String>minerales;
	private int superficie;
	
	public Lote(String nombre, int superficie) {
		this.nombre = nombre;
		this.minerales = new ArrayList<>();
		this.superficie = superficie;
	}
	public ArrayList<String> getMinerales(){
		return new ArrayList<>(minerales);
	}
	
//	un lote cumple los requerimientos de un cereal
//	si tiene todos los minerales que requiere el cereal
	public boolean loteCumple(Cereal cereal) {
		return cereal.cerealCumple(this);
	}
	
	public boolean contieneMineral(String mineral) {
		return this.getMinerales().contains(mineral);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public boolean esEspecial(ArrayList<String>mineralesInteresPrimario) {
		for(String mineral: mineralesInteresPrimario) {
			if(!this.contieneMineral(mineral)) {
				return false;
			}
		}
		return true;
	}
	
	

}
