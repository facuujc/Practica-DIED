package died.guia04.ejercicio04;

public class CupoNoDisponibleException extends InscripcionCursoException {
	public CupoNoDisponibleException (int cupo) {
		super("El cupo m�ximo de alumnos " + cupo + " ya ha sido alcanzados");
	}
}
