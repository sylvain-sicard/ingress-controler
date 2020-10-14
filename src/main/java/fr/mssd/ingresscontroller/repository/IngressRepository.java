package fr.mssd.ingresscontroller.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import fr.mssd.ingresscontroller.model.Ingress;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface IngressRepository extends CrudRepository<Ingress, Integer> {

	Ingress findByAppCode(String appCode);
	
	Collection<Ingress> findByRouteType(String routeType);
	

}
