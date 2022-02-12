package fr.orsys.fx.travel.business;

import java.io.Serializable;

public class Aeroport implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nom;
	private static Long compteur = 0L;
	
	public Aeroport() {
		id = ++compteur;
	}

	public Aeroport(String nom) {
		this();
		this.nom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Aeroport [id=" + id + ", nom=" + nom + "]";
	}
	
}
