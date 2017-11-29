
package modelo;

import java.time.LocalDate;
import java.util.List;

public abstract class Persona {

	private static int contador=0;
	private String nif;
	private String nombre;
	private char sexo;
	private LocalDate fecha;
	private Integer altura; 
	private int longitudPaso; // centimetros
	private Persona padre;
	private Persona madre;

	public Persona() {
		nif = "44123456k";
		nombre = "Anónimo";
		sexo = 'v';
		fecha = null;
		contador++;
	}
	
	public Persona(String nif, char sexo, LocalDate fecha, Integer altura, int longitudPaso, Persona padre,
			Persona madre) {
		this.nif = nif;
		this.sexo = sexo;
		this.fecha = fecha;
		this.altura = altura;
		this.longitudPaso = longitudPaso;
		this.padre = padre;
		this.madre = madre;
		contador++;
	}


	public static void soyEstatico() {};
	
	public float caminar (int numPasos) // cabecera , prototipo..
	{ 
		float numMetros = (numPasos * longitudPaso )/100;
		return numMetros;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Integer getAltura() {
		return altura;
	}


	public void setAltura(Integer altura) {
		this.altura = altura;
	}


	public int getLongitudPaso() {
		return longitudPaso;
	}


	public void setLongitudPaso(int longitudPaso) {
		this.longitudPaso = longitudPaso;
	}


	public Persona getPadre() {
		return padre;
	}


	public void setPadre(Persona padre) {
		this.padre = padre;
	}


	public Persona getMadre() {
		return madre;
	}


	public void setMadre(Persona madre) {
		this.madre = madre;
	}
	
	

	public static int getContador() {
		return contador;
	}

	

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", sexo=" + sexo + ", fecha=" + fecha + ", altura="
				+ altura + ", longitudPaso=" + longitudPaso + ", padre=" + padre + ", madre=" + madre + "]";
	}
	
	
	

}
