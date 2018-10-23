package com.domain;

public abstract class Figura {
	private int ancho, alto;
	
	//Constructor vacio
   public Figura(){
		this.alto = 0;
		this.ancho = 0;
	}
   
    //Constructor con parametros 
   public Figura(int alto,int ancho){
		this.alto = 0;
		this.ancho = 0;
	}
	
   
   
   public void mostrarDatos(){
	   System.out.println("\nEl ancho capturado es : " + this.ancho);
	   System.out.println("\nEl alto  capturado es : " + this.alto);
   }
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}

	public abstract float getArea();
}
