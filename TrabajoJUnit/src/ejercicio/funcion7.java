package ejercicio;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import Pruebas.src.pruebas.Operaciones;
public class funcion7 {
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
	//en esta prueba deveria dar true si se han mostrado los carcteres entre el nº6 y el nº11 
	public boolean cumpleTiempoTrabajos( ) {
		String[] nombres = new String[3];
		nombres[0]="JoseMariaGonzalez";
		nombres[1]="DarioCondeOjeda";
		nombres[2]="CarloPerezMesa";
	
		
		//char []caracter = new char[ nombres.length];
	
		for(int y=0;y < nombres.length;y++) {
			String subnombres = nombres[y].substring(6,11);
			System.out.println(subnombres);
			
		}
		
		return true;
		
		
	}
}
