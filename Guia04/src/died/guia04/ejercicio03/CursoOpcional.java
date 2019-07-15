/**
 * 
 */
package died.guia04.ejercicio03;

import died.guia04.ejercicio04.CreditosInsuficienesException;
import died.guia04.ejercicio04.CupoNoDisponibleException;
import died.guia04.ejercicio04.InscripcionCursoException;

/**
 * @author facuujc
 *
 */
public class CursoOpcional extends Curso{
	private int creditosRequeridos;
	
	public CursoOpcional() {
		super();
		this.creditosRequeridos = 0;
	}
	
	public CursoOpcional(String nombre, int creditos, int cupo, int requeridos) {
		super(nombre, creditos, cupo);
		this.creditosRequeridos = requeridos;
	}
	
	public void inscribir(Alumno a) throws InscripcionCursoException{
		int obtenidos = a.creditos();
		if(obtenidos < creditosRequeridos) {
			throw new CreditosInsuficienesException(creditosRequeridos, obtenidos);
		} else {
			super.inscribir(a);
		}
	}
}



