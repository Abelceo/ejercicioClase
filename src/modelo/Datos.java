package modelo;

public class Datos {

	//este array se usará en la Clase Práctica
	private  String[] diasSemana = { "lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo" };
	
	private Estudiante[]estudiantes;
	
	//ejemplo de la liga
	private String[]equipo = {"RMA","BCN","VAL","SEV","UDLP"};
	private String[][] resultados = {
			{"","3-2","1-1","2-0","3-3"},//RMA LOCAL
			{"2-2","","3-1","2-1","1-2"},//BCN LOCAL
			{"1-1","1-2","","2-1","1-1"},//VAL LOCAL
			{"2-2","1-3","1-0","","3-0"},//SEV LOCAL
			{"0-0","1-2","2-1","2-3",""},//UDLP LOCAL
			
		};
		
	//Declarar propiedad private,un array de Estudiantes
	//crea getter y setter
	//en el constructor de clase Inicializar dicho array
		
	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}
	public Datos() {
		//inicializa aqui el array estudiantes
		
		estudiantes=new Estudiante[10];
		Estudiante est1 = new Estudiante(0);
		Estudiante est2 = new Estudiante(5);
		Estudiante est3 = new Estudiante(9);
		
		estudiantes[0] = est1;
		estudiantes[5] = est2;
		estudiantes[9] = est3;
				
	}
	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}
			
	public  String[] getDiasSemana() {
		return diasSemana;
	}
	public void setDiasSemana(String[] diasSemana) {
		this.diasSemana = diasSemana;
	}
	public String[] getEquipo() {
		return equipo;
	}
	public String[][] getResultados() {
		return resultados;
	}
	
}
