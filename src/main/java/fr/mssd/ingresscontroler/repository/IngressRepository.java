package fr.mssd.ingresscontroler.repository;

import org.springframework.data.repository.CrudRepository;

import fr.mssd.ingresscontroler.model.Ingress;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface IngressRepository extends CrudRepository<Ingress, Integer> {
	

}
