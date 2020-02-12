package model.data_structures;

public interface Iterator<T> {

	/**
	 * @return True si hay un elemento (siguiente) por visitar.
	 */
	boolean hasNext();
	
	/**
	 * @return el (siguiente) elemento por visitar.
	 * @throws NoSuchElementException si no hay elemento por visitar
	 */
	T next();
	
}
