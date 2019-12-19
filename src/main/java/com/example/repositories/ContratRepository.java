package com.example.repositories;

import com.exemple.entities.Contrat;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContratRepository extends MongoRepository<Contrat, Integer>{

}
