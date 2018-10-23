package pasoParametros;

public class Calificaciones {

	public double totalCalificaciones = 0.0;
    
	public  double sumaCalificacion(Alumno a ){
		totalCalificaciones = totalCalificaciones + a.calificacion;
		
		return totalCalificaciones;
	}
}
