package com.domain;
/**
 * Clae absrata que declara una figura en general
 * la cual contiene atributos como ancho y alto
 * @author Cesar
 *@version 1.1 
 **/
public abstract class Figura {
	private int ancho, alto;
	/**
	 * Este es el constructor principal e inicializa el alto y el ancho 
	 * con valores fijos
	 */
	//Constructor vacio
   public Figura(){
		this.alto = 0;
		this.ancho = 0;
	}
    
/**
 * Constructor que inicializa los parametros con los valores recibidos  como parametros
 * @param alto  este es el alto de una figura. 
 * @param ancho  este es el ancho de una figura .
 */
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
