package controller;

import java.util.Scanner;

import model.data_structures.LinkedQueue;
import model.logic.Comparendo;
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
		boolean iniciado = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			if(!iniciado && option != 1)
			{
				view.printMessage("No ha leído lo comparendos, lea los comparendos primero.");
			}
			else
			{
				switch(option){
				case 1:
					view.printMessage("---------\nCargar datos en pila y cola :");
					modelo = new Modelo();
					modelo.iniciarDatos();
					view.printMessage("\nDatos leídos.");
					view.printMessage("\nNúmero actual de elementos en la pila: " + modelo.darTamanoPila() +"\n\nNúmero actual de elementos en la cola: " + modelo.darTamanoCola() + "\n---------");
					view.printMessage( "\nÚltimo elemento en la pila : \n" + modelo.darElementoPila());
					view.printMessage( "\nPrimer elemento en la cola : \n" + modelo.darElementoCola() + "\n");
					iniciado = true;
					break;

				case 2:
					view.printMessage("---------\nBuscar grupo de comparendos más grande :");
					LinkedQueue<Comparendo> comparendosD = modelo.opcion2();
					view.printMessage("\nEl grupo más grande tiene tamaño :" + comparendosD.size() + "\n");
					while( !comparendosD.isEmpty())
					{
						String infoComparendo = comparendosD.dequeue().toString();
						view.printMessage( infoComparendo + "\n" );
					}
				break;

			case 3:
				view.printMessage("---------\nBuscar N comparendos por infracción :");
				view.printMessage("---------\nIngrese el número de comparendos a buscar :");
				int numeroComparendos = lector.nextInt();
				view.printMessage("---------\nIngrese el tipo de comparendos a buscar :");				    
				String claseComparendo = lector.next();
				LinkedQueue<Comparendo> comparendos = modelo.opcion3(numeroComparendos, claseComparendo);
				if( comparendos.size() == 0)
				{
					view.printMessage( "---------\nNo existen comparendos con ese tipo de infracción.\n---------\n");
				}
				while( !comparendos.isEmpty())
				{
					String infoComparendo = comparendos.dequeue().toString();
					view.printMessage("\n" + infoComparendo );
				}
				break;

			case 4: 
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
}
