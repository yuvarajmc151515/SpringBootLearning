package Mac.SpringlearningBasics.Service;

import Mac.SpringlearningBasics.Entity.TrainerDetails;
import Mac.SpringlearningBasics.Pojo.Trainer;
import Mac.SpringlearningBasics.Repo.TrainerRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(TrainerService.class);

    @Autowired
    TrainerRepository trainerRepository;

    public String createTrainerDetails(Trainer trainer) {
        TrainerDetails createEntity = new TrainerDetails(trainer.getId(), trainer.getName(), trainer.getSubject(), trainer.getExperience());
        trainerRepository.save(createEntity);
        return "Trainer saved successfully";
    }

    public String updateTrainerDetails(int id, Trainer trainer) {
        TrainerDetails updateEntity = trainerRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Trainer not Found with id " + id));
        updateEntity.setName(trainer.getName());
        updateEntity.setSubject(trainer.getSubject());
        updateEntity.setExperience(trainer.getExperience());
        trainerRepository.save(updateEntity);
        return "Trainer details updated successfully";
    }

    public String deleteTrainerDetails(int id){
        TrainerDetails deleteEntity=trainerRepository.findById(id).orElseThrow(()->
                new RuntimeException("Trainer not found with id"+id));
        trainerRepository.deleteById(id);
        return "Trainer details deleted successfully";
    }
}
