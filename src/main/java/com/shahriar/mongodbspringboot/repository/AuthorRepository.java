package com.shahriar.mongodbspringboot.repository;

import com.shahriar.mongodbspringboot.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AuthorRepository extends MongoRepository<Author, String> {
    @Query("{id:'?0'}")
    Author findAuthorById(String authorId);
}
