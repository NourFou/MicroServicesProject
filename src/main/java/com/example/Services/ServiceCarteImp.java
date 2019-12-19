package com.example.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repositories.CarteRepository;
import com.exemple.entities.Abonne;
import com.exemple.entities.Agence;
import com.exemple.entities.Carte;

@Service
public class ServiceCarteImp  implements ServiceCarte{
	
	@Autowired
	CarteRepository carteRepository;

	@Override
	public Carte saveCarte(Carte carte) {
		// TODO Auto-generated method stub
		return carteRepository.save(carte);
	}

	@Override
	public Carte getCarte(int id) {
		// TODO Auto-generated method stub
		Optional<Carte> carte = this.carteRepository.findById(id);
		if (carte.isPresent()) {
		    return carte.get();
		} else {
		    return null;
		}
		//return carteRepository.findOne(id);
	}

	@Override
	public Carte updateCarte(Carte carte) {
		// TODO Auto-generated method stub
		return carteRepository.save(carte);
	}

	@Override
	public void deleteCarte(int id) {
		// TODO Auto-generated method stub
		carteRepository.deleteById(id);
	}

	@Override
	public List<Carte> getCartes(int id) {
		// TODO Auto-generated method stub
		return carteRepository.findByIdCompte(id);
	}

	//enable carte
	@Override
	public void activateCarte(int id) {
		// TODO Auto-generated method stub
		//Abonne abonne=carteRepository.findById(id)
		Carte carte=getCarte(id);
		carte.setActivate(true);
		carteRepository.save(carte);
		
	}
	
	//disable carte
	@Override
	public void desactivateCarte(int id) {
		// TODO Auto-generated method stub
		Carte carte=getCarte(id);
		carte.setActivate(false);
		carteRepository.save(carte);
	}

	
	

}
