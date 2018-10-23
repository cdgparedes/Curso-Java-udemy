package com.domain;

import javax.swing.JOptionPane;

public class IntendenteOverride extends EmpleadoOverride {
	@Override
	public void datos(String nomb) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"El nombre de un Intendente  es  :" + nomb);
		
	}

	@Override
	public void labores(String labores) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"las labores de un Intendente  son  :" + labores);

		
	}

	@Override
	public void sueldo(double sueldo) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"El sueldo  de un Intendente  es  :" + sueldo);

		
	}

}
