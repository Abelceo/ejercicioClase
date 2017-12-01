package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import auxiliar.Practicas;
import modelo.AccesoPersona;
import modelo.Datos;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

public class Principal {

	public static void main(String[] args) {
	
		Practicas mostrar=new Practicas();
		mostrar.muestraNumero();
		mostrar.muestraNumero(80,20);
		mostrar.muestraNumero2(30,70);
		mostrar.muestraNumero3(40,70);
		mostrar.generaAleatorios(10,1,6);
		System.out.println(mostrar.metodo(341));
		/*
		Estudiante est1;
		est1 = new Estudiante(12);
		est1.setNombre("Estudiante1");
		
		System.out.println("Nombre: " + est1.getNombre() + " - Código: " + est1.getCodigoGrupo());

	/*	Persona pedro;
	//	pedro = new Persona();
	//-----------------esto es para generar un objeto----------------------//	
		pedro.setNombre("Maruja");
		System.out.println("Persona Creada");
		System.out.println("Nombre: " + pedro.getNombre());
		System.out.println("NIF: " + pedro.getNif());
		System.out.println("Sexo: " + pedro.getSexo());
		System.out.println("Fecha de entrada: " + pedro.getFecha());
		System.out.println("---------------------");
		
		Persona juan = new Persona("43587659J",'v', LocalDate.of(2017, 10, 02), new Integer(123),90,new Persona(),new Persona());
		System.out.println("Nombren: "+ juan.getNombre());
		System.out.println("NIF: "+ juan.getNif());
		System.out.println("Sexo: "+ juan.getSexo());
		System.out.println("Fecha: "+ juan.getFecha());
		System.out.println("Altura: "+ juan.getAltura());
		juan.setFecha(LocalDate.now());
		System.out.println("Fecha: " + juan.getFecha());
		juan.setLongitudPaso(90);
		juan.setNombre("Juan");
		System.out.println(juan.getNombre() + " ha caminado " + AccesoPersona.cuantoAvanza(231, juan) + " metros.");*/
		
		/*Estudiante estudianteNuevo = new Estudiante(7,"42744844K",'M',LocalDate.of(2017, 10, 9),new Integer(165),95,null,null);
		Estudiante estudiante1 = new Estudiante(7,"42744844K",'M',LocalDate.of(2017, 10, 9),new Integer(165),95,null,null);
		System.out.println(estudianteNuevo.toString());
		
		
		Profesor mauricio= new Profesor();
		System.out.println(mauricio.toString());
		System.out.println("contador= "+Persona.getContador());
		
		
		*/
		mostrar.estadisticaCadena("Abel");
		
		int listaFrecuencia[];
		listaFrecuencia= new Practicas().estadisticas(10, 1, 6);
		int contador=0;
		for (int k=0;k<listaFrecuencia.length;k++)
		{
			
			System.out.println("");
			System.out.print("Frecuencia " + (k+1) + " : " + listaFrecuencia[k]);
			contador += listaFrecuencia[k];
		}
		System.out.println("\n contador: "+contador);
		
		
		
		Practicas practicas = new Practicas();
		practicas.lisaDiasSemana();
		System.out.println("\n");
		
		Datos miDato = new Datos();
		
			for (int i = 0; i < miDato.getEstudiantes().length; i++) {
				if(miDato.getEstudiantes()[i] != null)
					System.out.println(miDato.getEstudiantes()[i]);
			}
			
		//********************************************************//
			
			//System.out.println("----------------------------------------------------------------");
			
		//practicas.listaEstudiantes(miDato.getEstudiantes());
			
			
			//int listaEstudiantes;
			//for (int i = 0; i < listaEstudiantes; i++) {
			//		System.out.println(listaEstudiantes);
			//	int Estudiante;
			//(int j = 0; j< Estudiante; j++) {
			//		System.out.println(Estudiante);
			//	}
			//}
			
		//*********************************************************//	
			
			
			
		int[][] visitantesYear= {
				{1,2,3,4,5,6,7,8,9,10,11,12},
				{1,2,3,4,5,6,7,8,9,10,11,12},
				{1,2,3,4,5,6,7,8,9,10,11,12},
				{1,2,3,4,5,6,7,8,9,10,11,12},
				{1,2,3,4,5,6,7,8,9,10,11,12},
				{1,2,3,4,5,6,7,8,9,10,11,12},
				{1,2,3,4,5,6,7,8,9,10,11,12}
		};
		
		System.out.println(mostrar.visitantesIsla(0, visitantesYear));
		System.out.println(mostrar.visitantesMes(1, visitantesYear));
			
		
		//*******************************************************************//
		System.out.println("----------------------");	
		int[] array1 = {3,6,9,15,29};
		int[] array2 = {1,2,9,25,39,56,67,99};
		int[] arrayMezclado = practicas.mezclaArrays(array1, array2);
		
		for (int i = 0; i < arrayMezclado.length; i++) {
			System.out.println(arrayMezclado[i]);
		}
		
		//***************************Validar DNI*******************************
		
		String dni = "42844007k";//asignamos un string a la variable dni.
		
		System.out.println(dni.substring(0,8));
		
		System.out.println(Integer.parseInt("12345678"));
		
		System.out.println(practicas.validarDni(dni));
		
		
		//************************LIGA******************************************
		
		// liga
				String[][] goles = new Datos().getResultados();

				int[] clasificacion = practicas.obtenerClasificacion(goles);
				String[] equipo = new Datos().getEquipo();
				practicas.ordenaClasificacion(clasificacion, equipo);
				for (int i = 0; i < equipo.length; i++) {
					System.out.println(equipo[i] + " \t" + clasificacion[i]);
				}
		
		//*******************************Fibonacci*************************************
		
	//	practicas.imprimeListadoNumeros(practicas.calcularFibonacci(1));
				
		
		//*****************************contar Palabras*******************************
				
				
			System.out.println(practicas.cuentaPalabras("hola mundo nuevo"));
				
		//***************************valor maximo de matriz************************
			
		double [][] prueba = {{1.0},{1,4,1.4}};
		System.out.println(practicas.maximoMatriz(prueba));
		
		
		//**************************invertir cadena******************************
		
		
		
		System.out.println(practicas.invierteCadena("ordnajela"));
				
		//***************escribir codigo encima de esta puñetera linea**************
		}	
	}
