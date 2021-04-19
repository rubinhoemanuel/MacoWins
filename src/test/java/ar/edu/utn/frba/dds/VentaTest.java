package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VentaTest {
	
	private VentaEnEfectivo ventaEnEfectivo;
	private VentaConTarjeta ventaConTarjeta;
	
	@Before
	public void setUp() {
		
		List<Item> items;
		
		items = new ArrayList<Item>();
		items.add(new Item(new Prenda(8000, new NuevaPrenda(), TipoPrenda.SACO), 1));
		items.add(new Item(new Prenda(4000, new PromocionPrenda(500), TipoPrenda.PANTALON), 1));
		items.add(new Item(new Prenda(2500, new LiquidacionPrenda(), TipoPrenda.CAMISA), 1));
		
		ventaEnEfectivo = new VentaEnEfectivo(items, LocalDate.now());
		ventaConTarjeta = new VentaConTarjeta(items, LocalDate.now(), 6, 10);
		
	}
	
	@Test
	public void calcularPagoEnEfectivo() {
		Assert.assertTrue(ventaEnEfectivo.importe() == 12750);		
	}
	
	@Test
	public void calcularPagoConTarjeta() {
		Assert.assertTrue(ventaConTarjeta.importe() == 12937.5);
	}

}
