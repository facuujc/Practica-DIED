/**
 * 
 */
package died.guia03.ejercicio02;

/**
 * @author facuujc
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Temperatura dia1 = new Temperatura(30.0, Escala.CELCIUS);
		Temperatura dia2 = new Temperatura(55.0, Escala.FAHRENHEIT);
		System.out.println("T1 en Cº: " + dia1.asCelcius());
		System.out.println("T1 en Fº: " + dia1.asFahrenheit());
		System.out.println("T2 en Cº: " + dia2.asCelcius());
		System.out.println("T2 en Fº: " + dia2.asFahrenheit());
		dia2.aumentar(dia1);
		System.out.println("T1 + T2 en Cº: " + dia2.asCelcius());
		System.out.println("T1 + T2 en Fº: " + dia2.asFahrenheit());
		dia1.disminuir(new Temperatura(10.0, Escala.CELCIUS));
		System.out.println("T1 en Cº: " + dia1.asCelcius());
		System.out.println("T1 en Fº: " + dia1.asFahrenheit());
	}
}
