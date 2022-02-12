package fr.orsys.fx.travel.service;

import java.time.LocalTime;
import java.util.List;

import fr.orsys.fx.travel.business.Vol;

public interface VolService {

	Vol ajouterVol(long idCompagnie, long idAeroportDepart, long idAeroportArrivee, LocalTime heureDepart,
			LocalTime heureArrivee, float prixEnEuros);
		
	List<Vol> recupererVols();
	
}
