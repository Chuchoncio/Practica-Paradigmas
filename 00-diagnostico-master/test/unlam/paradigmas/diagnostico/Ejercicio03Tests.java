package unlam.paradigmas.diagnostico;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio03Tests {

	@Test
	public void matrizSumaAdyacentes() {
		// Arrange
		int[][] m = { {8, 2, -3, 4}, {5, -6, -6, 20}, {21, 1, -5, 0} };
		int[][] matEsperado = { {15,1,-3,21}, {28,-4,0,18}, {27,11,-10,15} };
		boolean esperado = true;

		// Act
		int[][] matResultado = Ejercicio03.resolver(m);
		boolean real;
		if(Arrays.deepEquals(matEsperado, matResultado))
			real = true;
		else
			real = false;

		// Assert
		Assert.assertEquals("Resultado: ", esperado, real); // Compruebo si dos variables son iguales

		// Annihilate
		// matEsperado = null;
	}
}
