package diego.com;

public class TipoDatoVariable {
	
	
	public void tipoDatoPrimitivo() {
		//Tipos de datos enteros
		byte edad = 25; //-128 a 127
		short temperatura = -200; // -32768 a 32767
		int poblacion = 1000000; //👍 // 4 Cifras
		long poblacionMundial = 78000000000L;
		
		//Tipos de datos con Punto Flotante
		float precio = 99.99f;
		double pi = 3.1416; //👍
		
		//Tipo de dato CHAR
		//Almacena un único Caracter
		char letra = 'D'; //👍
		char comillaDoble = '"';
		
		//Tipo de dato Booleano
		boolean esActivo = true; //👍
		
		//Imprimiendo Datos
		System.out.println(edad);
		System.out.println(poblacion);
		System.out.println(pi);
		System.out.println(letra);
		System.out.println(esActivo);
	}
	
	public void tipoDatoReferencia() {
		// Tipo de dato String
		//Forma 1
		String nombre = "Diego";
		
		//Forma 2 Instanciando
		String nombre2 = new String("Frank");
		
		//Imprimiendo variables
		
		System.out.println(nombre);
		System.out.println(nombre2);
		
	}

	public static void main(String[] args) {
		//Instanciar o Invocar un Objeto.
		TipoDatoVariable tdv = new TipoDatoVariable();
		tdv.tipoDatoPrimitivo();
		tdv.tipoDatoReferencia();
		
		//TipoDatoVariable td = new TipoDatoVariable();
		//td.tipoDatoReferencia();
	}

}
