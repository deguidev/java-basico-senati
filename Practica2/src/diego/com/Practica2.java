package diego.com;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		/*
		# COSAS QUE DEB  ES USAR
		- Variables
		- Scanner
		- tipo de dato double
		- Operadores Aritméticos (+ , /)
		- sout
		
		# EJERCICIO
		Crear un programa que pida al usuario
		3 notas.
		
		
		El programa debe calcular el promedio final.
		
		#RESULTADO
		"El promedio final es: 12"
	
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor ingrese la nota 1: ");
		double nota1 = scanner.nextDouble();
		System.out.print("Por favor ingrese la nota 2: ");
		double nota2 = scanner.nextDouble();
		System.out.print("Por favor ingrese la nota 3: ");
		double nota3 = scanner.nextDouble();
		
		double respuesta = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Diego Lipa");
		System.out.println("El promedio final es: " + respuesta);
		
		String respuesta2 = String.format("El promedio final es: %.2f ", respuesta);
		System.out.println(respuesta2);
		
		int edad  = 23;
		String nombre = "Diego";
		double sueldo = 3000;
		
		String mensaje = String.format(
				"El empleado %s de edad %d desea ganar %.2f dolares."
				,
				nombre, edad, sueldo
				);
		System.out.println(mensaje);
		
	}

}
