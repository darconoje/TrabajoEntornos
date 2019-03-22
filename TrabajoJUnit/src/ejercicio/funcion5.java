package ejercicio;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import Pruebas.src.pruebas.Operaciones;
public class funcion5 {
	
	
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
		//esto tendria que darme la suma de la fecha en este caso la de josemaria deberia dar "3"
		public boolean cumpleTiempoTrabajos( ) {
			String[] alumnos = new String[2];
			alumnos[0]="JoseMaria";
			alumnos[1]="DarioCondeOjeda";
			int[][] fechanacimiento = new int[2][1];
			int[] JoseMaria = {01+02+00};
			int[] Dario = {13+3+93};
			int suma = 0;
			//char []caracteres = new char[cadena.length()];
			for (int i = 0; i<alumnos.length;i++) {
				int[] fecha=fechanacimiento[i];
				suma = fecha[i];
				if(fecha[0]==3) {
					suma = true;
					
				}
	        }
			return suma;
			
		}
}
