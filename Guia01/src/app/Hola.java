/**
 * 
 */
package app;

/**
 * Clase de prueba instalación
 * @author facundo
 * @version 1.0.0
 *
 */
public class Hola {
/**
 * Método que ejecuta la aplicación. Si recibe un argumento o más los imprime.
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
