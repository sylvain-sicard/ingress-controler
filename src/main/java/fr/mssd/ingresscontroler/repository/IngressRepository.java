package fr.mssd.ingresscontroler.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.mssd.ingresscontroler.model.Ingress;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface IngressRepository extends CrudRepository<Ingress, Integer> {
	
	@Query("SELECT v FROM Vintage v WHERE v.brewed = FALSE")
	Collection<Ingress> findAllVintagesNotBrewed();
	
	@Query("SELECT v FROM Vintage v WHERE v.brewed = FALSE")
	Ingress findUniqueVintageNotBrewed();

}
