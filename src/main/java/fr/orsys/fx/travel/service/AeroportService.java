package fr.orsys.fx.travel.service;

import java.util.List;

import fr.orsys.fx.travel.business.Aeroport;

public interface AeroportService {

	Aeroport ajouterAeroport(String aeroport);
	
	Aeroport recupererAeroport(Long id);
	List<Aeroport> recupererAeroports();
	
}
