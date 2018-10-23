package com.domain;

public class Animal implements AccionesGlobales {
    private String raza ;
    
    public String GetRaza(){
    	return raza;
    }
    
    public void SetRaza(String raza){
    	this.raza = raza;
    }
    
    public void cazar(){
    	System.out.println("El annimal de raza Está " +raza +"Está cazando (desde ña clse animal)");
    }
	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		System.out.println("El annimal de raza Está " +raza +"Está caminando ");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("El annimal de raza Está " +raza +"Está comiendo");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

}
