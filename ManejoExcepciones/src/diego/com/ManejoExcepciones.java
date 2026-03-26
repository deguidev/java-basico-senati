package diego.com;

import java.util.Scanner;

public class ManejoExcepciones {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		try {
			System.out.print("Por favor ingresa un numero: ");
			int numero = sc.nextInt();
			
		} catch(Exception e) {
			System.out.println("Ocurrio un error 🐝🐝🐝: " + e.getMessage());
		} finally{
			sc.close();
		}
	}

}
