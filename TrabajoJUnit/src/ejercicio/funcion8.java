package ejercicio;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import Pruebas.src.pruebas.Operaciones;
public class funcion8 {
	static Operaciones o = null;
	static int operacionesRealizadas = 0;
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		o = new Operaciones();
	}
	
	@BeforeEach
	private void preparaPruebaEjecutar(){
		operacionesRealizadas++;
		System.out.println("Ejecutando test "+ operacionesRealizadas);
	}
	@AfterEach
	private void terminadaPrueba(){
		System.out.println("Se ha ejecutado el test: "+operacionesRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Operaciones();
	}
	@DisplayName("Test de caja negra")
	@Test
	public void prueba1() {
		
	}
	public boolean cumpleTiempoTrabajos(String[] alumnos, int[][] tiemposTrabajos ) {
		boolean cumpleTiempo = true;
		int t = 800;
		for(int i = 0; i<tiemposTrabajos.length;i++) {
			
			int[] tiempoAlumno = tiemposTrabajos[i];
			int sumaTiempo = 0;
			for(int  j = 0; j<tiempoAlumno.length;j++) {
				sumaTiempo +=tiempoAlumno[j];
				
			}
			
			if(sumaTiempo > t){
				System.out.println("cumple con el tiempo requerido" + alumnos[i]);
			}else {
				cumpleTiempo = false;
				System.out.println("No cumple con el tiempo requerido" +alumnos[i]);
			
				}
			}
		
		return cumpleTiempo;
	}
}
