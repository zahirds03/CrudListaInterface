package Main;

import java.util.Scanner;

import Dominio.Autos;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		Scanner lectura = null;
		
		///github
		System.out.println("se elimina 3 lineas de codigo");
		
		
		
		String modeloNuevo;
		String marca;
		String modelo;
		float precio;
		int stock, menuPrinc, subMenu, indice;

		Autos auto = null;
		LogicaMetodos imp = new LogicaMetodos();

		// Menu principal

		do {
			System.out.println("Menu Principal ");
			System.out.println("1---ALTA ");
			System.out.println("2---MOSTRAR ");
			System.out.println("3---BUSCAR ");
			System.out.println("4---EDITAR ");
			System.out.println("5---ELIMINAR ");
			System.out.println("6---Buscar por modelo");
			System.out.println("7---buscar por marca");
			System.out.println("8---calcular dinero invertido");
			System.out.println("9---Editar buscando por modelo");
			System.out.println("10---Eliminar buscando por modelo");
			System.out.println("11---SALIR");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {

			case 1:
				try {
					System.out.println("ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("ingrese el modelo");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();

					System.out.println("ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("ingrese el stock");
					lectura = new Scanner(System.in);
					stock = lectura.nextInt();

					// Crear el objeto
					auto = new Autos(marca, modelo, precio, stock);

					// Guardar lista
					imp.guardar(auto);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.toString());
				}
				break;
			case 2:
				System.out.println(imp.mostrar());
				break;
			case 3:
				try {
					System.out.println("ingrese el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					auto = imp.buscarXindice(indice);
					System.out.println("Se encontro auto :" + auto);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar " + e.getMessage());
				}

				break;
			case 4:
				// para editar hay que buscar
				try {
					System.out.println("ingrese el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					auto = imp.buscarXindice(indice);
					System.out.println("Se encontro auto :" + auto);

					// submenu para editar; marca y precio
					do {
						System.out.println("sub Menu Para editar ");
						System.out.println("1---Marca ");
						System.out.println("2---Precio ");
						System.out.println("3---Regresar M.p ");

						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {

						case 1:
							System.out.println("ingrese la nueva marca");
							lectura = new Scanner(System.in);
							marca = lectura.nextLine();

							// Actualizar el objeto
							auto.setMarca(marca);
							// Actualizar lista
							imp.editar(indice, auto);
							System.out.println("Se edito");

							break;
						case 2:
							System.out.println("ingrese el nuevo precio");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();

							// Actualizar el objeto
							auto.setPrecio(precio);
							// Actualizar lista
							imp.editar(indice, auto);
							System.out.println("Se edito");

							break;
						case 3:

							break;
						}

					} while (subMenu < 3);

				} catch (Exception e) {

					// TODO: handle exception
					System.out.println("Error al Editar " + e.getMessage());
				}

				break;
			case 5:
				try {
					System.out.println("ingrese el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar " + e.getMessage());
				}

				break;
			case 6:
				System.out.println("ingrese el modelo a buscar");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();
				
				imp.buscarXmodelo(modelo);
				break;
			case 7:
				System.out.println("ingrese la marca a buscar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				imp.buscarXmarca(marca);

				break;
			case 8:
				imp.dineroInvertido();
				
				break;
			case 9:
				try {
					System.out.println("ingrese el modelo a editar ");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();
					
					imp.buscarXmodelo(modelo);
					
					System.out.println("ingrese el nuevo modelo");
					lectura = new Scanner(System.in);
					modeloNuevo = lectura.nextLine();
					
					imp.editarXmodelo(modelo, modeloNuevo);
					System.out.println("Se edito");
					
					
					
					
				}catch (Exception e) {
				
					// TODO: handle exception
					System.out.println("Error al Editar " + e.getMessage());
				}


				break;
			case 10:
				
					System.out.println("ingrese el modelo a eliminar :");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();

					// Eliminar
					imp.eliminarXmodelo(modelo);
					

			
				break;
			case 11:
				System.out.println("BYE BYE !!!");
				break;

			}

		} while (menuPrinc < 11);
	}

}
