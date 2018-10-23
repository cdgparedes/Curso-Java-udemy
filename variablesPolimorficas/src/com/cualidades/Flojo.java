package com.cualidades;

import javax.swing.JOptionPane;

public class Flojo extends  Cualidad{
    @Override
	public void describir(){
		JOptionPane.showMessageDialog(null, "Pone pretextos para ir a trabajar ","Soy flojo ",1);
	  }
}
