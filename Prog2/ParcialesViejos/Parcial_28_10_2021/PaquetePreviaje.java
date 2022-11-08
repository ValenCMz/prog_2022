package Parcial_28_10_2021;

import java.time.LocalDate;

public class PaquetePreviaje extends PaqueteSimple{
	private int porcDescuento;
	private LocalDate inicioPromo;
	private LocalDate finPromo;
	
	public PaquetePreviaje(String datosAlojamiento, String ciudadOrigen, String ciudadDestino, LocalDate fechaDePago,
			int costo, int cantPasajeros, int id, int porcDescuento, LocalDate inicioPromo, LocalDate finPromo) {
		super(datosAlojamiento, ciudadOrigen, ciudadDestino, fechaDePago, costo, cantPasajeros, id);
		this.porcDescuento = porcDescuento;
		this.inicioPromo = inicioPromo;
		this.finPromo = finPromo;
	}
	
	public int getCosto() {
		if(this.getFechaPago()!=null) {
			if(this.getFechaPago().isAfter(inicioPromo)&&this.getFechaPago().isBefore(finPromo)){
				return super.getCosto()*porcDescuento/100;
			}
		}
		return super.getCosto();
	}
	

	

	
}
