/**
 * 
 */
package app;

/**
 * Clase de prueba instalaci�n
 * @author facundo
 * @version 1.0.0
 *
 */
public class Hola {
/**
 * M�todo que ejecuta la aplicaci�n. Si recibe un argumento o m�s los imprime.
 * Si no recibe argumentos indica ese mensaje en consola.
 * @param args arametros
 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Se ejecuto el programa sin argumentos");
		} else {
			for(String argumento: args) {
				System.out.println("Argumento recivido: " + argumento);
			}
		}
	}
}
