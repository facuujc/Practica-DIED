/**
 * 
 */
package died.guia04.ejercicio02;

import java.util.Comparator;

/**
 * @author facuujc
 *
 */
public class CompararPorPromedio implements Comparator<Equipo>{
	
	@Override
	public int compare(Equipo e1, Equipo e2) {
		if (( (double) (e1.getPuntos()) / (double) (e1.getPartidosJugados())) > ( (double) (e2.getPuntos()) / (double) (e2.getPartidosJugados()))) {
			return -1;
		} else if (( (double) (e1.getPuntos()) / (double) (e1.getPartidosJugados())) < ( (double) (e2.getPuntos()) / (double) (e2.getPartidosJugados()))) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
