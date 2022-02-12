package fr.orsys.fx.travel.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Compagnie implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nom;
	private List<Vol> vols = new ArrayList<>();

	private static Long compteur = 0L;
	
	public Compagnie() {
		id = ++compteur;
	}
	
	public Compagnie(String nom) {
		this();
		this.nom = nom;
	}

	public Compagnie(String nom, List<Vol> vols) {
		this(nom);
		this.vols = vols;
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

	public List<Vol> getVols() {
		return vols;
	}

	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}

	@Override
	public String toString() {
		return "Compagnie [id=" + id + ", nom=" + nom + "]";
	}

}
