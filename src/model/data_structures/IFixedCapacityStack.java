package model.data_structures;

public interface IFixedCapacityStack <T extends Comparable<T>>{

	/**
	 * Retornar el numero de elementos presentes en el arreglo
	 * @return
	 */
	int size( );
	
	/**
	 * Agregar un dato en la última posición del arreglo.
	 * Caso Especial: Si el arreglo esta lleno debe aumentarse su capacidad, agregar el nuevo dato y deben quedar multiples casillas disponibles para futuros nuevos datos.
	 * @param dato nuevo elemento
	 */
	public void push( T item );
		
	/**
	 * Busca el dato el dato en la última posición del arreglo y lo elimina.
	 * @return elemento encontrado en el arreglo (si existe). null si no se encontro el dato.
	 */
	T pop();
	
	/**
	 * Indica si el stack está vacio.
	 */
	boolean isEmpty();
	


}
