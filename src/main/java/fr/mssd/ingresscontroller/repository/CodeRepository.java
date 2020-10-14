package fr.mssd.ingresscontroller.repository;

import org.springframework.data.repository.CrudRepository;

import fr.mssd.ingresscontroller.model.Code;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CodeRepository extends CrudRepository<Code, Integer> {
	

}
