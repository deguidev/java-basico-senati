package diego.com;

import java.util.Scanner;

public class EntradaSalidaConsola {
	
	
	public void ejemploEcanner() {
		Scanner scanner = new Scanner(System.in);
		
		//Pedir datos de tipo String
		System.out.print("Por favor ingrese su nombre: ");
		String nombre = scanner.nextLine();
		
		//Pedir datos de tipo int
		System.out.print("Por favor ingrese su edad: ");
		int edad = scanner.nextInt();		
		
		//Pedir datos de tipo double
		System.out.print("Por favor ingrese un precio: ");
		double precio = scanner.nextDouble();
		
		//Pedir datos de tipo boolean
		System.out.print("Por favor ingrese una respuesta: ");
		boolean respuesta = scanner.nextBoolean();
		
		System.out.println("Datos Ingresados");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Precio: " + precio);
		System.out.println("Respuesta: " + respuesta);
		
		scanner.close(); //Cerrar Instancia
		
	}
	
	
	public void ejemploSalidaDatos() {
		//Imprime texto y añade un salto de linea (println)
		System.out.println("Hola, Diego");
		
		//Imprime un texto sin añadir un saldo de linea (print)
		System.out.print("Hola a todos");
		
		//Imprime un texto formateado similar a fstring de python
		//String
		System.out.printf("Hola, %s","Diego");
		
		//int
		System.out.printf("el numero es: %d", 20);
		
		//double
		System.out.printf("el precio es: %f", 56.99);
		
		//double redondeado
		System.out.printf("El valo de PI es: %.2f", 3.1415);
		
		//boolean
		System.out.printf("el valor es: %b " ,false);
		
		//Salto de linea
		System.out.printf("linea 1 %n Linea 2");
		
		//Imprimir varias varibles en un printf
		String nombre = "Diego";
		int edad = 30;
		double sueldo = 4000;
		// salto de linea
		
		System.out.printf("Mi nombre es %s y tengo %d años %ny voy a ganar %.2f ",nombre, edad, sueldo);
	}
	
	public static void main(String[] args) {
		EntradaSalidaConsola esc = new EntradaSalidaConsola();
		//esc.ejemploEcanner();
		esc.ejemploSalidaDatos();
	}
}
