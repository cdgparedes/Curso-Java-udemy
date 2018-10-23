package com.domain;

import javax.swing.JOptionPane;

public class DirectorOverload extends EmpleadoOverload{
   //utilizando polimorfismo overload
	 public void datos(String nomb, String ape ){ 
		JOptionPane.showMessageDialog(null,"Nombre : " + nomb+ "\nApellidos"+ ape);
	 }
	 
	 public void labores(String lab){
		 JOptionPane.showMessageDialog(null,"Soy director y me dedico a: " + lab );
 
	 }
	 
	 
	 
	 public void sueldo(int horas,double pagoH){
		 JOptionPane.showMessageDialog(null,"El pago es  : " +(horas*pagoH));
 
	 }

}
