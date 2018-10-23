package com.cualidades;

import javax.swing.JOptionPane;

public class Disciplinado extends Cualidad {
	@Override
	public void describir(){
		JOptionPane.showMessageDialog(null, "Se levanta a las 5 :00 ","Soy Disciplinado ",1);
	  }
}
