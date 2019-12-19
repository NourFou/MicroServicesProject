package com.example.repositories;

import com.exemple.entities.Agence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource

public interface AgenceRepository extends MongoRepository<Agence, Integer>{

	//Agence findOne(long id);

}
