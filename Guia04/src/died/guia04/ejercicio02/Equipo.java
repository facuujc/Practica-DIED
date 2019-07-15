/**
 * 
 */
package died.guia04.ejercicio02;



/**
 * @author facuujc
 *
 */
public class Equipo implements Comparable<Equipo> {
	private String nombre;
	private Integer puntos;
	private Integer partidosJugados;
	private Integer golesAFavor;
	private Integer golesEnContra;

	public Equipo() {
		this.nombre = "-";
		this.puntos = 0;
		this.partidosJugados = 0;
		this.golesAFavor = 0;
		this.golesEnContra = 0;
	}
	
	/**
	 * Este método incrementa los goles a favor, y los goles en contra. Si la
	 * cantidad de goles a favor es mayor que la de goles en contra suma 3 puntos.
	 * Si la cantidad es igual, suma un punto y si es menor no suma ningún punto.
	 * Todo equipo que gane un partido por una diferencia de más 4 o más goles a
	 * favor sumará un punto bonus extra.
	 * 
	 * @param golesAFavor   Cantidad de goles a favor del equipo en el partido
	 * @param golesEnContra Cantidad de goles en contra del equipo en el partido
	 */
	public void registrarPartido(Integer golesAFavor, Integer golesEnContra) {
		this.partidosJugados++;
		this.golesAFavor += golesAFavor;
		this.golesEnContra += golesEnContra;
		if (golesAFavor > golesEnContra) {
			this.puntos += 3;
			if ((golesAFavor - golesEnContra) >= 4) {
				this.puntos++;
			}
		} else if (golesAFavor == golesEnContra) {
			this.puntos++;
		}
	}

	/**
	 * Dos equipos son iguales si tienen el mismo nombre
	 * 
	 * @param e Equipo a comparar
	 * @return boolean Retorna true si dos equipos son iguales
	 */
	public boolean equals(Equipo e) {
		if (e instanceof Equipo) {
			if (this.getNombre().equals(e.getNombre())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Retorna "Nombre: <nombre> - Puntos: <puntos> - Partidos jugados:
	 * <partidosJugados>"
	 * 
	 * @return String
	 */
	public String toString() {
		return ("Nombre: " + this.getNombre() + " - Puntos: " + this.getPuntos() + " - Partidos jugados: "
				+ this.getPartidosJugados());
	}

	/**
	 * Un equipo aparece antes que otro, si tiene más puntos que otro.
	 * Si tienen el mismo puntaje, aparece antes el que tiene mayor diferencia de gol.
	 * Si persiste la igualdad aparecerá en primer lugar el que tiene mas goles a favor.
	 * Finalmente se determina el ordenamiento alfabetico.
	 * Si el equipo que recibe el mensaje es mayor retorna 1, si es menor -1 y en caso de ser iguales 0
	 * @param Equipo Equipo a comparar
	 * @return int Retorna -1, 0 1
	 */
	public int compareTo(Equipo e) {
		int resultado = 0;
		if (( resultado = (int) (e.getPuntos().compareTo(this.getPuntos()))) != 0) {
			return resultado;
		} else if ((resultado = (int) (e.golesDiferencia().compareTo(this.golesDiferencia()))) != 0 ) {
			return resultado;
		} else if ((resultado = (int) (e.getGolesAFavor().compareTo(this.getGolesAFavor()))) != 0) {
			return resultado;
		} else {
			return (this.getNombre().compareTo(e.getNombre()));
		}
	}
	
	/**
	 * Retorna la diferencia de golesAFavor - golesEnContra
	 * @return Integer
	 */
	public Integer golesDiferencia() {
		return (this.getGolesAFavor() - this.getGolesEnContra());
	}
	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Integer getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(Integer partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public Integer getGolesAFavor() {
		return golesAFavor;
	}

	public void setGolesAFavor(Integer golesAFavor) {
		this.golesAFavor = golesAFavor;
	}

	public Integer getGolesEnContra() {
		return golesEnContra;
	}

	public void setGolesEnContra(Integer golesEnContra) {
		this.golesEnContra = golesEnContra;
	}

}
