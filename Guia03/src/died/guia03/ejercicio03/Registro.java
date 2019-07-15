/**
 * 
 */
package died.guia03.ejercicio03;

import died.guia03.ejercicio02.Temperatura;

/**
 * @author facuujc
 *
 */
public class Registro {
	static final int capacidad = 30;
	private String ciudad;
	private Temperatura[] historico;
	private int ultimoIndice;
	private int capacidadDisponible;
	private int cantidadInsertados;
	/**
	 * Constructor sin parámetros, crea la instancia colocando como nombre de la ciudad: "-"
	 */
	public Registro() {
		this.historico = new Temperatura[30];
		this.ciudad = "-";
		this.ultimoIndice = -1;
		this.capacidadDisponible = 30;
		this.cantidadInsertados = 0;
	}
	/**
	 * Constructor, crea una instancia colocando el nombre de la ciudad recibido por parametro
	 * @param ciudad Nombre de la ciudad
	 */
	public Registro(String ciudad) {
		this.historico = new Temperatura[30];
		this.ciudad = ciudad;
		this.ultimoIndice = -1;
		this.capacidadDisponible = 30;
		this.cantidadInsertados = 0;		
	}
	
	/**
	 * Retorna el nombre de la ciudad
	 * @return String nombre de la ciudad
	 */
	public String getCiudad() {
		return this.ciudad;
	}

	/**
	 * Imprime el nombre de la ciudad y todas sus temperaturas
	 */
	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.getCiudad());
		int i = 1;
		for (Temperatura temperatura : historico) {
			if(temperatura != null) {
				System.out.println(i + " " + temperatura.asCelcius() + " Cº");
				i++;
			}
		}
	}
	
	/**
	 * Agrega una temperatura al arreglo historico, en caso de estar lleno no hace nada
	 * @param t temperatura a ser agregada
	 */
	public void agregar(Temperatura t) {
		if(historico.length <= 30) {
			historico[this.ultimoIndice + 1] = t;
			this.ultimoIndice++;
			this.capacidadDisponible--;
			this.cantidadInsertados++;
		}
	}
	
	/**
	 * Temperatura promedio en Celsius
	 * @return Double promedio de las temperaturas en Celsius
	 */
	public Double mediaAsCelcius() {
		Double sumaTotal = 0.0;
		int cantidad = 0;
		for (Temperatura temperatura : historico) {
			if(temperatura != null){
				sumaTotal += temperatura.asCelcius();
				cantidad++;
			}
		}
		return (sumaTotal / (int) cantidad);
	}
	
	/**
	 * Temperatura promedio en Fahrenheit
	 * @return Double promedio de las temperaturas en Fahrenheit
	 */
	public Double  mediaAsFahrenheit() {
		Double sumaTotal = 0.0;
		int cantidad = 0;
		for (Temperatura temperatura : historico) {
			if(temperatura != null){
				sumaTotal += temperatura.asFahrenheit();
				cantidad++;
			}
		}
		return (sumaTotal / (int) cantidad);
	}
	/**
	 * Busca la temperatura máxima del listado.
	 * @return Temperatura temperatura máxima del listado historico
	 */
	public Temperatura maximo() {
		return buscarMaximo(this.historico, this.cantidadInsertados, this.cantidadInsertados - 1);
	}
	
	/**
	 * Método recursivo que busca la temperatura máxima, se accede desde el método máximo;
	 * @see #maximo()
	 * @param temperaturas Recibe un arreglo con las temperaturas donde se debe realizar la búsqueda
	 * @param tamanio Cantidad de temperaturas ingresadas en el registro
	 * @param indexMaximo Se debe ingresar la cantidad de temperaturas ingresadas en el registro, restando una unidad
	 * @return	Temperatura máxima del arreglo ingresado como parámetro
	 */
	private static Temperatura buscarMaximo(Temperatura[] temperaturas, int tamanio, int indexMaximo) {
		if (tamanio == 1) {
			return temperaturas[indexMaximo];
		} else {
			if (temperaturas[tamanio-2].asCelcius() > temperaturas[indexMaximo].asCelcius()) {
				return buscarMaximo(temperaturas, tamanio - 1, tamanio-2);
			} else {
				return buscarMaximo(temperaturas, tamanio - 1, indexMaximo);
			}
		}
	}
}










