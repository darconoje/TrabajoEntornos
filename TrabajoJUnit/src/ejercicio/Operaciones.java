package ejercicio;

public class Operaciones {
	
	public Operaciones() {
		
	}
	
	public boolean funcion1(int n) {
		return n%17==0;
	}
	
	public boolean funcion2(int n) {
		boolean intervalo=false;
		for(int i = 17 ; i<=550; i++) {
			if(i==n) {
				intervalo = true;
				break;
			}
		}
		return intervalo;
	}
	
	public int funcion3(int n, int m) {
		int resultado = 0;
		if(n%17==0) {
			if(m>500&&m<600) {
				if(m%n==0) {
					resultado = m/n;
				}
			}
		}
		return resultado;
	}

	public String funcion4(String nombre1 , String nombre2) {
		String concatenado = nombre1 + " " + nombre2;
		String modificacion = "";
		char []caracteres = new char[concatenado.length()];
		for (int i = 0 ; i<caracteres.length;i++) {
			caracteres[i]=concatenado.charAt(i);
		}
		for(int i = 0; i<caracteres.length; i++) {
			if(caracteres[i]>=65&&caracteres[i]<=90||caracteres[i]==97||caracteres[i]==101||caracteres[i]==105||caracteres[i]==111||caracteres[i]==117) {
				caracteres[i]=(char)0;
			}
		}
		for(int i = 0; i<caracteres.length;i++) {
			if(caracteres[i] != (char)0) {
				modificacion = modificacion + caracteres[i];
			}
		}		
		return modificacion;
	}
	
}
