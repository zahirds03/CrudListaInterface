package Interface;

import Dominio.Autos;

public interface Metodos2 {

	public void buscarXmodelo(String modeloBuscado) ;
	public void buscarXmarca(String marcaBuscada);
	public Autos dineroInvertido ();
	public Autos editarXmodelo(String modelo, String modeloNuevo) ;
	public Autos eliminarXmodelo(String modeloEliminar) ;
	
}
