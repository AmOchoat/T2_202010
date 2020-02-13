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

		Comparendo aComparar = cola.dequeue();
		temporal.enqueue(aComparar);
		Iterator<Comparendo> it = cola.iterator();


		while(it.hasNext())
		{
			aComparar = it.next();
			String tipoInf = aComparar.darTipoInfraccion();
			if(temporal.isEmpty())
			{
				temporal.enqueue(aComparar);
			}
			else
			{

				if(temporal.darPrimero().darTipoInfraccion().equals(tipoInf)){
					temporal.enqueue(aComparar);
				}
				else
				{
					Iterator<Comparendo> itDos = temporal.iterator();
					if(temporal.size() < rta.size())
					{
						temporal.dequeue();
						while(itDos.hasNext())
						{
							temporal.dequeue();
						}
					}
					else
					{
						Iterator<Comparendo> itTres = rta.iterator();
						while(itTres.hasNext())
						{
							rta.dequeue();
							Comparendo rtaComparendo = itTres.next();
						}
						while(itDos.hasNext())
						{
							Comparendo aux = temporal.dequeue();
							rta.enqueue(aux);

						}

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

		while( !pila.isEmpty() && respuesta.size() < pNumeroComparendos)
		{
			Comparendo comparendo = pila.pop();

			if( comparendo.darTipoInfraccion().equals( pTipoInfraccion ))
			{
				respuesta.enqueue(comparendo);
			}		
		}
		return respuesta;
	}

}