package com.example.Services;

import java.util.List;

import com.exemple.entities.Compte;
import com.exemple.entities.Operation;
import com.exemple.entities.Releve;

public interface ServiceCompte {
	
	//public List<Compte> FindAllComptes();

	public List<Compte> FindAllComptes(int id);
	public List<Releve> ListDebitCredit(int id);

}
