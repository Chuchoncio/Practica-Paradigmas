package unlam.paradigmas.diagnostico;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Ejercicio04Tests {
	
	@SuppressWarnings("deprecation")
	@Test
	public void vectorModa() {
		//Arrange
		int[][] m = { {1, 2, 3, 4}, {5, -6, -6, 20}, {1, 1, 10, 10} };
		int[] vecEsperado = {4, -6, 10};
		boolean esperado = true;
		
		//Act
		int[] vecResultado = Ejercicio04.resolver(m);
		boolean real;
		if(Arrays.equals(vecEsperado, vecResultado))
			real = true;
		else
			real = false;
		
		//Assert
		Assert.assertEquals("Resultado: ", esperado, real);
		
		//Annihilate
		vecResultado = null;
	}
}
