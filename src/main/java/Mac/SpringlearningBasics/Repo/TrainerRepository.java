package Mac.SpringlearningBasics.Repo;

import Mac.SpringlearningBasics.Entity.TrainerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainerRepository extends JpaRepository<TrainerEntity, Integer> {

    List<TrainerEntity> findByTrainerName(String name);
}
