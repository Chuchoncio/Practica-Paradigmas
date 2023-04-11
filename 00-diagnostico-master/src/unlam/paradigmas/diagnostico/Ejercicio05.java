package unlam.paradigmas.diagnostico;

public class Ejercicio05 {

	public static int[][] resolver(int[][] m) {
		
		if(m.length == 0) {
			System.out.println("No se puede obtener la moda de esta matriz");
			return null;
		}
		int newTam = (2*m.length)-1;
		int[][] matRes = new int[newTam][];
		for (int j = 0; j < m.length; j++) {
			for (int i = m[j].length-1, k = j, l = j; l < m.length; i = i == j? i : i-1, k++) {
				// Reservamos memoria para cada fila
				if(matRes[k] == null) {
					if(i != 0)
						matRes[k] = new int[k+1];
					else
						matRes[k] = new int[m.length-l];
				}
				
				//Asignamos las diagonales a la nueva matriz
				if(i != j)
					matRes[k][j] = m[i][j];
				else {
					matRes[k][j] = m[i][l];
					l++;
				}
			}
		}
		
		return matRes;
	}
}
