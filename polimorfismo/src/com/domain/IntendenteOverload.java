package com.domain;

import javax.swing.JOptionPane;

public class IntendenteOverload  {
	 public void datos(String nomb, String ape,String direccion ){ 
			JOptionPane.showMessageDialog(null,"Nombre : " + nomb+ "\nApellidos:" + ape +"\nDireccion :" + direccion);
		 }
		 
		 public void labores(String lab,String horas){
			 JOptionPane.showMessageDialog(null,"Soy Intendente y me dedico a: " + lab + "\nY trabajo : "+ horas);
	 
		 }
		 
		 
		 
		 public void sueldo(int horas,double pagoH,double incentivo){
			 JOptionPane.showMessageDialog(null,"El pago es  : " +(horas*pagoH)+"\nY un icentivo : " + incentivo );
	 
		 }
}
