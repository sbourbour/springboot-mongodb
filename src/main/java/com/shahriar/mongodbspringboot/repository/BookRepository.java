package com.shahriar.mongodbspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.shahriar.mongodbspringboot.model.Book;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    
    @Query("{title:'?0'}")
    public List<Book> findBookByTitle(String title);
    
    //@Query(value="{title:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    //List<Book> findAllByAuthor(String authorFirstName, String authorLastName);
}