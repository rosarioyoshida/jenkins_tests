package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import features.Calculadora;

class TestCalculadora {

	@Test
	void newCalculadora() {
		Calculadora c = new Calculadora();
		assertNotNull("Erro ao instanciar construtor default.", c);
	}
	
	@Test
	void soma() {
		BigDecimal a = new BigDecimal("1.111111");
		BigDecimal b = new BigDecimal("2.222222");
		BigDecimal result = a.add(b);
		Calculadora c = new Calculadora();
		BigDecimal resultSoma = c.soma(a,b);
		assertEquals(result, resultSoma);
	}
	
	@Test
	void subtracao() {
		BigDecimal a = new BigDecimal("1.111111");
		BigDecimal result = a.subtract(a);
		Calculadora c = new Calculadora();
		BigDecimal resultSubtrair = c.subtrair(a,a);
		assertEquals(result, resultSubtrair);
	}

}
