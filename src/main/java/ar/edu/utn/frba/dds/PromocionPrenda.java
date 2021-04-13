package ar.edu.utn.frba.dds;

public class PromocionPrenda implements EstadoPrenda {

	private int valorFijo;

	public PromocionPrenda(int valorFijo) {
		this.valorFijo = valorFijo;
	}

	@Override
	public float getPrecio(Prenda prenda) {
		return prenda.getPrecioBase() - this.valorFijo;
	}

	public int getValorFijo() {
		return valorFijo;
	}

	public void setValorFijo(int valorFijo) {
		this.valorFijo = valorFijo;
	}

}
