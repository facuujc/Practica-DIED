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
	 * Constructor por defecto, sin argumento y con cuerpo vacío
	 */
	public Ciudad() {
		
	}
	
	/**
	 * Constructor que recibe el nombre y el código postal como argumento y lo setea a sus atributos
	 * @param nombre Nombre de la ciudad
	 * @param codigoPostal Código postal de la ciudad
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
	 * Cambia el nombre de la ciudad por el String ingresado por parámetro
	 * @param nombre Nombre de la Ciudad por el cual se desea cambiar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el código postal de la ciudad
	 * @return Integer código postal de la ciudad
	 */
	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * Cambia el código postal de la ciudad
	 * @param codigoPostal Código postal que se registrará en la clase ciudad
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
	 * Retorna true si dos ciudades  tienen el mismo código postal, sin importar si sus nombres coinciden o son diferentes.
	 * @param otraCiudad Nombre de la ciudad a comparar
	 * @return boolean Retorna true si las ciudades tienenel mismo código postal, de lo contrario retorna false
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
