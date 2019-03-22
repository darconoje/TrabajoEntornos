package ejercicio;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import Pruebas.src.pruebas.Operaciones;
public class funcion6 {
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
	//en este test al dar la posicion "2" y la posicion "5" deveria dar true ya que son par
	public boolean cumpleTiempoTrabajos( ) {
		Double cadena1[] = {17.0, 7.0, 8.0, 7.0, 4.0};	
		int []cadena2 = new int[cadena1.length];
		int cuenta = 0;
		int z = 7;
		int w = 7; 
		for (int x = 0; x<cadena2.length;x++){
			cadena2[x]=cadena1.length;
			if(cadena2[x]%2==0) {
				System.out.println(" Es par " + (cadena2[x]*z));
				cuenta=cadena2[x]*z;
				cadena2[x]=true;
			}else {
				cuenta=cadena2[x]^w;
				System.out.println(" Es impar " + (cadena2[x]^w));
				
			}
		}
		
		return cuenta;
		
	}
}
