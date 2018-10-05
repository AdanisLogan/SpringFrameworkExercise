package com.springframework.exercises.repositories;

import com.springframework.exercises.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
