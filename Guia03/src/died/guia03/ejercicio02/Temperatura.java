/**
 * 
 */
package died.guia03.ejercicio02;

import javax.swing.JOptionPane;

/**
 * @author facuujc
 *
 */
public class Temperatura {
	private Double grados;
	private Escala escala;
	
	/**
	 * Constructor por defecto que inicializa en 0 la temperatura y en CELCIUS la escala.
	 */
	public Temperatura() {
		this.grados = 0.0;
		this.escala = Escala.CELCIUS;
	}
	
	/**
	 * constructor con dos argumentos, la temperatura y la escala que asignará a la Temperatura un valor inicial y una escala predefinida.
	 * @param grados número de los grados
	 * @param escala escala, CELCIUS o FAHRENHEIT
	 */
	public Temperatura(Double grados, Escala escala) {
		this.grados = grados;
		this.escala = escala;
	}
	
	/**
	 * Retorna un string representando la temperatura en formato <GRADOS> <SIMBOLO>
	 */
	public String toString() {
		if(escala == Escala.CELCIUS) {
			return (this.grados + "Cº");
		}else if (escala == Escala.FAHRENHEIT){
			return (this.grados + "Fº");
		} else {
			return "Error en la escala";
		}
	}
	
	/**
	 * Retorna la temperatura actual en grados Celcius.
	 * @return	Double
	 */
	public Double asCelcius() {
		if(escala == Escala.CELCIUS) {
			return this.grados;
		}else{
			return ((this.grados - 32.0) * (5.0 / 9.0));		}
	}
	
	
	/**
	 * Retorna la temperatura actual en grados Fahrenheit.
	 * @return Double
	 */
	public Double asFahrenheit() {
		if(escala == Escala.FAHRENHEIT) {
			return this.grados;
		}else{
			return ((this.grados * (9.0 / 5.0)) + 32.0);
		}
	}
	
	/**
	 * Aumenta la temperatura según el valor del parámetro recibido.
	 * @param temperatura
	 */
	public void aumentar(Temperatura temperatura) {
		if (temperatura.getGrados() > 0) {
			if (temperatura.getEscala() == Escala.CELCIUS) {
				this.setGrados(this.getGrados() + temperatura.asCelcius());
			} else if(escala == Escala.FAHRENHEIT) {
				this.setGrados(this.getGrados() + temperatura.asFahrenheit());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Error: La temperatura es menor a cero!!");
		}
	}

	/**
	 * Disminuye la temperatura según el valor del parámetro recibido.
	 * @param temperatura
	 */
	public void disminuir(Temperatura temperatura) {
		if (temperatura.getGrados() > 0) {
			if (temperatura.getEscala() == Escala.CELCIUS) {
				this.setGrados(this.getGrados() - temperatura.asCelcius());
			} else if(escala == Escala.FAHRENHEIT) {
				this.setGrados(this.getGrados() - temperatura.asFahrenheit());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Error: La temperatura es menor a cero!!");
		}
	}
	
	public Double getGrados() {
		return grados;
	}

	public void setGrados(Double grados) {
		this.grados = grados;
	}

	public Escala getEscala() {
		return escala;
	}

	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	
	
}
