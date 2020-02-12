package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
					view.printMessage("--------- \nCrear pila y cola:");
				    modelo = new Modelo();
				    modelo.iniciarDatos();
				    view.printMessage("Datos leídos.");
				    view.printMessage("\nNúmero actual de elementos en la pila: " + modelo.darTamanoPila() +"\n\nNúmero actual de elementos en la cola: " + modelo.darTamanoCola() + "\n---------");
				    view.printMessage( "\nÚltimo elemento en la pila : \n" + modelo.darElementoPila());
				    view.printMessage( "\nPrimer elemento en la cola : \n" + modelo.darElementoCola());
					break;
					
				case 6: 
					view.printMessage("--------- \n Hasta pronto !! \n---------"); 
					lector.close();
					fin = true;
					break;	

				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
}
