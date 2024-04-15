package it.prova.provapersona.model;

public class Persona {

	private String nome; 
	private String cognome; 
	private int eta; 
	
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta; 
	}
	
	public String getNome() {
		return nome; 
	}
	
	public String getCognome() {
		return cognome; 
	}
	
	public int getEta() {
		return eta; 
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome; 
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public boolean ePiuAnzianoDi(Persona altraPersona) {
		
		return this.eta > altraPersona.getEta();
		
	}
	
	
	
}




