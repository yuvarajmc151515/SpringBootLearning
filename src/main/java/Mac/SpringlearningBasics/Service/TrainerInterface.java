package Mac.SpringlearningBasics.Service;

import Mac.SpringlearningBasics.Entity.TrainerEntity;
import Mac.SpringlearningBasics.Dto.TrainerDto;

import java.util.List;

public interface TrainerInterface {

    List<TrainerEntity> getAllTrainers();

    TrainerEntity getTrainerById(int id);

    String createTrainerDetails(TrainerDto trainer);

    String updateTrainer(int id, TrainerDto trainer);

    String deleteTrainer(int id);

    List<TrainerEntity> searchTrainerByName(String name);
}
