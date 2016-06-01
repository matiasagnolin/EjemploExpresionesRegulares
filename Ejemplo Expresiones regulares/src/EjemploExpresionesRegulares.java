import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploExpresionesRegulares {

	/*
	 * Ejemplo de validaciones utilizando expresiones regulares
	 * Turorial Oracle: https://docs.oracle.com/javase/tutorial/essential/regex/
	 * Validador online: https://regex101.com/
	 */
	public static void main(String[] args) {
		//Modificar esta cadena para realizar pruebas
		String cadenaValidar = "string";
		
		Pattern soloLetras = Pattern.compile("([a-zA-Z])*");
		Pattern soloNumeros = Pattern.compile("([0-9])*");
		
		
		//Valida que solo se sean letras de 'a' a la 'z' (Indistintamente de las mayusculas)
		Matcher m = soloLetras.matcher(cadenaValidar);
		
		if (m.matches()) {
			System.out.println("Es una cadena compuesta solo de letras");
		}else{
			System.out.println("No es una cadena compuesta solo de letras");
		}
		
		//Valida que solo se sean numeros del 0 al 9
		m = soloNumeros.matcher(cadenaValidar);
		if (m.matches()) {
			System.out.println("Es una cadena compuesta solo de numeros");
		}else{
			System.out.println("No es una cadena compuesta solo de numeros");
		}

	}

}
