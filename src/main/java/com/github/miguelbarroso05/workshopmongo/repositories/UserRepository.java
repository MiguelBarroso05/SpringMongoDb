package com.github.miguelbarroso05.workshopmongo.repositories;

import com.github.miguelbarroso05.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
