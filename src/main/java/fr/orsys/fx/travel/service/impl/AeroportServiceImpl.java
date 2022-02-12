package fr.orsys.fx.travel.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.orsys.fx.travel.business.Aeroport;
import fr.orsys.fx.travel.service.AeroportService;

public class AeroportServiceImpl implements AeroportService {

	private static List<Aeroport> aeroports = new ArrayList<>();

	@Override
	public Aeroport ajouterAeroport(String nom) {
		Aeroport aeroport = new Aeroport(nom);
		aeroports.add(aeroport);
		return aeroport;
	}

	@Override
	public Aeroport recupererAeroport(Long id) {
		for (Aeroport aeroport : aeroports) {
			if (aeroport.getId().equals(id)) {
				return aeroport;
			}
		}
		return null;
	}

	@Override
	public List<Aeroport> recupererAeroports() {
		return aeroports;
	}

}