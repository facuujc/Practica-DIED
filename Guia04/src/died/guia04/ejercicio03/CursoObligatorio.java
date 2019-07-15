/**
 * 
 */
package died.guia04.ejercicio03;

import java.util.ArrayList;

import died.guia04.ejercicio04.InscripcionCursoException;

/**
 * @author facuujc
 *
 */
public class CursoObligatorio extends Curso{
	private ArrayList<Curso> correlativas;
	
	public CursoObligatorio() {
		super();
		this.correlativas = new ArrayList<Curso>();
	}
	
	public CursoObligatorio(String nombre, int creditos, int cupo) {
		super(nombre, creditos, cupo);
		this.correlativas = new ArrayList<Curso>();
	}
	
	public void agregarCorrelativa(Curso c) {
		this.correlativas.add(c);
	}
	
	public Boolean tieneCorrelativas(Alumno a) {
		for (Curso curso : correlativas) {
			Boolean b = false;
			for (Curso aprobada : a.getAprobados()) {
				if(curso.equals(aprobada)) {
					b = true;
				}
			}
			if (b == false) {
				return false;
			}
		}
		return true;
	}
	
	public void inscribir(Alumno a) throws InscripcionCursoException {
		if (!this.tieneCorrelativas(a)) {
			throw new InscripcionCursoException();
		} else {
			super.inscribir(a);
		}
	}
}



