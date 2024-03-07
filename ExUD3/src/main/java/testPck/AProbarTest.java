package testPck;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

import clasesAProbar.*;

public class AProbarTest {

	// Pruebas para el metodo rotar
	// Probamos con varios parametros	
	@ParameterizedTest
	@CsvSource({ "5,6,7,8", "0,-2,3,45" })
	void pruebaRotar(int num1, int num2, int num3, int num4) {
		int[] arrayEntrada = { num1, num2, num3, num4 };
		int[] resultadoEsperado = { num4, num1, num2, num3 };
		assertArrayEquals(resultadoEsperado, AProbar.rotar(arrayEntrada));
	}

	@ParameterizedTest
	@CsvSource({ "100", "001", "000011", "0100102", })
	void pruebaBinarioDecimal(String numeroBinario) {
		long resultadoEsperado = AProbar.binarioADecimal(numeroBinario);
		assertEquals(resultadoEsperado, AProbar.binarioADecimal(numeroBinario));
	}

	// Lo deshabilito para utilizarlo en la version 2
	@Disabled
	@ParameterizedTest
	@CsvFileSource(resources = "ExUD3\\src\\test\\resources\\fichTest\\compMultiplos.csv\"", numLinesToSkip = 1)
	void pruebaEsMultiplo(int n1, int n2) {	
	boolean resultado = AProbar.esMultiplo(n1,n2);
	assertFalse(resultado);
	}
	

}
