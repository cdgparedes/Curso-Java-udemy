package com.calses;

public class Alumno {
 
	private double  callificacion ;
	private  String nombre ;
	private int edad ;
	private static double coutaSemestral;
	public double getCallificacion() {
		return callificacion;
	}
	public void setCallificacion(double callificacion) {
		this.callificacion = callificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public static double getCoutaSemestral() {
		return coutaSemestral;
	}
	public static void setCoutaSemestral(double coutaSemestral) {
		Alumno.coutaSemestral = coutaSemestral;
	}
	
	
}
