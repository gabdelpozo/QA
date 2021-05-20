package Principal;

import Persona.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Persona miPersona = new Persona("Pepe", "Pepito", 1234, 55, 1.70, 80,"Parado");
		System.out.println(miPersona.getPersona());
		
		
	}

}