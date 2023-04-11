package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Ejercicio05Tests {

	@Test
	public void matrizDiagonales() {
		//Arrange
		int[][] m = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
		int[][] matEsperada = {{13},{9,14},{5,10,15},{1,6,11,16},{2,7,12},{3,8},{4}};
		boolean esperado = true;
		
		//Act
		int[][] matResultado = Ejercicio05.resolver(m);
		boolean real;
		if(Arrays.deepEquals(matEsperada, matResultado))
			real = true;
		else
			real = false;
		
		//Assert
		Assert.assertEquals("Resultado: ", esperado, real);
		
		//Annihilate
		//matResultado = null;
	}

}
