package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Person {
	
	@Id
	int person_id;
	
	PersonName personName;
	String email;
	
	@OneToOne 
	Contact contact;
	
	@ManyToOne
	Address address;
	
	@OneToMany
	List<Phone> phone=new ArrayList<Phone>();
	
}
