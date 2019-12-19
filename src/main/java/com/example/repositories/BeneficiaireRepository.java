package com.example.repositories;

import com.exemple.entities.Beneficiaire;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeneficiaireRepository extends MongoRepository<Beneficiaire, Integer> {

}
