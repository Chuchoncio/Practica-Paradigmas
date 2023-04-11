package unlam.paradigmas.diagnostico;

public class Ejercicio01 {

	public static boolean resolver(int[][] m) {
		
		int suma;

		if (m.length == 0) {
			System.out.println("Matriz vacia");
			return false;
		}
		
		suma = m[0][0];
		
		for(int i = 1, j = 1; i < m.length && j < m[i].length; i++, j++) {
			if(suma != m[i][j])
				return false;
			
			suma += m[i][j];
		}		

		return true;
	}
}
