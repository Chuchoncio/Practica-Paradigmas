package unlam.paradigmas.diagnostico;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio01Tests {
	
	@Test
	public void matrizDiagonalSuma() {
		// Arrange
		boolean esperado = true;
		int[][] m = { {0}, {3, 1}, {1} };

		// Act
		boolean real = Ejercicio01.resolver(m);

		// Assert
		Assert.assertEquals("Resultado: ", esperado, real); // Compruebo si dos variables son iguales

		// Annihilate
		// m = null;
	}

}
