package model.data_structures;

import java.util.ArrayList;

public class MiLista <T extends Comparable<T>> implements IListaOrdenada<T>
{
	int longitud;
	
	Node<T> primero;
	
	public Iterator<T> iterator()
	{
		return new IteratorLista<T>(primero);
	}

	@Override
	public boolean agregar(T dato) 
	{	
		boolean rta = false;
		Node <T> nuevo = new Node<T>(dato);
		if(primero == null){
			primero = nuevo;
			rta = true;
		}
		else if( dato.compareTo(primero.darElemento()) < 0){
			nuevo.cambiarSiguiente( primero);
			primero = nuevo;
			rta = true;
		}
		else if( dato.compareTo(primero.darElemento()) > 0){
			Node<T> anterior = primero;
			Node<T> actual = primero.darSiguiente();
			while( actual != null && dato.compareTo(actual.darElemento()) < 0){
				anterior = actual;
				actual = actual.darSiguiente();
			}
			if(actual == null || dato.compareTo(actual.darElemento()) <= 0)
			{
				anterior.cambiarSiguiente(nuevo);
				nuevo.cambiarSiguiente(actual);rta = true;
			}
		}
		if(rta){
			longitud++;
		}
		return rta;
	}

	@Override
	public T buscar(T dato) {
		T rta = null;
		boolean cent = false;
		Node<T> actual = primero;
		while(actual.darElemento() != null && ! cent){
			if (actual.darElemento().compareTo(dato)== 0){
				rta = actual.darElemento();
				cent = true;
			}
			else{
				actual = actual.darSiguiente();
			}
		}
		return rta;
	}

	@Override
	public ArrayList darArreglo() {
		@SuppressWarnings("rawtypes")
		ArrayList elementos = new ArrayList();
		Node <T> actual = primero;
		while(actual.darSiguiente() != null){
			elementos.add(actual);
		}
		return elementos;
		
	}

	@Override
	public int darLongitud() {
		// TODO Auto-generated method stub
		return longitud;
	}

	@Override
	public T eliminar(T dato) {
		T rta = null;
		boolean cent = false;
		Node<T> actual = primero;
		Node<T> siguiente = primero.darSiguiente();
		if(primero.darElemento().compareTo(dato)==0){
			rta = primero.darElemento();
			cent = true;
			primero = primero.darSiguiente();
		}
		while(actual.darElemento() != null && ! cent){
			if (siguiente.darElemento().compareTo(dato)== 0){
				rta = siguiente.darElemento();
				actual.cambiarSiguiente(siguiente.darSiguiente());
				cent = true;
			}
			else{
				actual = siguiente;
				siguiente = siguiente.darSiguiente();
			}
		}
		return rta;
	}
}
