package modelo;

import java.time.LocalDate;

public class Estudiante extends Persona{

	private int codigoGrupo;
	
	

	public Estudiante(int codigoGrupo) {
		super();
		this.codigoGrupo = codigoGrupo;
	}

	public Estudiante (int codigoGrupo, String nif, char sexo, LocalDate fecha, Integer altura, int longitudPaso, Persona padre,
			Persona madre) {
		super( nif,  sexo,  fecha,  altura,  longitudPaso,  padre, madre);
		this.codigoGrupo = codigoGrupo;
	}
	public String toString() {
		return super.toString()+" ,codGrupo : " + this.codigoGrupo;
	}
	
	public int getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
	
	
}
