/**
 * 
 */
package died.guia04.ejercicio03;

import java.util.ArrayList;

import died.guia04.ejercicio04.CupoNoDisponibleException;
import died.guia04.ejercicio04.InscripcionCursoException;

/**
 * @author facuujc
 *
 */
public abstract class Curso {
	private String nombre;
	private int cupo;
	private int creditos;
	private ArrayList<Alumno> alumnos;
	
	/**
	 * Constructor por defecto inicializa lista de alumnos
	 */
	public Curso() {
		this.alumnos = new ArrayList<Alumno>();
		cupo = 0;
		creditos = 0;
	}
	
	/**
	 * Constructor sobrecargado para setear el resto de los atributos
	 * @param nombre Nombre del curso
	 * @param creditos Creditos otorgados por la aprobación del curso
	 * @param cupo Cantidad de alumnos disponibles
	 */
	public Curso(String nombre, int creditos, int cupo) {
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
		this.creditos = creditos;
		this.cupo = cupo;
	}
	
	/**
	 * Inscribe alumno a curso si hay cupo
	 * @param a Alumno a agregar a la lista
	 */
	public void inscribir(Alumno a) throws InscripcionCursoException{
		if (cupo < 1) {
			throw new CupoNoDisponibleException(cupo);
		} else {
			alumnos.add(a);
			cupo--;
		}
	}
	
	/**
	 * Recibe un alumno como parámetro y lo quita de la lista de alumnos
	 * @param a Alumno aprobado
	 */
	public final void aprobar(Alumno a) {
		alumnos.remove(a);
		cupo++;
	}
	
	/**
	 * Cantidad de cupos disponibles
	 * @return Cantidad de plazas disponibles
	 */
	public Integer plazasDisponibles() {
		return cupo;
	}
	
	/**
	 * Dos cursos son igualessi tienen el mismo nombre
	 * @return true si los cursos son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		return this.nombre.equals(obj);
	}
	
	public void imprimirAlumnos() {
		System.out.println(alumnos.toString());
	}
	
	
	//Getters and Setters
	
	public int getCreditos() {
		return creditos;
	}
	
}



