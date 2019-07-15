/**
 * 
 */
package died.guia04.ejercicio03;

import java.util.ArrayList;

/**
 * @author facuujc
 *
 */
public class Alumno {
	private Integer libreta;
	private String nombre;
	private ArrayList<Curso> inscriptos;
	private ArrayList<Curso> aprobados;
	
	public Alumno() {
		this.inscriptos = new ArrayList<Curso>();
		this.aprobados = new ArrayList<Curso>();
	}
	
	public Alumno(Integer id, String nombre) {
		this.inscriptos = new ArrayList<Curso>();
		this.aprobados = new ArrayList<Curso>();
		this.libreta = id;
		this.nombre = nombre;
	}
	
	public boolean equals(Alumno a) {
		return this.libreta.equals(a.libreta);
	}
	
	public void inscribir(Curso c) {
		this.inscriptos.add(c);
	}
	
	public void aprobar(Curso c) {
		this.inscriptos.remove(c);
		this.aprobados.add(c);
	}
	
	public Integer creditos() {
		Integer creditos = 0;
		for (Curso curso : aprobados) {
			creditos += curso.getCreditos();
		}
		return creditos;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

	//Getters and Setters

	public ArrayList<Curso> getInscriptos() {
		return inscriptos;
	}

	public ArrayList<Curso> getAprobados() {
		return aprobados;
	}
	
}


