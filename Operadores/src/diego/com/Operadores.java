package diego.com;

public class Operadores {
	
	public void operadoresAritmeticos() {
		int numero1 = 50;
		int numero2 = 50;
		//Suma
		int respuestaSuma = numero1 + numero2;
		System.out.println(respuestaSuma);
		//Resta
		int respuestaResta = numero1 - numero2;
		System.out.println(respuestaResta);
		//Multiplicación
		int respuestaMultiplicacion = numero1 * numero2;
		System.out.println(respuestaMultiplicacion);
		//División
		int respuestaDivision = numero1 / numero2;
		System.out.println(respuestaDivision);
		//Módulo
		int respuestaModulo = numero1 % numero2;
		System.out.println(respuestaModulo);

	}
	
	public void operadoresRelacionales() {
		int numero1 = 10;
		int numero2 = 20;
		
		//igual a ==
		System.out.println(numero1 == numero2); //false
		
		//Diferente de !=
		System.out.println(numero1 != numero2); //true
		
		//Mayor que >
		System.out.println(numero1 > numero2); // false
		
		//Menor que <
		System.out.println(numero1 < numero2); // true
		
		//Mayor o Igual que >=
		System.out.println(numero1 >= numero2); //false
		
		//Menor o Igual que <=
		System.out.println(numero1 <= numero2); //true
		
		
	}
	
	public void operadoresLogicos() {
		boolean v = true;
		boolean f = false;
		
		// and (y) &&
		System.out.println("::::::::::::::::::&&");
		System.out.println(v && v); //true
		System.out.println(v && f); //false
		System.out.println(f && v); //false
		System.out.println(f && f); //false
		
		// or (o) ||
		System.out.println("::::::::::::::::::||");
		System.out.println(v || v); //true
		System.out.println(v || f); //true
		System.out.println(f || v); //true
		System.out.println(f || f); //false
		
		// not (negación) !
		System.out.println("::::::::::::::::::!");
		System.out.println(!v); //false
		System.out.println(!f); //true
	}
	
	public void operadoresAsignacion() {
		//Asignación simple (=)
		int alumnos = 10;
		
		//Suma y Asignación (+=)
		alumnos += 10;
		
		//Resta y Asignación (-=)
		alumnos -= 5;
		
		System.out.println(":::::::::::::::::Operadores Asignación");
		System.out.println(alumnos);
	}
	
	public void operadoresIncrementoDecremento() {
		int contador = 4;
		
		//Incremento (++) incrementa de uno en uno
		contador ++;
		
		//Decremento (--) disminuye de uno en uno
		contador --;
		System.out.println(":::::::::::::::Incremento Decremento");
		System.out.println(contador);
	}
	

	public static void main(String[] args) {
		Operadores op = new  Operadores();
		op.operadoresAritmeticos();
		op.operadoresRelacionales();
		op.operadoresLogicos();
		op.operadoresAsignacion();
		op.operadoresIncrementoDecremento();
	}

}
