package componentes;

import java.util.ArrayList;

public class PersonaHijos {
	
	private String nombre;
	private String apellidos1;
	private String apellidos2;
	
	private PersonaHijos padre;
	private ArrayList<PersonaHijos> hijos;
	/**
	 * @param nombre
	 * @param apellidos1
	 * @param apellidos2
	 * @param padre
	 * @param hijos
	 */
	
	public PersonaHijos(String nombre, String apellidos1, String apellidos2) {
		this.nombre = nombre;
		this.apellidos1 = apellidos1;
		this.apellidos2 = apellidos2;
		this.padre = null;
		this.hijos = new ArrayList<PersonaHijos>();
	}
	
	public void setPadre(PersonaHijos padre){
		this.padre = padre;
	}
	
	public void addHijos(PersonaHijos hijo){
		hijos.add(hijo);
		hijo.setPadre(this);
	}
	
	
	public PersonaHijos getHijo(int i){
		return hijos.get(i);
	}
	
	public int numHijos(){
		return hijos.size();
	}
	
	
	public boolean tieneHijos(){
		return !hijos.isEmpty();
	}
	
	public String toString(){
		return nombre+" "+apellidos1+" "+apellidos2;
	}
	
	public void pintaArbol(){
		if (!this.tieneHijos())
			System.out.println(this);
		else{
			System.out.println(this);
		for (PersonaHijos personaHijos : hijos) {
			personaHijos.pintaArbol();
		}
		}
			
	}
}
