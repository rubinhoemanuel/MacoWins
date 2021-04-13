package ar.edu.utn.frba.dds;

public class Prenda {

	private float precioBase;
	private EstadoPrenda estado;

	public Prenda(float precioBase, EstadoPrenda estado) {
		this.precioBase = precioBase;
		this.estado = estado;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}
	
	public float getPrecio() {
		return estado.getPrecio(this);
	}

}
