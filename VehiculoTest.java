package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

	Vehiculo v;
	 v = new Vehiculo ();
	
	 System.out.println("=======================Vehiculo 1 : Creado======================="); 
	 
	System.out.println("Año: "+ v.getAnio());
	System.out.println("Marca: "+ v.getMarca());
	System.out.println("Modelo: "+ v.getModelo());
	
	System.out.println("=======================Vehiculo 1 : Valores asignados======================="); 
	v.setAnio("2012");
	v.setMarca("Chrevrolet");
	v.setModelo("Nuevo");
	
	System.out.println("Año: "+ v.getAnio());
	System.out.println("Marca: "+ v.getMarca());
	System.out.println("Modelo: "+ v.getModelo());
	
	System.out.println("=======================Vehiculo 2 : Creado=======================");
	
	Vehiculo v2 = new Vehiculo();
	
	System.out.println("Año: "+ v2.getAnio());
	System.out.println("Marca: "+ v2.getMarca());
	System.out.println("Modelo: "+ v2.getModelo());
	
	System.out.println("=======================Vehiculo 2 : Valores asignados======================="); 
	v2.setAnio("2026");
	v2.setMarca("Chevrolet");
	v2.setModelo("El mas rapido");
	
	System.out.println("Año: "+ v2.getAnio());
	System.out.println("Marca: "+ v2.getMarca());
	System.out.println("Modelo: "+ v2.getModelo());
	
	
	
	}

}
