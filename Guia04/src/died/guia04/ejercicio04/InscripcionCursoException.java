package died.guia04.ejercicio04;

public class InscripcionCursoException extends Exception{
	public InscripcionCursoException () {
		super("Hubo un problema al inscribir al curso");
	}
	public InscripcionCursoException (String msg) {
		super(msg);
	}
}
