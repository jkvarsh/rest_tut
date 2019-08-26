package com.learn.mongoService.rest_tut.repositories;

import com.learn.mongoService.rest_tut.models.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PetsRepository extends MongoRepository<Pets, String> {
    Pets findBy_id(ObjectId _id);

    Pets findByname(String name);

}
