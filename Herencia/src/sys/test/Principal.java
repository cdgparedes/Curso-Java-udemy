package sys.test;

import sys.domain.*;
public class Principal {
	
	public static void main(String args[]){
		 Persona.setNombreEscuela("Maria Analia Ortiz Hormaza");
		 Alumno alumnoUno = new Alumno(100,"CESAR DUBIEL",34,"M");
		 alumnoUno.muestrInfoAlummno();
		 
		 Director directorUno = new Director("1111","Julio Grajales ", 50,"Masculino" );
		 directorUno.muestrInfoDirector();
		 
		 Intendente intendenteUno = new Intendente("PATIOS","DAMARIS PAREDES",50,"MASCULINO");
         intendenteUno.muestrInfoIntendente();	
         
         Profesor profesorUno = new Profesor("1112763","Ingenieria de Sistemas ","Juan Alejandro",29,"Masculino");
         profesorUno.muestrInfoProfesor();;	
	}

}
