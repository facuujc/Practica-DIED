/**
 * 
 */
package died.guia03.ejercicio01;

/**
 * @author facuujc
 *
 */
public class App {

	/**Método main para inicializar la aplicación
	 * @param args
	 */
	public static void main(String[] args) {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(2, 2);
		Recta r1 = new Recta(p1, p2);
		System.out.println("Pendiente de la recta R1: " + r1.pendiente());
		Punto p3 = new Punto(3, 3);
		Recta r2 = new Recta(p2, p3);
		System.out.println("¿R1 y R2 representan la misma recta? " + r1.equals(r2));
	}

}
