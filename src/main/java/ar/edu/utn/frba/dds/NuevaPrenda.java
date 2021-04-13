package ar.edu.utn.frba.dds;

public class NuevaPrenda implements EstadoPrenda {

	@Override
	public float getPrecio(Prenda prenda) {
		return prenda.getPrecioBase();
	}

}
