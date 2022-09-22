package AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
	private ArrayList<Sensor>sensores;
	private Timbre timbre;

	public void addSensor(Sensor s1) {
		if(!sensores.contains(s1)) {
			sensores.add(s1);
		}
	}
	
//	public boolean comprobar() {
//		if((sensores.)||this.isSeRompioVidrio()||this.isMovimientoEnDomicilio()) {
//			return this.alarma.activar();
//		}
//		else {
//			return false;
//		}
//	}
}
