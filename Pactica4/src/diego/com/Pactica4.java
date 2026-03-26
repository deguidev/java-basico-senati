package diego.com;

import java.util.Scanner;

public class Pactica4 {

	public static void main(String[] args) {
		/*
		 COSAS QUE DEBES USAR
		 	- Variables
		 	- Scanner
		 	- Tipo de datos: double, int
		 	- Constante (final) -igv
		 	- Operadores aritmeticos: (+, -, *, /)
		 	- String.format
		 	- sout
		 
		 EJERCICIO
		    - Crea un programa que pida al usuario:
		    1. el precio total.
		    2. la cantidad de produtos
		    
		    - Calcular el total (precio * cantidad)
		    - Calcular el IGV (total / 1.18)
		    - Calcular el precio sin el IGV (total - igvca)
		 	
		 	RESULTADO
		 	- "Precio sin ivg: 90 | ivg 18% : 10 | precio total: 100"
		 	
		 */
		
		Scanner scanner = new Scanner(System.in);
		final double IGV = 0.18;
		
		
		System.out.println("Por favor ingrese el precio: ");
		double precio = scanner.nextDouble();
		
		System.out.println("Por favor ingrese la catidad: ");
		int cantidad = scanner.nextInt();
		
		double total =  precio * cantidad;
		double montoIgv = total * IGV;
		double subTotal = total - montoIgv;
		
		String mensaje = String.format(
				"Sub Total: %.2f | IGV 18 : %.2f | precio total: %.2f"
				,
				subTotal, montoIgv, total
				);
		System.out.println(mensaje);
	}

}
