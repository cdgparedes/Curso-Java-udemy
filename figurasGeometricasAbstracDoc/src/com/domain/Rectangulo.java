package com.domain;
/**
 * 
 * @author Cesar
 *
 */
public class Rectangulo extends Figura {
    @Override
    /**
     * Este metodo regresa un float que  representa el 
     * area deun rectangulo
     */
	public float getArea(){
	return this.getAlto()*this.getAncho(); 
   }
	
}
