/**
 * 
 */
package died.guia04.ejercicio02;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

/**
 * @author facuujc
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Equipo e1 = new Equipo();
		Equipo e2 = new Equipo();
		Equipo e3 = new Equipo();
		Equipo e4 = new Equipo();
		Equipo e5 = new Equipo();
		Random generadorAleatorio = new Random();
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		
		
		e1.setNombre("Equipo01");
		for (int i = 0; i < 5; i++) {
			e1.registrarPartido(generadorAleatorio.nextInt()*7,generadorAleatorio.nextInt()*7);
		}
		e2.setNombre("Equipo02");
		for (int i = 0; i < 5; i++) {
			e2.registrarPartido(generadorAleatorio.nextInt()*7,generadorAleatorio.nextInt()*7);
		}
		e3.setNombre("Equipo03");
		for (int i = 0; i < 5; i++) {
			e3.registrarPartido(generadorAleatorio.nextInt()*7,generadorAleatorio.nextInt()*7);
		}
		e4.setNombre("Equipo04");
		for (int i = 0; i < 5; i++) {
			e4.registrarPartido(generadorAleatorio.nextInt()*7,generadorAleatorio.nextInt()*7);
		}
		e5.setNombre("Equipo05");
		for (int i = 0; i < 5; i++) {
			e5.registrarPartido(generadorAleatorio.nextInt()*7,generadorAleatorio.nextInt()*7);
		}
		
		equipos.add(e1);
		equipos.add(e2);
		equipos.add(e3);
		equipos.add(e4);
		equipos.add(e5);
		
		System.out.println(equipos);

		Collections.sort(equipos);
		
		System.out.println(equipos);
		
		Collections.sort(equipos, new CompararPorPromedio());
		
		System.out.println(equipos);
		
		Collections.sort(equipos, (Equipo eq1, Equipo eq2) -> e1.golesDiferencia().compareTo(e2.golesDiferencia()));

		System.out.println(equipos);

	}

}

