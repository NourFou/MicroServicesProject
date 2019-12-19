package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.repositories.AbonneRepository;
import com.example.repositories.AgenceRepository;
import com.example.repositories.BORepository;
import com.example.repositories.CarteRepository;
import com.example.repositories.CompteRepository;
import com.exemple.entities.Abonne;
import com.exemple.entities.Agence;
import com.exemple.entities.BO;
import com.exemple.entities.Carte;
import com.exemple.entities.Compte;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = CarteRepository.class)


public class ServiceConsultationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsultationApplication.class, args);
	}
	@Bean 
	CommandLineRunner start(CarteRepository carteRepository,CompteRepository compteRepository,AbonneRepository aboneRepository) {
		carteRepository.deleteAll();
		compteRepository.deleteAll();
		aboneRepository.deleteAll();
		
		return args->{
			Stream.of(1,2,3).forEach(cn->{
				Abonne ab = new Abonne();
				ab.setIdAbonne(cn);
				ab.setNom("nom");
				ab.setIdBo(cn);
				//abonnes.add(ab);
				
				Abonne ab1 = new Abonne();
				ab1.setIdAbonne(cn+10);
				ab1.setNomComplet("complet"+cn);
				ab1.setIdBo(cn);
				//abonnes.add(ab1);
				
				//bo.setAbonnes(abonnes);
				Compte compte = new Compte();
				compte.setSolde(558556+cn); compte.setIdCompte(cn);
				compte.setIdAbonne(ab.getIdAbonne());
				compteRepository.save(compte);
				
				Carte carte = new Carte();
				carte.setType("CIH"+cn);
				carte.setIdCarte(cn);
				carteRepository.save(carte);
				
				
				
				
			});
			
			carteRepository.findAll().forEach(s->{
				System.out.println(s.toString());//exp Lamda
			});
			
			compteRepository.findAll().forEach(s->{
				System.out.println(s.toString());//exp Lamda
			});
			
		};
		
	
	}
}
