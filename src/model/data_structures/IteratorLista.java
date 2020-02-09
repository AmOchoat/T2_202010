package model.data_structures;

import java.util.NoSuchElementException;

public class IteratorLista<T extends Comparable<T>> implements Iterator<T>
{
	//Proximo nodo a visitar
	private Node<T> proximo;
	
	private Node<T> ant_prox;
	
	private Node<T> ant_ant;
	
	IteratorLista( Node<T> primero)
	{
		proximo = primero;
	}
	
	public boolean hasNext()
	{
		return proximo != null;
	}
	
	public T next()
	{
		if( proximo == null)
		{
			throw new NoSuchElementException("No hay siguiente");
		}
	//Ultimo elemento visitado
	T elemento = proximo.darElemento();  
	//proximo nodo a visitar
	proximo = proximo.darSiguiente();
	return elemento;
	}

	
	public void remove(){
		ant_ant.cambiarSiguiente(proximo);
	}
}

