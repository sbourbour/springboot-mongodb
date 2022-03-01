package com.shahriar.mongodbspringboot.controller;

import com.shahriar.mongodbspringboot.model.Author;
import com.shahriar.mongodbspringboot.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/authors")
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @PostMapping
    public ResponseEntity<Object> addAuthor(
            @RequestBody Author author)
            throws Exception {
        Author newAuthor = authorRepository.insert(author);
        return ResponseEntity.ok().body(newAuthor);
    }

    @PutMapping
    public ResponseEntity<Object> updateAuthor(
            @RequestBody Author author)
            throws Exception {
        Author updatedAuthor = authorRepository.save(author);
        return ResponseEntity.ok().body(updatedAuthor);
    }
}