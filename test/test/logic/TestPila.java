package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	
	@Before
	public void setUpPila() {
		modelo= new Modelo();
	}

	public void setUpCola() {
	}

	@Test
	public void testModeloPila() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamanoPila());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamanoPila() {
	
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
	}

	@Test
	public void testBuscar() {
		setUpCola();
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() {
		setUpCola();
		// TODO Completar la prueba
		
	}
}
