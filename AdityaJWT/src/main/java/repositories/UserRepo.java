package repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.User;

public interface UserRepo extends MongoRepository<User,String>{

	Optional<User> findByUsername(String Username);
	Boolean existsByUsername(String Username);
	Boolean existsByEmail(String Email);
	
}
