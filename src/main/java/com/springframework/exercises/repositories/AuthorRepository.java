package com.springframework.exercises.repositories;

import com.springframework.exercises.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
