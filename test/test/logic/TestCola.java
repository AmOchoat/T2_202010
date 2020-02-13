package test.logic;

import static org.junit.Assert.*;

import model.data_structures.LinkedQueue;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestCola {
	
	private Modelo modelo;
	
	@Before
	public void setUpPila() {
		LinkedQueue<int> cola = new LinkedQueue<int>();
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
