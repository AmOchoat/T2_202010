package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Crear la pila y cola con los datos de comparendos.");
			System.out.println("2. Buscar el grupo de comparendos m�s grande por infracci�n.");
			System.out.println("3. Buscar N comparendos por infracci�n.");
			System.out.println("4. Exit.");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
}
