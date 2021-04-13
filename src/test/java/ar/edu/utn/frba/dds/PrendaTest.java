package ar.edu.utn.frba.dds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {

	private Prenda saco;
	private Prenda pantalon;
	private Prenda camisa;

	private NuevaPrenda nuevaPrenda;
	private PromocionPrenda promocionPrenda;
	private LiquidacionPrenda liquidacionPrenda;

	@Before
	public void setUp() {

		this.nuevaPrenda = new NuevaPrenda();
		this.promocionPrenda = new PromocionPrenda(500);
		this.liquidacionPrenda = new LiquidacionPrenda();

		this.saco = new Prenda(8000, nuevaPrenda);
		this.pantalon = new Prenda(4000, promocionPrenda);
		this.camisa = new Prenda(2500, liquidacionPrenda);

	}

	@Test
	public void getPrecioNuevaPrenda() {
		Assert.assertTrue(this.saco.getPrecio() == 8000.0);
	}

	@Test
	public void getPrecioPromocionPrenda() {
		Assert.assertTrue(this.pantalon.getPrecio() == 3500.0);
	}

	@Test
	public void getPrecioLiquidacionPrenda() {
		Assert.assertTrue(this.camisa.getPrecio() == 1250.0);
	}

}
