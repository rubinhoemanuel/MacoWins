package ar.edu.utn.frba.dds;

public class LiquidacionPrenda implements EstadoPrenda {

	@Override
	public float getPrecio(Prenda prenda) {
		return (float) (prenda.getPrecioBase() * 0.5);
	}

}
