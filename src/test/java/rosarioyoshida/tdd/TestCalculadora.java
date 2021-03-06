package rosarioyoshida.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class TestCalculadora {
	
	public TestCalculadora() {
		
	}
	
	@Test
	public void newCalculadora() {
		Calculadora c = new Calculadora();
		assertNotNull("Erro ao instanciar construtor default.", c);
	}
	
	@Test
	public void soma() {
		BigDecimal a = new BigDecimal("1.111111");
		BigDecimal b = new BigDecimal("2.222222");
		BigDecimal result = a.add(b);
		Calculadora c = new Calculadora();
		BigDecimal resultSoma = c.soma(a,b);
		assertEquals(result, resultSoma);
	}
	
	@Test
	public void subtracao() {
		BigDecimal a = new BigDecimal("1.111111");
		BigDecimal result = a.subtract(a);
		Calculadora c = new Calculadora();
		BigDecimal resultSubtrair = c.subtrair(a,a);
		assertEquals(result, resultSubtrair);
	}

}
