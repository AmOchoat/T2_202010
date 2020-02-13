package test.logic;

import static org.junit.Assert.*;

import model.data_structures.FixedCapacityStack;
import model.data_structures.LinkedQueue;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestPila {
	
	private FixedCapacityStack<String> pila;
	
	@Before
	public void setUp1() {
		 pila = new FixedCapacityStack<String>();
	}
	
	@Before
	public void setUp2()
	{
		pila = new FixedCapacityStack<String>();
		pila.push("pPrimero");
		pila.push("pSegundo");
	}

	@Test
	public void testPila() {
		assertTrue(pila!=null);
		assertEquals(0, pila.size());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamanoPila() {
		setUp1();
		assertEquals(0, pila.size());  // Modelo con 0 elementos presentes.
		setUp2();
		assertEquals(2, pila.size()); // Modelo con 0 elementos presentes.

	}

	@Test
	public void testEnqueue() {
		setUp1();
		pila.push("pTercero");
		assertEquals( "Al agregar un elemento el tamaño de la pila debería ser 1.",1, pila.size());
	}

	@Test
	public void testPop() {
		setUp1();
		setUp2();
		assertEquals("El elemento debería ser diferente de null.", "pSegundo" , pila.pop() );
		assertEquals("El elemento debería ser diferente de null.", "pPrimero" , pila.pop() );

	}
}
