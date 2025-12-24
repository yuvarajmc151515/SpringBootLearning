package Mac.SpringlearningBasics.Repo;

import Mac.SpringlearningBasics.Entity.TrainerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<TrainerDetails, Integer> {

}
