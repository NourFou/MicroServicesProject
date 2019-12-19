package com.example.repositories;

import com.exemple.entities.Operation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OperationRepository extends MongoRepository<Operation, Integer>{

}
