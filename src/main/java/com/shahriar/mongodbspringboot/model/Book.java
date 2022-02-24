package com.shahriar.mongodbspringboot.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("book")
public class Book {

        @Id
        private String id;

        private String title;
        private String price;
        private String currency;
        private String author_id;
        private Author author;
        
        public Book(String id, String title, String price, String currency, String author_id, Author author) {
            super();
            this.id = id;
            this.title = title;
            this.price = price;
            this.currency = currency;
            this.author_id = author_id;
            this.author = author;
        }
}