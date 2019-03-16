//ESTA ES LA PRIMERA FUNCION

package ejercicio;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class funcion2 {
	
	//Resuelta
	
	/*Ejemplos de funcion*/
	static Operaciones o = null;
	static int operacionesRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		o = new Operaciones();
		System.out.println();
		System.out.println("Valor más pequeño:"+Integer.MIN_VALUE);
		System.out.println("Valor más pequeño -1:"+(Integer.MIN_VALUE -1));
		System.out.println("Valor más grande:"+Integer.MAX_VALUE);
		System.out.println("Valor más grande +1:"+(Integer.MAX_VALUE + 1));
		System.out.println();
	}
	
	@BeforeEach
	private void preparaPruebaEjecutar(){
		operacionesRealizadas++;
		System.out.println("Ejecutando test "+ operacionesRealizadas);
	}
	
	@AfterEach
	private void terminadaPrueba(){
		System.out.println("Se ha ejecutado el test: "+operacionesRealizadas);
		System.out.println();
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Operaciones();
		System.out.println("Numero de pruebas realizadas: " + operacionesRealizadas);
	}
	
	@DisplayName("Test de Caja Negra N=0")
	@Test
	public void divisible1() {
		assertTrue(o.funcion1(0));
	}
	
	@DisplayName("Test de Caja Negra N=17")
	@Test
	public void divisible2() {
		assertTrue(o.funcion1(17));
	}
	
	@DisplayName("Test de Caja Negra Numero divisible entre 17")
	@Test
	public void divisible3() {
		assertTrue(o.funcion1(34));
	}
	
	@DisplayName("Test de Caja Negra Numero no divisible entre 17")
	@Test
	public void divisible4() {
		assertFalse(o.funcion1(18));
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior")
	@Test
	void divisible5() {
		assertFalse(o.funcion1(Integer.MIN_VALUE)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void divisible6() {
		assertFalse( o.funcion1(Integer.MIN_VALUE -1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior")
	@Test
	void divisible7() {
		assertFalse(o.funcion1(Integer.MAX_VALUE)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void divisible8() {
		assertFalse( o.funcion1(Integer.MAX_VALUE +1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior -1")
	@Test
	void divisible9() {
		assertFalse( o.funcion1(Integer.MAX_VALUE - 1)); 
	}
	
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior +1")
	@Test
	void divisible10() {
		assertFalse( o.funcion1(Integer.MIN_VALUE +1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior")
	@Test
	void divisible11() {
		assertFalse( o.funcion1(Integer.MIN_VALUE)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void divisible12() {
		assertFalse( o.funcion1(Integer.MIN_VALUE -1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior")
	@Test
	void divisible13() {
		assertFalse( o.funcion1(Integer.MAX_VALUE)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void divisible14() {
		assertFalse( o.funcion1(Integer.MAX_VALUE +1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior -1")
	@Test
	void divisible15() {
		assertFalse( o.funcion1(Integer.MAX_VALUE - 1)); 
	}
	
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior +1")
	@Test
	void divisible16() {
		assertFalse( o.funcion1(Integer.MIN_VALUE +1)); 
	}
}
