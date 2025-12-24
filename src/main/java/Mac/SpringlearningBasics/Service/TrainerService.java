package Mac.SpringlearningBasics.Service;

import Mac.SpringlearningBasics.Entity.TrainerDetails;
import Mac.SpringlearningBasics.Pojo.Trainer;
import Mac.SpringlearningBasics.Repo.TrainerRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(TrainerService.class);

    @Autowired
    TrainerRepository trainerRepository;

    public List<TrainerDetails> getTrainerDetails() {
        log.debug("Fetching all trainer records from database");
        List<TrainerDetails> trainers = trainerRepository.findAll();
        log.debug("Fetched {} trainer records ", trainers.size());
        return trainers;
    }

    public TrainerDetails getTrainerIdDetails(int id) {
        log.debug("Fetching trainer id ={}", id);
        TrainerDetails trainer = trainerRepository.findById(id).orElseThrow(() -> new RuntimeException("Trainer not found with id " + id));
        return trainer;
    }

    public String createTrainerDetails(Trainer trainer) {
        TrainerDetails createEntity = new TrainerDetails(trainer.getId(), trainer.getName(), trainer.getSubject(), trainer.getExperience());
        log.debug("Creating trainer with id={}", trainer.getId());
        trainerRepository.save(createEntity);
        log.info("Trainer created successfully with id={}", trainer.getId());
        return "Trainer saved successfully";
    }

    public String updateTrainerDetails(int id, Trainer trainer) {
        log.debug("updating trainer details for id={}", id);
        TrainerDetails updateEntity = trainerRepository.findById(id).orElseThrow(() -> {

                    log.error("update failed.Trainer  not found for id={}", id);
                    return new RuntimeException("Trainer not Found with id " + id);
                }
        );
        updateEntity.setName(trainer.getName());
        updateEntity.setSubject(trainer.getSubject());
        updateEntity.setExperience(trainer.getExperience());
        trainerRepository.save(updateEntity);
        log.info("Trainer updated successfully id={}", id);
        return "Trainer details updated successfully";
    }

    public String deleteTrainerDetails(int id) {
        log.debug("Deleting trainer with id={}", id);
        TrainerDetails deleteEntity = trainerRepository.findById(id).orElseThrow(() -> {
            log.error("Delete failed. Trainer not found for id={}", id);
            return new RuntimeException("Trainer not found with id" + id);
        });

        trainerRepository.deleteById(id);
        return "Trainer details deleted successfully";
    }
}
