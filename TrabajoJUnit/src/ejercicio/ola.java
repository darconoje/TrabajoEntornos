package ejercicio;

public class ola {
	public static void main(String[] args) {
			String concatenado = "Dario Conde Ojeda";
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
			System.out.println(modificacion);
	}
}
