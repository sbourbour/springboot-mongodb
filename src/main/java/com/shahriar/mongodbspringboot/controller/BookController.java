package com.shahriar.mongodbspringboot.controller;

import com.shahriar.mongodbspringboot.model.Author;
import com.shahriar.mongodbspringboot.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/book")
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
}