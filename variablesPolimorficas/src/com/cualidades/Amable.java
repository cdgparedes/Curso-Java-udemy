package com.cualidades;

import javax.swing.JOptionPane;

public class Amable  extends Cualidad{
	@Override
  public void describir(){
	JOptionPane.showMessageDialog(null, "Se porta bien con las personas ","Soy amable ",1);
  }
}
