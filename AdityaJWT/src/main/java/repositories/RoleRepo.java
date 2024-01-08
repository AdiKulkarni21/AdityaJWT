package repositories;

import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;

import models.Role;
import models.RoleName;

public interface RoleRepo extends MongoRepository<Role,String>{
	Optional<Role> findByName(RoleName name);

}
