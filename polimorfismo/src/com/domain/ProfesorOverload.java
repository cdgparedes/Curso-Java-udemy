package com.domain;

import javax.swing.JOptionPane;

public class ProfesorOverload {
	 public void datos(String nomb ){ 
			JOptionPane.showMessageDialog(null,"Nombre : " + nomb);
		 }
		 
		 public void labores(String lab){
			 JOptionPane.showMessageDialog(null,"Soy Profesor y me dedico a: " + lab );
	 
		 }
		 
		 
		 
		 public void sueldo(double pagoH){
			 JOptionPane.showMessageDialog(null,"El pago es  : " +pagoH);
	 
		 }
}
