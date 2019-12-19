package microservice.enseignant.dao;

import microservice.enseignant.model.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnseignantDao extends JpaRepository<Enseignant, String> {

}
