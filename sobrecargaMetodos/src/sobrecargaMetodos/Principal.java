
package sobrecargaMetodos;


public class Principal {
public static void main (String args[]){
	Alumno alumnoUno = new Alumno();
	alumnoUno.muestraInformacionAlumno();
	
	Alumno alumnoDos =  new Alumno("Jorge Robles");
	alumnoDos.muestraInformacionAlumno();
	
	//Cambio al alumno 
	alumnoUno.setDatosAlumnos("Maria  Hernandez");
	
	alumnoUno.setDatosAlumnos(95);
	alumnoUno.muestraInformacionAlumno();
	
	
}
}
