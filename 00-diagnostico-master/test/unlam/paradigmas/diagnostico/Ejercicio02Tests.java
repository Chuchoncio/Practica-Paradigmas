package unlam.paradigmas.diagnostico;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio02Tests {

	@Test
	public void matrizSinCeros() {
		// Arrange
		boolean esperado = true;
		int[][] m = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };

		// Act
		boolean real = Ejercicio02.resolver(m);

		// Assert
		Assert.assertEquals("Resultado: ", esperado, real); // Compruebo si dos variables son iguales

		// Annihilate
		// m = null;
	}
}
