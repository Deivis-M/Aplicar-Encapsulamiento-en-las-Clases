package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		System.out.println("==========Restaurante 1 : Creado ==========");
		Restaurante rest1 = new Restaurante();
		System.out.println("Nombre: "+rest1.getNombre());
		System.out.println("Direccion: "+rest1.getDireccion());
		System.out.println("Calificacion: "+rest1.getCalificacion());
		
		System.out.println("==========Restaurante 1 : Modificado ==========");
		rest1.setNombre("La esquina");
		rest1.setDireccion("Av . Amazonas 245");
		rest1.setCalificacion(4.7f); 
		System.out.println("Nombre: "+rest1.getNombre());
		System.out.println("Direccion: "+rest1.getDireccion());
		System.out.println("Calificacion: "+rest1.getCalificacion());
		
		System.out.println("==========Restaurante 2 : Creado ==========");
		Restaurante rest2 = new Restaurante();
		System.out.println("Nombre: "+rest2.getNombre() );
		System.out.println("Direccion: "+rest2.getDireccion());
		System.out.println("Calificacion: "+rest2.getCalificacion());
		
		System.out.println("==========Restaurante 2 : Modificado ==========");
		rest2.setNombre("Sabor Andino");
		rest2.setDireccion("Calle Sucre 110");
		rest2.setCalificacion(4.2f);
		System.out.println("Nombre: "+rest2.getNombre());
		System.out.println("Direccion: "+rest2.getDireccion());
		System.out.println("Calificacion: "+rest2.getCalificacion());
		
	}

}
