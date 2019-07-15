/**
 * 
 */
package died.guia03.ejercicio01;

/**
 * @author facuujc
 * Clase que representa una recta
 *
 */
public class Recta {
	private Punto p1;
	private Punto p2;
	
	/**
	 * Crea una instancia de Recta con los puntos argumentos.
	 * @param p1
	 * @param p2
	 */
	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Crea una instancia de la recta identidad (y(x) = x)
	 */
	public Recta() {
		Punto pAux1 = new Punto(1, 1);
		Punto pAux2 = new Punto(2,2);
		this.p1 = pAux1;
		this.p2 = pAux2;
	}
	
	/**
	 * Retornar la pendiente de la recta ( m = (y1 –y0) / (x1 –x0) )
	 * @return float
	 */
	public float pendiente() {
		return ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
	}
	
	/**
	 * En caso que la recta argumento sea paralela a la recta receptora del mensaje, false caso contrario. 
	 * @param otraRecta recta a comparar con la receptora del mensaje
	 * @return boolean
	 */
	public boolean paralelas(Recta otraRecta) {
		if (this.pendiente() == otraRecta.pendiente()) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Retorna true si el argumento es instancia de la clase Recta y dichos objetos representan la misma recta.
	 * @param otraRecta recta con la cual se compara si es la misma
	 * @return boolean
	 */
	public boolean equals(Object otraRecta) {
		if (otraRecta instanceof Recta) {
			Recta recta2 = (Recta) otraRecta;
			Recta recta3 = new Recta(this.getP1(), recta2.getP2());
			if (this.pendiente() == recta3.pendiente() && recta2.pendiente() == recta3.pendiente()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	//Getters and Setters
	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	
	
}
