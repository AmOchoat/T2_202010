package model.logic;

import model.data_structures.FixedCapacityStack;
import model.data_structures.IFixedCapacityStack;
import model.data_structures.ILinkedQueue;
import model.data_structures.Iterator;
import model.data_structures.LinkedQueue;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {

	private FixedCapacityStack<Comparendo> pila;

	private LinkedQueue<Comparendo> cola;

	private Lector lector;
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		pila = new FixedCapacityStack<Comparendo>();
		cola = new LinkedQueue<>();
		lector = new Lector();
	}

	/**
	 * Inicia la lectura de datos en la cola y en la pila.
	 */
	public void iniciarDatos()
	{
		lector.cargarDatos(pila, cola);
	}
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamanoPila()
	{
		return pila.size();
	}

	public int darTamanoCola()
	{
		return cola.size();
	}

	public String darElementoPila()
	{
		return pila.darElemento().toString();
	}


	public String darElementoCola()
	{
		return cola.darPrimero().toString();
	}

	public LinkedQueue<Comparendo> opcion2()
	{
		LinkedQueue<Comparendo> rta = new LinkedQueue<Comparendo>();
		LinkedQueue<Comparendo> temporal =  new LinkedQueue<Comparendo>();
		Iterator<Comparendo> it = cola.iterator();
		while(it.hasNext())
		{
			Comparendo aComparar = it.next();
			String tipoInf = aComparar.darTipoInfraccion();
			if(temporal.isEmpty() || temporal.darPrimero().darTipoInfraccion().equals(tipoInf)){
				temporal.enqueue(aComparar);
			}
			else
			{
				if(temporal.size() > rta.size()){	
					for( int i= 0; i<rta.size(); i++)
					{
						rta.dequeue();
					}	
					for(int j=0; j<temporal.size(); j++)
					{
						rta.enqueue(temporal.darPrimero());
						temporal.dequeue();
					}
				}
			}
			cola.dequeue();
		}
		return rta;
	}

	public LinkedQueue<Comparendo> opcion3(int pNumeroComparendos, String pTipoInfraccion)
	{
		LinkedQueue<Comparendo> respuesta = new LinkedQueue<Comparendo>();
		FixedCapacityStack<Comparendo > aux = new FixedCapacityStack<>();
		aux = pila;

		while( !aux.isEmpty() && respuesta.size() < pNumeroComparendos)
		{
			Comparendo comparendo = aux.pop();

			if( comparendo.darTipoInfraccion().equals( pTipoInfraccion ))
			{
				respuesta.enqueue(comparendo);
			}		
		}
		return respuesta;
	}

}