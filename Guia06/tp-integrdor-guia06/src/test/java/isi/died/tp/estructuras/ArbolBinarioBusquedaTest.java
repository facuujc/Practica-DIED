package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArbolBinarioBusquedaTest {
	private ArbolBinarioBusqueda<Integer> abCnolleno;
	private ArbolBinarioBusqueda<Integer> abLLeno;
	private ArbolBinarioBusqueda<Integer> NINO;
	@Before
	public void preTest() {
		abCnolleno = new ArbolBinarioBusqueda<Integer>(50);
		abLLeno = new ArbolBinarioBusqueda<Integer>(50);
		NINO = new ArbolBinarioBusqueda<Integer>(50);
		abCnolleno.agregar(25);
		abCnolleno.agregar(60);
		abCnolleno.agregar(20);
		abCnolleno.agregar(30);
		abLLeno.agregar(25);
		abLLeno.agregar(75);
		abLLeno.agregar(20);
		abLLeno.agregar(30);
		abLLeno.agregar(60);
		abLLeno.agregar(80);
		NINO.agregar(20);
		NINO.agregar(10);
		NINO.agregar(25);
	}

	@Test
	public void testContiene() {
		assertTrue(abCnolleno.contiene(50));
		assertTrue(abCnolleno.contiene(25));
		assertFalse(abCnolleno.contiene(800));
		assertTrue(abCnolleno.contiene(30));
		assertTrue(abCnolleno.contiene(60));
		assertTrue(abLLeno.contiene(20));
		assertTrue(abLLeno.contiene(25));
		assertTrue(abLLeno.contiene(30));
		assertTrue(abLLeno.contiene(50));
		assertTrue(abLLeno.contiene(60));
		assertTrue(abLLeno.contiene(75));
		assertTrue(abLLeno.contiene(80));
		assertTrue(NINO.contiene(50));
		assertTrue(NINO.contiene(25));
		assertTrue(NINO.contiene(10));
		assertTrue(NINO.contiene(20));
		assertFalse(NINO.contiene(9999));
		assertFalse(abLLeno.contiene(-50));
		assertFalse(abCnolleno.contiene(54));
		
	}

	@Test
	public void testEqualsArbolOfE() {
		assertTrue(abCnolleno.equals(abCnolleno));
		assertTrue(abLLeno.equals(abLLeno));
		assertTrue(NINO.equals(NINO));
		assertFalse(NINO.equals(abCnolleno));
		assertFalse(abLLeno.equals(abCnolleno));
		assertFalse(abCnolleno.equals(abLLeno));
	}

	@Test
	public void testAgregar() {
	}

	@Test
	public void testProfundidad() {
		assertTrue(abCnolleno.profundidad()==3);
		assertTrue(abLLeno.profundidad()==3);
		assertTrue(NINO.profundidad()==3);
		assertFalse(NINO.profundidad()==1);
		assertFalse(abLLeno.profundidad()==6);
		assertFalse(abCnolleno.profundidad()==4);
	}

	@Test
	public void testCuentaNodosDeNivel() {
		assertTrue(abCnolleno.cuentaNodosDeNivel(2)==2);
		assertTrue(abLLeno.cuentaNodosDeNivel(2)==4);
		assertTrue(NINO.cuentaNodosDeNivel(2)==2);
		assertFalse(NINO.cuentaNodosDeNivel(1)==3);
		assertFalse(abLLeno.cuentaNodosDeNivel(1)==1);
		assertFalse(abCnolleno.cuentaNodosDeNivel(0)==2);
	}

	@Test
	public void testEsCompleto() {
		assertTrue(abCnolleno.esCompleto());
		assertTrue(abLLeno.esCompleto());
		assertFalse(NINO.esCompleto());
	}

	@Test
	public void testEsLleno() {
		assertFalse(abCnolleno.esLleno());
		assertTrue(abLLeno.esLleno());
		assertFalse(NINO.esLleno());
	}

}
