package fr.orsys.fx.travel.business;

import java.io.Serializable;
import java.time.LocalTime;

public class Vol implements Serializable, Comparable<Vol> {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Aeroport aeroportDepart;
	private Aeroport aeroportArrivee;
	private LocalTime heureDepart;
	private LocalTime heureArrivee;
	private float prixEnEuros;
	private Compagnie compagnie;
	
	private static Long compteur = 0L;
	
	public Vol() {
		id = ++compteur;
	}

	public Vol(Compagnie compagnie) {
		this();
		this.compagnie = compagnie;
	}

	public Vol(Aeroport aeroportDepart, Aeroport aeroportArrivee, LocalTime dateHeureDepart, LocalTime dateHeureArrivee,
			float prixEnEuros, Compagnie compagnie) {
		this(compagnie);
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrivee = aeroportArrivee;
		this.heureDepart = dateHeureDepart;
		this.heureArrivee = dateHeureArrivee;
		this.prixEnEuros = prixEnEuros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}

	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}

	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}

	public LocalTime getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(LocalTime dateHeureDepart) {
		this.heureDepart = dateHeureDepart;
	}

	public LocalTime getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(LocalTime dateHeureArrivee) {
		this.heureArrivee = dateHeureArrivee;
	}

	public float getPrixEnEuros() {
		return prixEnEuros;
	}

	public void setPrixEnEuros(float prixEnEuros) {
		this.prixEnEuros = prixEnEuros;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	@Override
	public int compareTo(Vol autreVol) {
		return ((Float) this.getPrixEnEuros()).compareTo(autreVol.getPrixEnEuros());
	}
	
	@Override
	public String toString() {
		return "Vol [id=" + id + ", aeroportDepart=" + aeroportDepart + ", aeroportArrivee=" + aeroportArrivee
				+ ", dateHeureDepart=" + heureDepart + ", dateHeureArrivee=" + heureArrivee + ", prixEnEuros="
				+ prixEnEuros + ", compagnie=" + compagnie + "]";
	}
}
