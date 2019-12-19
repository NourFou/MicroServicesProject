package com.example.Services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.repositories.CompteRepository;
import com.example.repositories.OperationRepository;
import com.exemple.entities.Compte;
import com.exemple.entities.Operation;
import com.exemple.entities.Releve;

@Service
public class ServiceCompteImp  implements ServiceCompte{
	
	@Autowired
	CompteRepository compteRepository;
	@Autowired
	OperationRepository operationRepository;
	@Override
	public List<Compte> FindAllComptes(int id) {
		// TODO Auto-generated method stub
		return compteRepository.findAllByIdAbonne(id);
	}

	@Override
	public List<Releve> ListDebitCredit(int id) {
		//List<Operation> debit=compteRepository.findById(id);
		List<Operation>debitcredit=operationRepository.findAll();
		List<Releve>debit =new ArrayList<Releve>();
		List<Releve>credit = new ArrayList<Releve>();
		List<Releve>AllRelevies = new ArrayList<Releve>();
		for (Operation operation : debitcredit) {
			if(operation.getIdCompteSrc()==id)
			{
				Releve re=new Releve(operation, "debit");
				debit.add(re);
			}
			if(operation.getIdCompteBeneficiaire()==id)
			{
				Releve re=new Releve(operation, "credit");
				credit.add(re);
			}
			AllRelevies.addAll(debit);
			AllRelevies.addAll(credit);
			
			
		}
		
		return AllRelevies;
	}

}
