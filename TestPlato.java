package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		System.out.println("================== Plato 1: Creado ==================");
		Plato platoA= new Plato();
		System.out.println("Nombre: "+platoA.getNombre());
		System.out.println("Tipo: "+platoA.getTipo());
		System.out.println("Precio: "+platoA.getPrecio());
		System.out.println("Disponible: "+platoA.getDisponible());
		System.out.println("================== Plato 1: Modificado ==================");
		platoA.setNombre("Ensalada César");
		platoA.setTipo("Entrada");
		platoA.setPrecio(6.5); 
		platoA.setDisponible(true);
		System.out.println("Nombre: "+platoA.getNombre());
		System.out.println("Tipo: "+platoA.getTipo());
		System.out.println("Precio: "+platoA.getPrecio());
		System.out.println("Disponible: "+platoA.getDisponible());
		System.out.println("================== Plato 2: Creado ==================");
		Plato platoB= new Plato();
		System.out.println("Nombre: "+platoB.getNombre());
		System.out.println("Tipo:: "+platoB.getTipo());
		System.out.println("Precio: "+platoB.getPrecio());
		System.out.println("Disponible: "+platoB.getDisponible());
		System.out.println("================== Plato 2: Modificado ==================");
		platoB.setNombre("Pollo a la plancha");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(12.75);
		platoB.setDisponible(true);
		System.out.println("Nombre: "+platoB.getNombre());
		System.out.println("Tipo:: "+platoB.getTipo());
		System.out.println("Precio: "+platoB.getPrecio());
		System.out.println("Disponible: "+platoB.getDisponible());
		System.out.println("================== Plato 3: Creado ==================");
		Plato platoC= new Plato();
		System.out.println("Nombre: "+platoC.getNombre());
		System.out.println("Tipo: "+platoC.getTipo());
		System.out.println("Precio: "+platoC.getPrecio());
		System.out.println("Disponible: "+platoC.getDisponible());
		System.out.println("================== Plato 3: Modificado ==================");
		platoC.setNombre("Flan de caramelo"); 
		platoC.setTipo("Postre"); 
		platoC.setPrecio(4.25); 
		platoC.setDisponible(false);
		System.out.println("Nombre: "+platoC.getNombre());
		System.out.println("Tipo: "+platoC.getTipo());
		System.out.println("Precio: "+platoC.getPrecio());
		System.out.println("Disponible: "+platoC.getDisponible());

	}

}
