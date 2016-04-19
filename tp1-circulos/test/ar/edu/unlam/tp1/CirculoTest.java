package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.unlam.programacionbasica2.tp1.Circulo;

public class CirculoTest {

	
	@Test
	public void circuloConRadioDos() {
		Circulo miCirculo = new Circulo(2.0);
		
		assertEquals(2.0, miCirculo.dameElRadioDeUnCirculo(),0.01);
	}
	
	@Test
	public void circuloConRadioTresPuntoSiete() {
		Circulo miCirculo = new Circulo(3.7);
		
		assertEquals(3.7, miCirculo.dameElRadioDeUnCirculo(),0.01);
	}
	
	@Test
	public void circuloConRadioCinco() {
		Circulo miCirculo = new Circulo(5.0);
		
		assertEquals(5.0, miCirculo.dameElRadioDeUnCirculo(),0.01);
	}
	
	@Test
	public void circuloConRadioDiezPuntoNueve() {
		Circulo miCirculo = new Circulo(10.9);
		
		assertEquals(10.9, miCirculo.dameElRadioDeUnCirculo(),0.01);
	}
	
	@Test
	public void comprobarQueElPerimetroDelCirculoConRadioNueveComaOchoEs615coma73() {
		Circulo miCirculo = new Circulo(9.8);
		
		assertEquals(615.73, miCirculo.dameElPerimetroDeUnCirculo(),0.01);
	}
	
	@Test
	public void ComprobarQueElAreaDeUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo miCirculo = new Circulo(16.6);
		
		assertEquals(865.67, miCirculo.dameElPerimetroDeUnCirculo(),0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
