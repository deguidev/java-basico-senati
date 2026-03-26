package diego.com;

import java.util.Scanner;

public class Pactica3 {

	public static void main(String[] args) {
		/*
		 COSAS QQUE DEBES USAR
		 - Variables
		 - Scanner
		 - Tipos de datos: int
		 - Operadores Aritméticos: -
		 - String.format
		 - sout
		 
		 EJECICIO
		 -Crea un programa que pida al usuario:
		 1. Su año de nacimiento
		 2. El año actual
		 
		 el programa debe calcular cuantos años
		 tiene actualmente
		 
		 RESULTADO
		 - "Ud. Tiene : 30 años"
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese su fecha de nacmiento:  ");
		int anioNacimiento = scanner.nextInt();
		
		System.out.println("Por favor ingrese el año actual: ");
		int anoiActual =  scanner.nextInt();
		
		int edad = anoiActual - anioNacimiento;
		
		String mensaje = String.format("Ud. Tiene : %d años", edad);
		System.out.println("Diego Lipa");
		System.out.println(mensaje);
	}

}
