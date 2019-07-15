package died.guia05.ejercicio01;

public class App {
	public static void main(String[] args) {
		int[] l1 = {2, 4, 6, 8, 9, 10, 12};
		int[] l2 = {2, 4, 6, 8, 10, 12};
		System.out.println("Indice: " + distinto(l1, l2, 0, l2.length));
		
		int[] l3 = {3, 5, 7, 9, 11, 13};
		int[] l4 = {3, 5, 7, 11, 13};
		System.out.println("Indice: " + distinto(l3, l4, 0, l4.length));
		
	}
	
	public static int distinto(int[] l1, int[] l2, int i, int f) {
		int medio = ((f - i) / 2) + 1;
		if (f == i) {
			return i;
		} else if (l1[medio] != l2[medio]){ 
			return distinto(l1, l2, i, medio);
		} else {
			return distinto(l1, l2, medio + 1, f);
		}
	}
}
