package fr.orsys.fx.travel.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.orsys.fx.travel.business.Compagnie;
import fr.orsys.fx.travel.service.CompagnieService;

public class CompagnieServiceImpl implements CompagnieService {

	private static List<Compagnie> compagnies = new ArrayList<>();
	
	@Override
	public Compagnie ajouterCompagnie(String nom) {
		Compagnie compagnie = new Compagnie(nom);
		compagnies.add(compagnie);
		return compagnie;
	}

	@Override
	public Compagnie recupererCompagnie(Long id) {
		for (Compagnie compagnie : compagnies) {
			if (compagnie.getId().equals(id)) {
				return compagnie;
			}
		}
		return null;
	}

	@Override
	public List<Compagnie> recupererCompagnies() {
		return compagnies;
	}

}
