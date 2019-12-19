package com.example.repositories;

//import com.exemple.entities.Agence;
import com.exemple.entities.BO;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BORepository extends MongoRepository<BO, Integer>{
	List<BO> findByIdAgence(int idAgence);
}
