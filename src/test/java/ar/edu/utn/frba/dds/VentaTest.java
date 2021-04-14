package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VentaTest {
	
	private Prenda saco;
	private Prenda pantalon;
	private Prenda camisa;

	private NuevaPrenda nuevaPrenda;
	private PromocionPrenda promocionPrenda;
	private LiquidacionPrenda liquidacionPrenda;
	
	private Venta venta;
	private PagoEfectivo pagoEfectivo;
	private PagoTarjeta pagoTarjeta;
	
	private List<Prenda> prendas;
	
	@Before
	public void setUp() {

		nuevaPrenda = new NuevaPrenda();
		promocionPrenda = new PromocionPrenda(500);
		liquidacionPrenda = new LiquidacionPrenda();

		saco = new Prenda(8000, nuevaPrenda);
		pantalon = new Prenda(4000, promocionPrenda);
		camisa = new Prenda(2500, liquidacionPrenda);
		
		pagoEfectivo = new PagoEfectivo();
		pagoTarjeta = new PagoTarjeta(6, 10);
		
		prendas = new ArrayList<Prenda>();
		
		prendas.add(saco);
		prendas.add(pantalon);
		prendas.add(camisa);
		
	}
	
	@Test
	public void calcularPagoEnEfectivo() {
		venta = new Venta(prendas, LocalDate.now(), pagoEfectivo);
		Assert.assertTrue(venta.calcularGanancia() == 12750);		
	}
	
	@Test
	public void calcularPagoConTarjeta() {
		venta = new Venta(prendas, LocalDate.now(), pagoTarjeta);
		Assert.assertTrue(venta.calcularGanancia() == 12750 + 6 * 10 + venta.getPrendasVendidas().stream().mapToDouble(prenda -> prenda.getPrecio() * 0.01).sum());		
	}

}
