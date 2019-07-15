/**
 * 
 */
package died.guia04.ejercicio01;

import java.util.ArrayList;

/**
 * @author facuujc
 *
 */
public class Ruta {
	private ArrayList<Ciudad> ciudades;
	
	/**
	 * El construcctor inicializa ArrayList de Ciudad
	 */
	public Ruta() {
		this.ciudades = new ArrayList<Ciudad>();
	}

	/**
	 * Retorna la lista de Ciudades
	 * @return ArrayList<Ciudad>
	 */
	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}
	
	/**
	 * Cambia la lista de ciudades
	 * @param ciudades Lista de ciudades que desean remplazarce
	 */
	public void setCiudades(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	/**
	 * Agrega una  ciudad  a la ruta si es que la misma no estaba agregada.
	 * @param c Ciudad a agregar
	 */
	public void agregarCiudad(Ciudad c) {
		if(!ciudades.contains(c)) {
			ciudades.add(c);
		}
	}
	
}
