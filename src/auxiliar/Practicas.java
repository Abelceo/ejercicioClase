package auxiliar;

import modelo.Datos;
import modelo.Estudiante;

import java.util.Random;

public class Practicas {

	public void muestraNumero() {

		int x = 0;
		while (x <= 1000) {
			System.out.println(x);
			x++;
		}
	}

	public void muestraNumero(int min, int max) {
		if (min <= max) {
			int x = min;
			while (x <= max) {
				System.out.println(x);
				x++;
			}
		} else {
			System.out.println("Error el minimo no puede ser mayor que el maximo");

		}

	}

	public void muestraNumero2(int min, int max) {
		if (min <= max) {
			int x = min;
			do {
				System.out.println(x);
				x++;

			} while (x <= max);

		} else {
			System.out.println("Error el minimo no puede ser mayor que el maximo");

		}

	}

	public void muestraNumero3(int min, int max) {
		if (min <= max) {
			for (int x = min; x < max; x++)
				System.out.println("x: " + x);

		} else {
			System.out.println("Error el minimo no puede ser mayor que el maximo");

		}

	}

	public void generaAleatorios(int cuantos, int inferior, int superior) {
		for (int i = 0; i < cuantos; i++) {
			System.out.println(inferior + (int) (Math.random() * (superior - inferior + 1)));
		}
	}

	public void generaAleatorios2(int cuantos, int inferior, int superior) {
		Random rnd = new Random();
		for (int i = 0; i < cuantos; i++) {
			System.out.println(inferior + (int) (Math.random() * (superior - inferior + 1)));
		}
	}

	public static int metodo(int numero) {
		int i, j, var1 = 0, var2;
		for (i = 1; i < 10000000; i = i * 10) {

			if (i > numero)
				break;
		}
		for (j = i; j >= 1; j = j / 10) {
			var2 = numero / j;
			var1 += var2;
			numero = numero % j;

		}

		return var1;
	}

	public void estadisticaCadena(String cadena) {
		int contadorVocales = 0;
		int contadorMayusculas = 0;
		int contadorAscii = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I'
					|| cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U' || cadena.charAt(i) == 'a'
					|| cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
					|| cadena.charAt(i) == 'u') {
				contadorVocales++;
			}

			if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z')
				contadorMayusculas++;
			int caracterAscii = cadena.charAt(i);
			if ((caracterAscii >= 0) && (caracterAscii <= 47) || (caracterAscii >= 58) && (caracterAscii <= 64)
					|| (caracterAscii >= 91) && (caracterAscii <= 96)) {
				contadorAscii++;
			}
			System.out.print(cadena.charAt(i));

		}

		System.out.println("\nhay " + contadorVocales + " vocales");
		System.out.println("hay " + contadorMayusculas + " mayusculas");
		System.out.println("hay " + contadorAscii + " caracteres especiales");

	}

	public int[] estadisticas(int cuantos, int inferior, int superior) {

		int resultado[] = new int[cuantos];
		int frecuencia[] = new int[superior - inferior + 1];
		int aleatorio;

		for (int i = 0; i < cuantos; i++) {
			aleatorio = inferior + new Random().nextInt(superior - inferior + 1);
			System.out.print(aleatorio + " ");
			resultado[i] = aleatorio;
			frecuencia[aleatorio - 1]++;
		}
		return frecuencia;
	}

	public void lisaDiasSemana() {
		Datos datos = new Datos();
		for (int i = 0; i < datos.getDiasSemana().length; i++) {
			System.out.print(datos.getDiasSemana()[i] + " ");
		}
		System.out.println("");
		for (String resultado : datos.getDiasSemana()) {
			System.out.print(resultado + " ");
		}
	}

	// *****************************************************************

	public void listaEstudiantes(Estudiante[] lista) {

		for (Estudiante estudiante : lista) {
			if (estudiante != null)
				System.out.println(estudiante);
		}

	}

	// *******************************************************************
	public int visitantesIsla(int isla, int[][] visitantesYear) {
		int acu = 0;
		for (int j = 0; j < visitantesYear[isla].length; j++) {
			acu += visitantesYear[isla][j];
		}

		return acu;
	}

	public int visitantesMes(int mes, int[][] visitantesYear) {
		int acu = 0;
		for (int i = 0; i < visitantesYear.length; i++) {
			acu += visitantesYear[i][mes];
		}

		return acu;
	}

	// ***************************ORDENACION**************************************

	public int[] mezclaArrays(int[] lista1, int[] lista2) {
		int i = 0, j = 0, k = 0;
		int[] resultado = new int[lista1.length + lista2.length];

		while (lista1[i] != Integer.MAX_VALUE || lista2[j] != Integer.MAX_VALUE) {

			if (lista1[i] < lista2[j])
				resultado[k] = lista1[i++];
			else
				resultado[k] = lista2[j++];
			k++;
			if (i == lista1.length)
				lista1[--i] = Integer.MAX_VALUE;
			if (j == lista2.length)
				lista2[--j] = Integer.MAX_VALUE;
		}

		return resultado;
	}
	// ******************************DNI************************************************

	public boolean validarDni(String dni) {

		char[] letrasDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		int numeroDni;//creamos la variable que va a contener numero dni.
		int indiceLetraDni;// creamos la variable que va a contener la letra del dni.

		if (dni.length() != 9) {//generamos el condicional para descartar los dni con longitud diferente a 9.

			return false;
		} else {

			try {    //pruebas
				String numeroString = dni.substring(0, 8);//asignamos los primeros 8 numeros de dni.
				char letra = dni.substring(8).toUpperCase().charAt(0);//asignamos a la variable letra, el valor
																	  //extraido de la ultima pocision de la 
																	  //variable dni.
								
				numeroDni = Integer.parseInt(numeroString);//asignamos a la variable numeroDni el valor, 
															//convertido mediante parseInt desde numeroString.

				indiceLetraDni = numeroDni % 23;//asignamos el resto de la division a la variable indiceLetraDni.
				 
				if (letrasDni[indiceLetraDni] == letra) {

					return true;
				} else {
					return false;
				}

			} catch (NumberFormatException e) {

				return false;
			}

		}
	}
	//*********************************************************************************
	
	//liga: obtener clasificacion a partir de resultado
	public int[] obtenerClasificacion(String[][] goles) {
		
		int[]puntos=new int[5];
		int golesLocal;
		int golesVisitantes;
		//recorrer la matriz de goles
		for (int i = 0; i<goles.length; i++){
			for (int j = 0; j<goles[i].length; j++){
			   if (goles[i][j].indexOf('-')!=-1){
				String [] resultado = goles[i][j].split("-");
				 golesLocal = Integer.parseInt(resultado [0]);
				 golesVisitantes = Integer.parseInt(resultado [1]);
				if (golesLocal<golesVisitantes)
					//suma 3 al local
					puntos[i] +=3;
				else if (golesLocal<golesVisitantes)
					//suma 3 al visitante
					puntos[j] +=3;
				else {//empate
					puntos[i] +=1;
					puntos[j] +=1;
					
				}
			}
		}
			
		}
		return puntos;
	}
//*****************************************************************************************
	
	// ORDENACION
	 	public void ordenaEnteros(int[] numeros) {
	 		for (int i = 0; i < numeros.length - 1; i++);
	
	 					
	 	}

	 	
	
	public void ordenaClasificacion(int[] numeros, String [] equipos) {
		for (int i = 0; i < numeros.length - 1; i++)
			for (int j = i + 1; j < numeros.length; j++)
				if (numeros[i] < numeros[j]) {
				int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
					String aux2 = equipos[i];
					equipos[i] = equipos[j];
					equipos[j] = aux2;
			}
		}
		
	//********************************calcular serie de fibbonacci******************
	
	
	public int[] calcularFibonacci(int cantidad) {
		int[] numerosFibonacci = new int[cantidad];//creamos un array vacio que contendra la serie fibonacci.
		numerosFibonacci[0] = 0; //le asignamos su primer valor.
		
		if (cantidad>1) {
			numerosFibonacci[1] = 1;//asignamos su segundo valor cuando la cantidad de numeros de fibonacci queremos 
									//calcular srea superior a uno.
		}
		for (int i = 2; i < numerosFibonacci.length; i++) {
				numerosFibonacci[i] = numerosFibonacci[i-2] + numerosFibonacci[i-1];//calculamos el resto de la serie
		}
		
		return numerosFibonacci;
		
	}
	
	public void  imprimeListadoNumeros(int [] numeros){
		
		 for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
		}
	}
	
	//**************************************cuentaPalabras****************************************
	
	public int cuentaPalabras(String cadena) {
		int spaceCounter = 0;
		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i)==' ') {
				
				spaceCounter++;
			}
		} 
		return spaceCounter + 1;
	}
	
	//****************************************numero maximo de una Matriz******************************
	
	public double maximoMatriz(double[][] matriz) {
		double valorMaximo = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 1; j < matriz[i].length; j++) {
				if (valorMaximo < matriz[i][j]) {
					valorMaximo = matriz[i][j];
				}
				
			}
		}
		
		return valorMaximo;
	}
	
	
	
}
	



