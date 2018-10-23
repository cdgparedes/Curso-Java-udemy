package com.test;
import com.domain.*;

public class Pruebas {
 public static void main(String args[]){
	 Rectangulo r = new Rectangulo();
      
      r.setAlto(10);
      r.setAncho(20);
      
      r.mostrarDatos();
       System.out.println("El area de unn rectangulo es : " + r.getArea());
    
       Triangulo t = new Triangulo(20,10);
       t.mostrarDatos();
       System.out.println("El area de unn triangulo  es : " + r.getArea());
       
 }
 
 
}
