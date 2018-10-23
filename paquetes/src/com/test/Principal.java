package com.test;
 import java.util.Scanner;
import com.calses.*;

public class Principal {
  
	
	public static void main (String args[]){
		Alumno.setCoutaSemestral(500);
		Alumno alumnouno = new Alumno();
        solicitaInformacion(alumnouno);
        muestraInformacion(alumnouno);
	} 
	
	
	public static  void muestraInformacion(Alumno alumno){
		System.out.println();
		System.out.println("Nombre : "+ alumno.getNombre());
		System.out.println("edad : "+ alumno.getEdad());
		System.out.println("Calificaicon : "+ alumno.getCallificacion());
		System.out.println("Cuota semestral : "+ Alumno.getCoutaSemestral());
		System.out.println();
	}
	
	
	public static void  solicitaInformacion(Alumno alumno){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese Nombre del alumno");
		String nombre = entrada.nextLine();//tODA LA LINEA QUE EL USUARIO CAPTURA LA COMBIERT A string 
		alumno.setNombre(nombre);
		
		System.out.print("Ingrese la Edad de " + alumno.getNombre() + ":");
		int edad  = entrada.nextInt();//next int 
		alumno.setEdad(edad);
		
		System.out.print(" Ingrese Calificación de " +alumno.getNombre() + ":");
	    float cal = entrada.nextFloat();// 
		alumno.setCallificacion(cal);
		
	}
	
}
