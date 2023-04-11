package unlam.paradigmas.diagnostico;

public class Ejercicio02 {

	public static boolean resolver(int[][] m) {

		int multip = 1, tamFil = m.length, tamCol = 0;

		if (tamFil == 0) {
			System.out.println("Matriz vacia");
			return false;
		}

		for (int i = 0; i < tamFil; i++) {
			tamCol = m[i].length;
			for (int j = 0; j < tamCol && multip != 0; j++) {
				multip *= m[i][j];
			}
		}

		return multip == 0;
	}
}
