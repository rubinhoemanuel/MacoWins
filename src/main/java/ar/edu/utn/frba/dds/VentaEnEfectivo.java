package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.List;

public class VentaEnEfectivo extends Venta {
	
	public VentaEnEfectivo(List<Item> items, LocalDate fecha) {
		super(items, fecha);
	}

	@Override
	protected double getRecargo() {
		return 0;
	}

}
