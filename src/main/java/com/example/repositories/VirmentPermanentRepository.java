package com.example.repositories;

import com.exemple.entities.VirmentPermanent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VirmentPermanentRepository extends MongoRepository<VirmentPermanent, Integer>{

}
