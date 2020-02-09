package model.data_structures;

public interface Iterator <E>
{
	/**
	 * @return True si existe un siguiente por visitar
	 */
	public boolean hasNext();
	
	/**
	 * @return el siguiente elemento de la lista
	 * @throws NoSuchElementException si no hay elemento por visitar
	 */
	public E next();
	
	/**
	 * Elimina el último elemento visitado
	 */
	public void remove();
}
