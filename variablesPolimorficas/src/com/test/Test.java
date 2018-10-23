package com.test;
import com.cualidades.*;
public class Test {
   public static void main(String args[]){
	   Amable amable = new Amable();
	   Disciplinado disciplinado = new Disciplinado();
	   Flojo flojo = new Flojo();
	   Puntual puntual  = new Puntual();
	   // Creando una variable polimorfica
	   Cualidad objetoCualidad[] = new Cualidad[4];// Aqui estoy creando un arreglo de tipo cualidad
       objetoCualidad[0] = amable;
       objetoCualidad[1] = disciplinado;
       objetoCualidad[2] = flojo;
       objetoCualidad[3] = puntual;
       
        //poniendo a trabajar a mi variable polimorfica 
       objetoCualidad[0].describir();
       objetoCualidad[1].describir();
       objetoCualidad[2].describir();
       objetoCualidad[3].describir();
     
   }   
   
}
