package com.example.repositories;

import java.util.List;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.exemple.entities.Abonne;

@RepositoryRestResource
public interface AbonneRepository extends MongoRepository<Abonne, Integer>{
	List<Abonne> findByIdBo(int idBo);
	

}
