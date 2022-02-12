package fr.orsys.fx.travel.service.impl;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.orsys.fx.travel.business.Vol;
import fr.orsys.fx.travel.service.AeroportService;
import fr.orsys.fx.travel.service.CompagnieService;
import fr.orsys.fx.travel.service.VolService;

public class VolServiceImpl implements VolService {

	private List<Vol> vols = new ArrayList<>();
	// Un service peut faire appel à d'autres services
	private AeroportService aeroportService = new AeroportServiceImpl();
	private CompagnieService compagnieService = new CompagnieServiceImpl();
	
	@Override
	public Vol ajouterVol(long idCompagnie, long idAeroportDepart, long idAeroportArrivee, LocalTime heureDepart, LocalTime heureArrivee, float prixEnEuros) {
		Vol vol = new Vol();
		vol.setHeureDepart(heureDepart);
		vol.setHeureArrivee(heureArrivee);
		vol.setAeroportDepart(aeroportService.recupererAeroport(idAeroportDepart));
		vol.setAeroportArrivee(aeroportService.recupererAeroport(idAeroportArrivee));
		vol.setCompagnie(compagnieService.recupererCompagnie(idCompagnie));
		vol.setPrixEnEuros(prixEnEuros);
		vols.add(vol);
		return vol;
	}

	@Override
	public List<Vol> recupererVols() {
		Collections.sort(vols);
		return vols;
	}

}
