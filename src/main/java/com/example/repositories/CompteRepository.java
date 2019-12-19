package com.example.repositories;

import com.exemple.entities.Compte;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompteRepository extends MongoRepository<Compte, Integer>{

	List<Compte> findAllByIdAbonne(int id);

}
