package coursenseignant.coursenseignant.DAO;

import coursenseignant.coursenseignant.Beans.CoursEnseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoursEnseignantDao extends JpaRepository<CoursEnseignant, String> {

}
