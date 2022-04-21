package teste;

import dominio.Retangulo;
import static org.junit.Assert.*;
import org.junit.Test;

class testaRetangulo {

	@Test
	public void testArea() {
		Retangulo reta = new Retangulo(10,5);
		assertEquals(50, reta.calcularArea(), 0);
	}
	
	@Test
	public void testPerimetro() {
		Retangulo reta = new Retangulo(10,5);
		assertEquals(30, reta.calcularPerimetro(), 0);
	}

}
