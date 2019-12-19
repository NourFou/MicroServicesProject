package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.ServiceCompte;
import com.exemple.entities.BO;
import com.exemple.entities.Compte;

@RestController
@RequestMapping(value = "/Comptes")
//@CrossOrigin
public class CompteController {
	
	@Autowired
	ServiceCompte serviceCompte;
	
	@RequestMapping(method = RequestMethod.GET, value = "/allComptes/{idAbonne}")
	public List<Compte> FindAllComptes(@PathVariable int idAbonne) {
		return serviceCompte.FindAllComptes(idAbonne);
    }

}
