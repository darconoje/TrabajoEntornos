package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class funcion4 {

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
	
	@DisplayName("Test de Caja Negra String vacio")
	@Test
	public void divisible1() {
		assertEquals(" ",o.funcion4("", ""));
	}
	
	@DisplayName("Test de Caja Negra Nombre de los integrantes del grupo")
	@Test
	public void divisible2() {
		assertEquals("r nd jd s r nzlz mnz",o.funcion4("Dario Conde Ojeda", "Jose Maria Gonzalez Jimenez"));
	}
	
	@DisplayName("Test de Caja Negra primer string vacio")
	@Test
	public void divisible3() {
		assertEquals("hl ",o.funcion4("hola", ""));
	}
	
	@DisplayName("Test de Caja Negra segundo string vacio")
	@Test
	public void divisible4() {
		assertEquals(" hl",o.funcion4("", "hola"));
	}
		
	@DisplayName("Test de Caja Negra todo mayusculas")
	@Test
	public void divisible5() {
		assertEquals(" ",o.funcion4("HOLA", "HOLA"));
	}
	
	@DisplayName("Test de Caja Negra todo minusculas")
	@Test
	public void divisible6() {
		assertEquals("hl hl",o.funcion4("hola", "hola"));
	}
	
	@DisplayName("Test de Caja Negra todo vocales")
	@Test
	public void divisible7() {
		assertEquals(" ",o.funcion4("aeiou", "aeiou"));
	}
		
	
	@DisplayName("Test de Caja Negra sin mayusculas ni vocales")
	@Test
	public void divisible8() {
		assertEquals("qwrty qwrty",o.funcion4("qwrty", "qwrty"));
	}
	
		
}
