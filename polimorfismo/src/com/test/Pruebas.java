package com.test;
import  com.domain.*;
public class Pruebas {
public static void main (String args[]){
	DirectorOverload d1 = new DirectorOverload();
	IntendenteOverload i1 = new IntendenteOverload();
	ProfesorOverload p1 = new ProfesorOverload();
	//El codigo que está comentado es de Overload
    /*
	d1.datos("Juan", "Tinajero");
	d1.sueldo(8,300);
	d1.labores("Organizar las labores de la escuela ");
	
	i1.datos("jose", "Robles", "Calle 5");
	i1.labores("Limpiar la escuela ", "8");
	i1.sueldo(8, 100, 500);
	
	p1.datos("Cesar Grajales ");
	p1.labores("Dictar clase de Mate ");
	p1.sueldo(2000);
	*/
	
DirectorOverrride d2 = new DirectorOverrride();
IntendenteOverride i2 = new IntendenteOverride();
ProfesorOverride p2 = new ProfesorOverride();

d2.datos("Octavio del villar");
d2.labores("Es el que orgina los Docentes ");
d2.sueldo(6000);

i2.datos("javier Pérez");
i2.labores("Tener Limpia la escuela :");
i2.sueldo(3000);

p2.datos("Damaris Paredes");
p2.labores("Dictar clases de Informática");
p2.sueldo(10000);



	
}
}
