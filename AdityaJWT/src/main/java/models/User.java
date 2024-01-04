package models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Document(collection = "users")
public class User {
//id,username,email,password

	  @Id
	  private String id;

	  @NotBlank
	  private String username;

	  @NotBlank
	  @Email
	  private String email;

	  @NotBlank
	  private String password;

	  @DBRef
	  private Set<Role> roles = new HashSet<>();
	 
	   
	  
	  //constructors and getters/setters
   
		public String getId() {
			return id;
		}
	
		public User() {
			
		}
		
		public User(@NotBlank String username, @NotBlank @Email String email, @NotBlank String password) {
			super();
			this.username = username;
			this.email = email;
			this.password = password;
		}
	
		public void setId(String id) {
			this.id = id;
		}
	
		public String getUsername() {
			return username;
		}
	
		public void setUsername(String username) {
			this.username = username;
		}
	
		public String getEmail() {
			return email;
		}
	
		public void setEmail(String email) {
			this.email = email;
		}
	
		public String getPassword() {
			return password;
		}
	
		public void setPassword(String password) {
			this.password = password;
		}
	
		public Set<Role> getRoles() {
			return roles;
		}
	
		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}
		    
}
