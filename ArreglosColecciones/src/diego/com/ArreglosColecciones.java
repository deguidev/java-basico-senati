package diego.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArreglosColecciones {
	
	
	public void arraySimple() {
		int[] numeros = {1,2,30,40,50,60,70,100};
		String[] dias = {"Lunes", "Mates", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		
		//Imprimir un numero según el índece
		System.out.println(numeros[7]);
		System.out.println(dias[2]);
		
		//Modificar un elemento
		numeros[0] = 10;
		numeros[1] = 20;
		
		//Contar la cantidad de elementos que tiene un array.
		int cantidad = numeros.length;
		System.out.println(cantidad);
		
		//Iterar los dos arrays
		//for-each
		for(int numero : numeros) {
			System.out.println("Numero: " + numero);
		}
		//for
		for(int i = 0; i < dias.length ; i++) {
			System.out.println("Dia: " + dias[i] );
		}
	}
	
	public void arrayList() {
		
		ArrayList<String> frutas = new ArrayList<>();
		
		//Agregar datos o elementos
		frutas.add("Manzana");
		frutas.add("Pera");
		frutas.add("Naranja");
		frutas.add("Uva");
		
		//Agregar un elemento segun el índice
		frutas.add(2,"Granadilla");
		
		//Acceder a elementos
		String primeraFruta =  frutas.get(0);
		System.out.println("primera fruta: "+ primeraFruta);
		
		//Modificar elementos
		frutas.set(4,"Pepino");
		
		//Emilinar elemento
		frutas.remove(3);
		
		//verificar si contiene un elemento
		boolean contieneNaranja = frutas.contains("Naranja");
		System.out.println("Exsite la palabra Naranja: " + contieneNaranja);
		
		//tamaño
		int tamanio = frutas.size();
		System.out.println("el tamaño es: " + tamanio );
		
		//para validar si esta vacio
		boolean estaVacia = frutas.isEmpty();
		System.out.println("el erray esta vacía: " + estaVacia );
		
		//Limpiar todo los elementos
		frutas.clear();
	}
	
	public void hashMap() {
		HashMap<String, String> capitales = new HashMap<>();
		
		//Agregar elementos a mi HashMap
		capitales.put("Perú","Lima");
		capitales.put("España","Madrid");
		capitales.put("Bolivia","La Paz");
		capitales.put("Chile","Arica");

		//Acceder a un elemento
		String capitalPeru = capitales.get("Perú");
		System.out.println(capitalPeru);
		
		//Quitar un elemento
		capitales.remove("Bolivia");
		
		//Validar si existe una key
		boolean existeMexico =  capitales.containsKey("Mexico");
		System.out.println("Existe Mexico: "+ existeMexico);
		
		//Modificar Elementos
		capitales.replace("Chile", "Santiago");
		
		//Blucles en HashMap
		//iterar keys
		for( String pais : capitales.keySet()) {
			System.out.println("Pais: "+ pais);
		}
		
		//iterar values
		for(String capital: capitales.values()) {
			System.out.println("Capital: "+ capital);
		}
		
		//iterar keys and values
		for(Map.Entry<String, String> paisCapital : capitales.entrySet()) {
			System.out.println("Pais: "+ paisCapital.getKey() + " Capital: "+ paisCapital.getValue());
		}
	}
	
	
	
	public static void main(String[] args) {
		ArreglosColecciones ac = new ArreglosColecciones();
		ac.arraySimple();
		ac.arrayList();
		ac.hashMap();
	}
}
