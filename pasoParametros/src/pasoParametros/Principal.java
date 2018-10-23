package pasoParametros;

public class Principal {
	public static void main (String args[]){
      
		Calificaciones califGrupo = new Calificaciones();
		Alumno alumnouno = new Alumno(100,"Juan");
		Alumno alumnodos = new Alumno(95,"Maria");
		Alumno alumnotres = new Alumno(80,"Jorge");
		
		Alumno.cuotaSemestral = 500 ;
		
		alumnouno.muestraInformacionAlumno();
		alumnodos.muestraInformacionAlumno();
		alumnotres.muestraInformacionAlumno();
		//Alumno.muestraCoutaSemestral();
		
		
		
		//Lo que eestá comentado hace parte de otra clase 
		/*double sumaCalificaciones = califGrupo.sumaCalificacion(alumnouno);
		alumnouno.muestraInformacionAlumno();
		
		sumaCalificaciones = califGrupo.sumaCalificacion(alumnodos);
		alumnodos.muestraInformacionAlumno();
		
	    sumaCalificaciones = califGrupo.sumaCalificacion(alumnotres);
		alumnotres.muestraInformacionAlumno();
		System.out.println(" Suma de puntos del grupo  : " + sumaCalificaciones );
        double promedioGrupo =  sumaCalificaciones / 3;
        
        System.out.println(" El promedio del grupo es   " +  promedioGrupo );
	     */
	}

}
