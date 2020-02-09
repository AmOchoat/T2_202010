package model.data_structures;

public class LinkedQueue <T extends Comparable <T>> implements ILinkedQueue<T>
{
	/**
	 * Cantidad de Items en nodos
	 */
	private  int tamano = 0;
	
	/**
	 * Nodo que contiene los items primero y último
	 */
	private NodoPrivado first, last;
	
	/**
	 * Clase que hace los nodos
	 */
	private class NodoPrivado
	{
		T item;
		NodoPrivado next;
	}
	
	/**
	 * Retorna la cantidad de nodos con item
	 * @return "tamano" canditdad de nodos con item
	 */
	public int size() {
		return tamano;
	}
	
	/**
	 * Agrega un elemento al final de la lista
	 * @param item Elemento a agregar
	 */
	public void enqueue(T item) 
	{
		NodoPrivado oldLast = last;
		last = new NodoPrivado();
		last.item = item;
		last.next = null;
		if( isEmpty()) first = last;
		else oldLast.next = last;
		tamano++;
	}
	
	/**
	 * Eliminar el elemento que se encuentra de primeras en la lista. 
	 * @return Elemento eliminado
	 */
	public T dequeue() {
		T item = first.item;
		first = first.next;
		tamano--;
		if( isEmpty()) last = null;
		return item;
	}

	/**
	 * La lista esta vacia.
	 * @return True si la lista está vacía. False de lo contrario
	 */
	public boolean isEmpty() 
	{
		return first == null;
	}
	
}
