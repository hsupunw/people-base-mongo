package de.embl.mongo.peoplebase.repository;

import de.embl.mongo.peoplebase.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface PersonRepository extends MongoRepository<Person, String> {
}
