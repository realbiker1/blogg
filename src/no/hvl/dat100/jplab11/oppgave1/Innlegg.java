package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private int likes;
	private String bruker;
	private String dato;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return id;
	}

	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		
		this.likes = likes;
	}
	
	public void doLike () {
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		if (this == innlegg) {
			return true;
		}		
		return false;
	}
	
	@Override
	public String toString() {
		
		String str = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		
		return str;	
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
