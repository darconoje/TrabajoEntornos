package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class funcion4 {
	
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
	
	@DisplayName("Test de Caja Negra Nombre de los integrantes del grupo")
	@Test
	public void divisible3() {
		assertEquals("r nd jd s r nzlz mnz",o.funcion4("Dario Conde Ojeda", "Jose Maria Gonzalez Jimenez"));
	}
	
	
	
}
