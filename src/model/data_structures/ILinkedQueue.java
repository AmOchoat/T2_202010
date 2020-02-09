package model.data_structures;

public interface ILinkedQueue <T extends Comparable <T>>
{
	/**
	 * Retornar el numero de elementos presentes en el arreglo
	 * @return
	 */
	int size( );
	
	/**
	 * Agregar un dato en la primera posición de la lista.
	 * Lo pone "Al final" (primera posicion) ultimo en eliminar
	 * Caso Especial: Si el arreglo esta lleno debe aumentarse su capacidad, agregar el nuevo dato y deben quedar multiples casillas disponibles para futuros nuevos datos.
	 * @param dato nuevo elemento
	 */
	public void enqueue( T item );
		
	/**
	 * Busca el dato el dato en la primera posicion de la lista y lo elimina. 
	 * Elimina el primer elemento en ser agregado
	 * @return elemento encontrado en el arreglo (si existe). null si no se encontro el dato.
	 */
	T dequeue();
	
	/**
	 * Indica si el stack está vacio.
	 */
	boolean isEmpty();
	


}
