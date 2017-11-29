package modelo;

public class AccesoPersona {

	private int nPasos;
	
	
	public static float cuantoAvanza(int nPasos,Persona persona) {
		int distanciaRecorrida = nPasos * persona.getLongitudPaso();
		float convertirMetros = (float)distanciaRecorrida / 100;
		return convertirMetros;
	}
	
	
	
}
