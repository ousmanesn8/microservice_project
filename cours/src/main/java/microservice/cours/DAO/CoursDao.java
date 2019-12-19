package microservice.cours.DAO;

import microservice.cours.Model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoursDao extends JpaRepository<Cours, String> {

}
