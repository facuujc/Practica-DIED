/**
 * 
 */
package died.guia04.ejercicio01;

/**
 * @author facuujc
 *
 */
public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ciudad ciudad1 = new Ciudad("Santa Fe", 3000);
		Ciudad ciudad2 = new Ciudad("Paraná", 4000);
		Ciudad ciudad3 = new Ciudad("Santa Fe de la Vera Cruz", 3000);
		
		System.out.println(ciudad1.toString());
		System.out.println((ciudad1.equals(ciudad2))? "True" : "False");
		System.out.println((ciudad1.equals(ciudad3))? "True" : "False");
		
		Ruta ruta = new Ruta();
		ruta.agregarCiudad(ciudad1);
		ruta.agregarCiudad(ciudad2);
		ruta.agregarCiudad(ciudad3);
		System.out.println(ruta.getCiudades().toString());
		
	}

}
