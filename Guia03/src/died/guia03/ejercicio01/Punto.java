/**
 * 
 */
package died.guia03.ejercicio01;

/**
 * @author facuujc
 * Esta clase representa un punto
 *
 */
public class Punto {
	private float x;
	private float y;
	/**
	 * Crea una instancia de un punto con las coordenadas argumentos.
	 * @param x valor de la posición en x
	 * @param y valor de la posicion en y
	 */
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Retorna el valor de x
	 * @return x
	 */
	public float getX() {
		return x;
	}
	/**
	 * Modifica el valor de x
	 * @param x valor al cual modificar x
	 */
	public void setX(float x) {
		this.x = x;
	}
	/**
	 *  Modifica el valor de y
	 * @return y
	 */
	public float getY() {
		return y;
	}
	/**
	 * Modifica el valor de y
	 * @param y valor al cual modificar y
	 */
	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Object punto) {
		if((punto instanceof Punto)) {
			Punto p = (Punto) punto;
			if (this.x == p.getX() && this.y == p.getY()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
