package com.domain;

public class Persona implements AccionesGlobales,AccionesPersona {
    private  String  numControl;
    
    public void pensar(){
    	System.out.println("La persona esta pensando ...  desde la clase persona " + numControl);
    }
    
    public String getNumControl(){
    	return numControl;
    }
    
    public void setNumControl(String numControl){
    	this.numControl = numControl;
    }
	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		System.out.println("La persona está caminando con número d econtrol" + numControl);
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("La persona está comiendo");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
		
	}
	
	@Override
	public void bailar (String nombre){
		System.out.println(nombre +"Esta bailando");
	}
    @Override
    public void trabajar (String nombre, String numControl){
    	System.out.println(nombre +"Esta trabajando" + "con número de control  "+ numControl);
    }
    @Override
    public void estudiar(){
    	
    }
    
}  
