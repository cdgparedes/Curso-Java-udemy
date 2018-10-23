package com.domain;

import javax.swing.JOptionPane;

public class DirectorOverrride extends  EmpleadoOverride{

	@Override
	public void datos(String nomb) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"El nombre de un Director es  :" + nomb);
		
	}

	@Override
	public void labores(String labores) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"las labores de un director son  :" + labores);

		
	}

	@Override
	public void sueldo(double sueldo) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"El sueldo  de un Director es  :" + sueldo);

		
	}

}
