/**
 * Aqui podemo colocar lo que queramos porque esto es para documentar
 */

package com.domain;

public class Triangulo extends Figura {
	
  public Triangulo(){
	  super();
  }
  public Triangulo(int ancho,int alto){
	  super(alto,ancho);
  }
  public float getArea(){
	  return(this.getAncho()*this.getAlto())/2;
  }
}
