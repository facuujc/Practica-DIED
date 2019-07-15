package died.guia04.ejercicio01;
/**
 * 
 */

/**
 * @author facuujc
 *
 */
public class Ciudad {
	private String nombre;
	private Integer codigoPostal;
	
	/**
	 * Constructor por defecto, sin argumento y con cuerpo vac�o
	 */
	public Ciudad() {
		
	}
	
	/**
	 * Constructor que recibe el nombre y el c�digo postal como argumento y lo setea a sus atributos
	 * @param nombre Nombre de la ciudad
	 * @param codigoPostal C�digo postal de la ciudad
	 */
	public Ciudad(String nombre, Integer codigoPostal) {
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}
	
	/**
	 * Retorna el nombre de la Ciudada
	 * @return String Nombre de la ciudad
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre de la ciudad por el String ingresado por par�metro
	 * @param nombre Nombre de la Ciudad por el cual se desea cambiar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el c�digo postal de la ciudad
	 * @return Integer c�digo postal de la ciudad
	 */
	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * Cambia el c�digo postal de la ciudad
	 * @param codigoPostal C�digo postal que se registrar� en la clase ciudad
	 */
	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	/**
	 * Retorna: "<nombre> (<codigoPostal>)"
	 * @return String
	 */
	public String toString() {
		return ( this.nombre + " (" + codigoPostal + ")");
	}
	
	/**
	 * Retorna true si dos ciudades  tienen el mismo c�digo postal, sin importar si sus nombres coinciden o son diferentes.
	 * @param otraCiudad Nombre de la ciudad a comparar
	 * @return boolean Retorna true si las ciudades tienenel mismo c�digo postal, de lo contrario retorna false
	 */
	public boolean equals(Ciudad otraCiudad) {
		if (otraCiudad instanceof Ciudad) {
			if (otraCiudad.getCodigoPostal().equals(this.getCodigoPostal())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
