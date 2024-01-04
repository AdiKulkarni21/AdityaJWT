package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Role {
  @Id
  private String id;
  private RoleName name;

  
//constructor and getters and setters
   public Role(RoleName name) {
		super();
		this.name = name;
	}


	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public RoleName getName() {
		return name;
	}
	
	
	public void setName(RoleName name) {
		this.name = name;
	}
	  
  
}
