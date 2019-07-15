/**
 * 
 */
package died.guia04.ejercicio02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author facuujc
 *
 */
public class Torneo {
	private String titulo;
	private ArrayList<Equipo> equipos;
	
	public Torneo() {
		this.titulo = "-";
		this.equipos = new ArrayList<Equipo>();
	}
	
	public Torneo(String titulo) {
		this.titulo = titulo;
		this.equipos = new ArrayList<Equipo>();
	}
	/**
	 * Recibe como parámetro un equipo y si no pertenece a la lista lo agrega
	 * @param e equipo a agregar en la lista
	 */
	public void addEquipo(Equipo e) {
		if(!this.equipos.contains(e)) {
			this.equipos.add(e);
		}
	}
	
	/**
	 * Busca los equipos en la lista, y a cada equipo le invocan el método “registrarPartido(int,int)” de la clase Equipo.
	 * @param nombreLocal Nombre del equipo local
	 * @param golLocal Goles del equipo local
	 * @param nombreVisita Nombre del equipo visitante
	 * @param golVisita Goles del equipo visitante
	 */
	public void registrarPartido(String nombreLocal, Integer golLocal, String nombreVisita, Integer golVisita) {
		for (Equipo equipo : equipos) {
			if (equipo.getNombre() == nombreLocal) {
				equipo.registrarPartido(golLocal, golVisita);
			} else if (equipo.getNombre() == nombreVisita) {
				equipo.registrarPartido(golVisita, golLocal);
			}
		}
	}
	
	/**
	 * Imprime la lista de equipos ordenado por el puntaje que poseen.
	 */
	public void tablaPosiciones() {
		Collections.sort(equipos);
		System.out.println("Tabla de posiciones:");
		for (Equipo equipo : equipos) {
			System.out.println(equipo.getNombre() + " (" + equipo.getPuntos() + ")" );
		}
	}
	
	/**
	 * Imprime la lista de equipos ordenado por el promedio de puntos obtenidos en la cantidad de partidos jugados, con sus respectivos promedios.
	 */
	public void tablaPromedios() {
		Collections.sort(equipos, new CompararPorPromedio());
		System.out.println("Tabla de promedios:");
		for (Equipo equipo : equipos) {
			System.out.println(equipo.getNombre() + " (" + ( (double) (equipo.getPuntos()) / (double) (equipo.getPartidosJugados())) + ")" );
		}
	}
}

