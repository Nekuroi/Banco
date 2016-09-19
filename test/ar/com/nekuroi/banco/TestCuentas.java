package ar.com.nekuroi.banco;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestCuentas {
	Double valor1 = 2000.0;
	Double valor2 = 1000.0;
	Double valor3 = 3000.0;
	Double descubierto = 50.0;
	Double interes = 5.0;

	@Test
	public void testAplicarInteres() {
		
		
		CajaDeAhorro MiCuenta = new CajaDeAhorro(valor1,interes);
		MiCuenta.executeInteres();
		
		assertEquals(valor1+(valor1*interes/100),MiCuenta.getSaldo(),0.01);
	}
	
	@Test
	public void testExtracciónMenorAlSaldo() {
		
		CuentaCorriente MiCuenta = new CuentaCorriente(valor1,descubierto);
		MiCuenta.extraer(valor2);
		
		assertEquals(valor1-valor2,MiCuenta.getSaldo(),0.01);
		assertEquals(descubierto,MiCuenta.getDescubierto(),0.01);
	}
	@Test
	public void testExtracciónMayorAlSaldo() {
		CuentaCorriente MiCuenta = new CuentaCorriente(valor2,valor2);
		MiCuenta.extraer(valor1);
		
		assertEquals(0,MiCuenta.getSaldo(),0.01);
		assertEquals(0,MiCuenta.getDescubierto(),0.01);
		
		//MiCuenta.extraer(valor1);
		
	}


}
