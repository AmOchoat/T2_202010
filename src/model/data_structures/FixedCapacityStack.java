package model.data_structures;

public class FixedCapacityStack<T extends Comparable<T>> implements IFixedCapacityStack<T>{

	/**
	 * Arreglo con elementos de tipo genérico.
	 */
	private T elementos[];
	
	/**
	 * Tamaño actual del arreglo.
	 */
	private int tamanoAct = 0;

	/**
	 * Tamaño máximo del arreglo.
	 */
	private int tamanoMax;
	
	/**
	 * Tamaño mínimo del arreglo para ser disminuido.
	 */
	private int tamanoMin;
	
	public FixedCapacityStack()
	{
		elementos = ( T[]) new Comparable[2];
		tamanoMax = elementos.length;
		tamanoAct = 0;
	}
	
	
	public int size() {
		return tamanoAct;
	}

	/**
	 * Agrega un elemento en la última posición de la pila.
	 * @param Item a agregar en la pila.
	 */
	public void push(T item) {

        if ( tamanoAct == tamanoMax )
        {
        	resize( 2*elementos.length );
        }
        
        elementos[tamanoAct] = item;
        tamanoAct++;
	}

	/**
	 * Retorna el último elemento agregado y lo elimina.
	 * @return Útimo elemento agregado y lo elimina.
	 */
	public T pop() {
		
		T item = elementos[--tamanoAct];
		elementos[tamanoAct] = null;
		if( tamanoAct > 0 && tamanoAct == elementos.length / 3)
			resize( elementos.length / 2 );
		return item;
	}

	/**
	 * Indica si la pila está vacía.
	 * @return True si la pila está vacía, false de lo contrario.
	 */
	public boolean isEmpty() {
		return tamanoAct == 0;
	}
	
	/**
	 * Recalcula el tamaño de la pila.
	 * @param capacidad deseada para la pila.
	 */
	private void resize ( int capacidad)
	{
		T[] copy = ( T[] ) new Comparable[capacidad];
		for (int i = 0; i < tamanoMax; ++i)
		{
			copy[i] = elementos[i];
		}
		tamanoMax = capacidad;
		elementos = copy;
	}
	
	/**
	 * 
	 */
	public T darElemento()
	{
		return elementos[tamanoAct-1];
	}
}
