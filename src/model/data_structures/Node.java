package model.data_structures;

public class Node <T>
{

	private T elemento;
	
	private Node<T> siguiente;
	
	public Node(T dato) {
		elemento = null;
		siguiente = null;
	}

	public T darElemento() {
		// TODO Auto-generated method stub
		return elemento;
	}

	public Node<T> darSiguiente() {
		// TODO Auto-generated method stub
		return siguiente;
	}

	public void cambiarSiguiente(Node<T> nSiguiente) {
		siguiente = nSiguiente;
	}
}
