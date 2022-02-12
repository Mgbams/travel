package fr.orsys.fx.travel.service;

import java.util.List;

import fr.orsys.fx.travel.business.Compagnie;

public interface CompagnieService {

	Compagnie ajouterCompagnie(String nom);
	
	Compagnie recupererCompagnie(Long id);
	List<Compagnie> recupererCompagnies();
	
}
