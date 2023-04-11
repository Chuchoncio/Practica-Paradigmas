package unlam.paradigmas.diagnostico;

public class Ejercicio03 {

	public static int[][] resolver(int[][] m) {
		
		if (m.length == 0) {
			System.out.println("Matriz vacia");
			return null;
		}
		/* 
		 * Elem izquierda 	= m[i][j-1]
		 * Elem derecha 	= m[i][j+1]
		 * Elem arriba 		= m[i-1][j-1]
		 * Elem abajo 		= m[i+1][j-1]
		 * */
		
		int[][] mRes = new int[m.length][m[0].length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				mRes[i][j] = m[i][j];
				if(i == 0) {
					if(j == 0)
						mRes[i][j] += m[i][j+1] + m[i+1][j];
					else if(j == m[i].length-1)
						mRes[i][j] += m[i][j-1] + m[i+1][j];
					else
						mRes[i][j] += m[i][j-1] + m[i+1][j] + m[i][j+1];
				}
				else if(i == m.length - 1) {
					if(j == 0)
						mRes[i][j] += m[i-1][j] + m[i][j+1];
					else if(j == m[i].length-1)
						mRes[i][j] += m[i-1][j] + m[i][j-1];
					else
						mRes[i][j] += m[i][j-1] + m[i-1][j] + m[i][j+1];
				}
				else {
					if(j == 0)
						mRes[i][j] += m[i-1][j] + m[i][j+1] + m[i+1][j];
					else if(j == m[i].length-1)
						mRes[i][j] += m[i-1][j] + m[i][j-1] + m[i+1][j];
					else
						mRes[i][j] += m[i-1][j] + m[i][j+1] + m[i+1][j] + m[i][j-1];
				}
			}
		}
		
		mostrarMatriz(m);
		System.out.println("");
		mostrarMatriz(mRes);
		
		return mRes;
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		for (int x=0; x < matriz.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
	}
}
