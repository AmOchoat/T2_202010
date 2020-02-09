package model.data_structures;

public interface Comparable <T>
{
	/**
	 * Retorna 0 en caso de igualdad this y object
	 * Retorna < 0 en caso de que this < object
	 * Retorna > 0 en caso de que this > object
	 */
	public int compareTo( T obj);
	
}
