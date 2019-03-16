package ejercicio;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class funcion3 {

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
	
	@DisplayName("Test de Caja Blanca Primera condicion incorrecta, segunda incorrecta, tercera incorrecta ; n=3 m=2 ")
	@Test
	public void divisible1() {
		assertEquals(0,o.funcion3(3,2));
	}
	
	@DisplayName("Test de Caja Blanca Primera condicion correcta, segunda incorrecta, tercera incorrecta  ; n=17 m=18")
	@Test
	public void divisible2() {
		assertEquals(0,o.funcion3(17,0));
	}
	
	@DisplayName("Test de Caja Blanca Primera condicion correcta, segunda correcta, tercera incorrecta ; n=17 m=500")
	@Test
	public void divisible3() {
		assertEquals(0,o.funcion3(17,550));
	}
	
	@DisplayName("Test de Caja Blanca Primera condicion correcta, segunda correcta, tercera correcta ; n=17 m=510")
	@Test
	public void divisible4() {
		assertEquals(30,o.funcion3(17,510));
	}
	
	@DisplayName("Test de Caja Blanca Primera condicion incorrecta, segunda correcta, tercera incorrecta ; n=15 m=500")
	@Test
	public void divisible5() {
		assertEquals(30,o.funcion3(17,510));
	}
	
	@DisplayName("Test de Caja Blanca Primera condicion incorrecta, segunda incorrecta, tercera correcta ; n=3 m=6")
	@Test
	public void divisible6() {
		assertEquals(0,o.funcion3(3,6));
	}
}
