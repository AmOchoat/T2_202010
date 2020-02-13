package test.logic;

import static org.junit.Assert.*;

import model.data_structures.LinkedQueue;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestCola {
	
	private LinkedQueue<String> cola;
	
	@Before
	public void setUp1() {
		 cola = new LinkedQueue<String>();
	}
	
	@Before
	public void setUp2()
	{
		cola.enqueue("pPrimero");
		cola.enqueue("pSegundo");
	}

	@Test
	public void testPila() {
		assertTrue(cola!=null);
		assertEquals(0, cola.size());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamanoPila() {
		setUp1();
		assertEquals(0, cola.size());  // Modelo con 0 elementos presentes.
		setUp2();
		assertEquals(2, cola.size()); // Modelo con 0 elementos presentes.

	}

	@Test
	public void testEnqueue() {
		setUp1();
		cola.enqueue("pTercero");
		assertEquals( "Al agregar un elemento el tamaño de la cola debería ser 1.",1, cola.size());
	}

	@Test
	public void testDequeue() {
		setUp1();
		setUp2();
		assertEquals("El elemento debería ser diferente de null.", "pPrimero" , cola.dequeue() );
	}
}
