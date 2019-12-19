package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repositories.CompteRepository;
import com.exemple.entities.Compte;

@Service
public class ServiceCompteImp  implements ServiceCompte{
	
	@Autowired
	CompteRepository compteRepository;

	@Override
	public List<Compte> FindAllComptes(int id) {
		// TODO Auto-generated method stub
		return compteRepository.findAllByIdAbonne(id);
	}

}
