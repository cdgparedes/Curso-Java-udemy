package com.test;

import com.domain.*;

public class Principal {
  public void main(String args[]){
	
	  Animal miOso = new Animal();
	  miOso.SetRaza("Oso pardo");
	  miOso.cazar();
	  miOso.caminar();
	  miOso.comer();
	  miOso.dormir();
	  
	  System.out.println("");
	  
	  Persona persona = new Persona();
	  persona.setNumControl("111276");
	  persona.comer();
	  persona.pensar();
	  
	  System.out.println("");
	  
	  
	  hombre juan = new hombre();
	  juan.setNombre("Cesar Grajales");
	  juan.setNumControl("444444");
  }
}
