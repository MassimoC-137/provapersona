package it.prova.provapersona.test;

import it.prova.provapersona.model.Persona;

public class TestPersona {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Mickey", "Mouse", 94); 
		Persona persona2 = new Persona("Donald", "Duck", 82);
		Persona persona3 = new Persona("Walt", "Disney", 123);
		
//		System.out.println(persona3.getEta()+" "+persona3.getNome());
		
		System.out.println(persona1.ePiuAnzianoDi(persona3));
		
		if(persona1.ePiuAnzianoDi(persona3)) {
			System.out.println(persona1.getNome()+" E'più anziano di " + persona3.getNome()); 
		}else {
			System.out.println(persona1.getNome()+" E'più giovane di " + persona3.getNome()); 
		}
	}

}
