package com.springframework.exercises.bootstrap;

import com.springframework.exercises.model.Author;
import com.springframework.exercises.model.Book;
import com.springframework.exercises.model.Publisher;
import com.springframework.exercises.repositories.AuthorRepository;
import com.springframework.exercises.repositories.BookRepository;
import com.springframework.exercises.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {


    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1234");
        Publisher harper = new Publisher("Harper","Collins","Tomka 12, Warszawa");
        harper.setBook(ddd);
        publisherRepository.save(harper);
        ddd.setPublisher(harper);
        ddd.getAuthors().add(eric);
        eric.getBooks().add(ddd);



        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444");
        Publisher worx = new Publisher("John", "Worx","312 Tymiana, Wyrwigory");
        worx.setBook(noEJB);
        publisherRepository.save(worx);
        noEJB.setPublisher(worx);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}
