package com.shahriar.mongodbspringboot.repository;

import com.shahriar.mongodbspringboot.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class BookRepositoryImpl {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     // This is not used. Keep for later maybe.
    public List<Book> findBookByTitle(String title) {
        Query query = new Query(Criteria.where("title").is(title));
        return mongoTemplate.find(query, Book.class);
    }
     */
}
