/**
 * 
 */
package died.guia04.ejercicio03;

/**
 * @author facuujc
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CursoOpcional cursoopcional = new CursoOpcional("CursoOp01", 5, 30, 0);
		Alumno alumno1 = new Alumno(123, "Alumno01");
		
		try {
			cursoopcional.inscribir(alumno1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		cursoopcional.imprimirAlumnos();
		cursoopcional.aprobar(alumno1);
		alumno1.aprobar(cursoopcional);
		
		CursoOpcional cursoopcional02 = new CursoOpcional("CursoOp02", 2, 32, 4);
		try {
			cursoopcional02.inscribir(alumno1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		cursoopcional02.imprimirAlumnos();
		cursoopcional02.aprobar(alumno1);
		alumno1.aprobar(cursoopcional02);
		
		CursoOpcional cursoopcional03 = new CursoOpcional("CursoOp03", 2, 32, 8);
		try {
			cursoopcional03.inscribir(alumno1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		cursoopcional03.imprimirAlumnos();
		
		CursoObligatorio cursoobligatorio = new CursoObligatorio("CursoOb01", 0, 25);
		cursoobligatorio.agregarCorrelativa(cursoopcional);
		try {
			cursoobligatorio.inscribir(alumno1);
		} catch (Exception e) {
			e.getMessage();
		}
		cursoobligatorio.imprimirAlumnos();
		
		
	}

}
