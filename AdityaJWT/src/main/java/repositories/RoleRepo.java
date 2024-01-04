package repositories;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepo extends MongoRepository<Role,String>{
	Optional<Role> findByName(String Role);

}
