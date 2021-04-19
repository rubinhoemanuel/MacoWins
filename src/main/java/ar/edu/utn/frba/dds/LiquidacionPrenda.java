package ar.edu.utn.frba.dds;

public class LiquidacionPrenda implements EstadoPrenda {

	@Override
	public double getPrecio(double precioPropio) {
		return precioPropio * 0.5;
	}

}
