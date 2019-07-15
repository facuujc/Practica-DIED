package died.guia04.ejercicio04;

public class CreditosInsuficienesException extends InscripcionCursoException {
	public CreditosInsuficienesException (int requeridos, int obtenidos) {
		super("Se requieren " + requeridos + " creditos y ha obtenido " + obtenidos + " creditos.");
	}
}
