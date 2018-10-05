package com.springframework.exercises.repositories;

import com.springframework.exercises.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
