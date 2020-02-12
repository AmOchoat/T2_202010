package model.data_structures;

import java.util.NoSuchElementException;

public class LinkedQueue <T extends Comparable <T>> implements ILinkedQueue<T>, Iterable<T>
{
	/**
	 * Cantidad de Items en nodos
	 */
	private  int tamano = 0;

	/**
	 * Nodo que contiene los items primero y último
	 */
	private NodoPrivado<T> first, last;

	/**
	 * Clase que hace los nodos
	 */
	private class NodoPrivado<T extends Comparable<T>>
	{
		private T item;
		NodoPrivado<T> next;

		private T darItem()
		{
			return item;
		}
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
		NodoPrivado<T> oldLast = last;
		last = new NodoPrivado<T>();
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
		T item = (T) first.darItem();
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

	/**
	 * Da el primer elemento en la pila. 
	 */
	@SuppressWarnings("unchecked")
	public T darPrimero()
	{
		return (T)first.item;
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorLista();
	}

	private class IteratorLista implements Iterator<T>
	{
		@SuppressWarnings("unchecked")
		private NodoPrivado<T> y = first;

		public boolean hasNext() {
			return first != null;
		}

		public T next() {
			if( y == null){
				throw new NoSuchElementException("No hat próximo");
			}
			else{
				T item = (T)y.item;
				y = y.next;
				return item;
			}
		}
	}
}
