package model.data_structures;

import java.util.ArrayList;

public interface IListaOrdenada <T extends Comparable<T>> extends Iterable<T>
{
	/**
	 * Agrega un dato 
	 * @param dato Dato genérico a agregar
	 * @return Si, si se pudo agregar. No si no se pudo agregar
	 */
	public boolean agregar(T dato);
	
	//public boolean agregar(T dato, comparator<T> xd);

	//public boolean agregarXtoString(T dato);
	
	public T buscar(T dato);
	
	public ArrayList darArreglo();
	
	public int darLongitud();
	
	public T eliminar(T dato);
}
