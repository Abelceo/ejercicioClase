package modelo;

import java.time.LocalDate;

public class Profesor extends Persona{
	private  int codigoDepartamento;
	private LocalDate fechaIngreso;
	
	public Profesor() {
		super();
	}

	public Profesor(int codigoDepartamento,LocalDate fechaIngreso,String nif, char sexo, LocalDate fecha, Integer altura, int longitudPaso, Persona padre,
			Persona madre) {
		super(nif, sexo, fecha, altura, longitudPaso, padre, madre);
		
		this.codigoDepartamento=codigoDepartamento;
		this.fechaIngreso=fechaIngreso;
		
	}
	
	public String toString() {
		return super.toString()+" ,codigoDepartamento : " + this.codigoDepartamento;
	}
	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
		
	
	
	
	
	
	
}
