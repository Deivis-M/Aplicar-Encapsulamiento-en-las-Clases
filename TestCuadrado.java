package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		c1.setLado(5);
		double area1;
		double perimetro1;
		area1= c1.calcularArea();
		perimetro1=c1.calcularPerimetro();
		System.out.println("Resultado Cuadrado 1 (Area): "+ area1);
		System.out.println("Resultado Cuadrado 1 (Perimetro): "+ perimetro1);
		
		Cuadrado c2 = new Cuadrado();
		c2.setLado(7); 
		double area2 ;
		double perimetro2;
		area2=c2.calcularArea();
		perimetro2=c2.calcularPerimetro();
		System.out.println("Resultado Cuadrado 2 (Area): "+ area2);
		System.out.println("Resultado Cuadrado 2 (Perimetro): "+ perimetro2);
	
		Cuadrado c3 = new Cuadrado ();
		c3.setLado(2); 
		double area3;
		double perimetro3;
		area3= c3.calcularArea();
		perimetro3=c3.calcularPerimetro();
		System.out.println("Resultado Cuadrado 3 (Area): "+ area3);
		System.out.println("Resultado Cuadrado 3 (Perimetro): "+ perimetro3);
		
	}

}
