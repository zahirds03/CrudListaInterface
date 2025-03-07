package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Autos;
import Interface.Metodos;
import Interface.Metodos2;

public class LogicaMetodos implements Metodos , Metodos2 {

	private List<Autos> registros = new ArrayList<Autos>();

	@Override
	public void guardar(Autos auto) {
		// TODO Auto-generated method stub

		// 1-- ciclo
		// 2--condicional
		// 3-- banderas---cuando no existe

		boolean bandera = false;

		for (Autos a : registros) {
			if (a.getModelo().equals(auto.getModelo())) {

				System.out.println("No se pudo guardar, ya existe");
				bandera = true;
				break;
			}

		}
		if (bandera == false) {
			registros.add(auto);
			System.out.println("Se guardo con exito");
		}
	}

	@Override
	public List<Autos> mostrar() {
		// TODO Auto-generated method stub
		return registros;
	}

	@Override
	public Autos buscarXindice(int indice) {
		// TODO Auto-generated method stub
		return registros.get(indice);
	}

	@Override
	public void editar(int indice, Autos auto) {
		// TODO Auto-generated method stub
		registros.set(indice, auto);

	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		registros.remove(indice);
	}

	@Override
	public void buscarXmodelo(String modeloBuscado) {
		// TODO Auto-generated method stub
		
		for (Autos autos : registros) {
	        if (autos.getModelo().equals(modeloBuscado)) {
	            System.out.println("Auto encontrado: " + autos);
	            return; 
	        }
	    }
	    System.out.println("No se encontró un auto con el modelo '" + modeloBuscado + "'.");
	}

	@Override
	public Autos dineroInvertido() {
		// TODO Auto-generated method stub
		 float suma = 0;
		 
		 
		
		    for (Autos autos : registros) {
		    	suma += autos.getPrecio() * autos.getStock();
		        
		 System.out.println("El dinero invertido es: " + suma); 
		       
		   }
		   System.out.println("La suma de los precios es: " + suma);
			return null;
		   
		
	}

	@Override
	public Autos editarXmodelo(String modelo, String modeloNuevo) {
		// TODO Auto-generated method stub
		for (Autos autos : registros) {
	        if (autos.getModelo().equals(modelo)) {
	        	autos.setModelo(modeloNuevo);
	            System.out.println("modelo editado " + autos);
	            
	            return null; 
	        }
		}
		return null;
	}

	@Override
	public Autos eliminarXmodelo(String modeloEliminar) {
		// TODO Auto-generated methsod stub
		
		for (Autos autos : registros) {
            if (autos.getModelo().equals(modeloEliminar)) {
                registros.remove(autos); // Eliminar el auto que coincide con el modelo
                System.out.println("Se elimino");
                return null;
            }
        }
		System.out.println("No se elimino");
		
		return null;
	}

	@Override
	public void buscarXmarca(String marcaBuscada) {
		// TODO Auto-generated method stub
		for (Autos autos : registros) {
	        if (autos.getMarca().equals(marcaBuscada)) {
	            System.out.println("Auto encontrado: " + autos);
	            return; 
	        }
	    }
	    System.out.println("No se encontró la marca '" + marcaBuscada + "'.");
		
	}





	

}
