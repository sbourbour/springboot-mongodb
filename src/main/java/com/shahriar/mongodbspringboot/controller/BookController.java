package com.shahriar.mongodbspringboot.controller;

import com.shahriar.mongodbspringboot.model.Author;
import com.shahriar.mongodbspringboot.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shahriar.mongodbspringboot.model.Book;
import com.shahriar.mongodbspringboot.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping
    public List<Book> findBookByTitle(@RequestParam("title") String title) {
        List<Book> bookList = bookRepository.findBookByTitle(title);

        if(bookList != null) {
            for(Book book : bookList) {
                Author author = authorRepository.findAuthorById(book.getAuthor_id());
                book.setAuthor(author);
            }
        }
        return bookList;
    }

    @PostMapping
    public ResponseEntity<Object> addBook(
            @RequestBody Book book)
            throws Exception {
        Book newBook = bookRepository.insert(book);
        return ResponseEntity.ok().body(newBook);
    }

    @PutMapping
    public ResponseEntity<Object> updateBook(
            @RequestBody Book book)
            throws Exception {
        Book updatedBook = bookRepository.save(book);
        return ResponseEntity.ok().body(updatedBook);
    }
}