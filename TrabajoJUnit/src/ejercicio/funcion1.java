//ESTA ES LA SEGUNDA FUNCION

package ejercicio;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class funcion1 {

	/*Ejemplos de funciones*/
	static Operaciones o = null;
	static int operacionesRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		o = new Operaciones();
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
	public void intervalo1() {
		assertFalse(o.funcion2(0));
	}
	
	@DisplayName("Test de Caja Negra N=17 Limite Inferior")
	@Test
	public void intervalo2() {
		assertTrue(o.funcion2(17));
	}
	
	@DisplayName("Test de Caja Negra N=550 Limite Superior")
	@Test
	public void intervalo3() {
		assertTrue(o.funcion2(550));
	}
	
	@DisplayName("Test de Caja Negra N=551 Limite Superior + 1")
	@Test
	public void intervalo4() {
		assertFalse(o.funcion2(551));
	}
	
	@DisplayName("Test de Caja Negra N=16 Limite Inferior - 1")
	@Test
	public void intervalo5() {
		assertFalse(o.funcion2(16));
	}
	
	@DisplayName("Test de Caja Negra N=250 Numero dentro del intervalo")
	@Test
	public void intervalo6() {
		assertTrue(o.funcion2(250));
	}
	
	@DisplayName("Test de Caja Negra N=700 Numero fuera del intervalo")
	@Test
	public void intervalo7() {
		assertFalse(o.funcion2(700));
	}
}
