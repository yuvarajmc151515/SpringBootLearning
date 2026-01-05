package Mac.SpringlearningBasics.Service;

import Mac.SpringlearningBasics.Dto.AddressDto;
import Mac.SpringlearningBasics.Dto.ProfileDto;
import Mac.SpringlearningBasics.Dto.TrainerDto;
import Mac.SpringlearningBasics.Entity.AddressEntity;
import Mac.SpringlearningBasics.Entity.ProfileEntity;
import Mac.SpringlearningBasics.Entity.TrainerEntity;
import Mac.SpringlearningBasics.Repo.TrainerRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(TrainerService.class);

    @Autowired
    private TrainerRepository trainerRepository;

    public List<TrainerEntity> getAllTrainers() {
        return trainerRepository.findAll();
    }

    public TrainerEntity getTrainerById(int id) {
        return trainerRepository.findById(id).orElseThrow(() -> new RuntimeException("Trainer not found"));
    }

    public TrainerEntity createTrainerDetails(TrainerDto dto) {

        AddressDto a = dto.getAddress();

        AddressEntity addressEntity = new AddressEntity(a.getDoorNo(), a.getStreet(), a.getCity());

        ProfileDto p = dto.getProfile();

        ProfileEntity profileEntity = new ProfileEntity(p.getEmail(), p.getMobileNo());

        TrainerEntity trainerEntity = new TrainerEntity(dto.getTrainerName(), dto.getSubject(), dto.getExperience(), addressEntity, profileEntity);
        return trainerRepository.save(trainerEntity);
    }

    public TrainerEntity updateTrainer(int id, TrainerDto trainer) {
        log.debug("updating trainer details for id={}", id);
        TrainerEntity updateEntity = trainerRepository.findById(id).orElseThrow(() -> {

            log.error("update failed.Trainer  not found for id={}", id);
            return new RuntimeException("Trainer not Found with id " + id);
        });
        updateEntity.setTrainerName(trainer.getTrainerName());
        updateEntity.setSubject(trainer.getSubject());
        updateEntity.setExperience(trainer.getExperience());
        log.info("Trainer updated successfully");
        return trainerRepository.save(updateEntity);
    }

    public TrainerEntity deleteTrainer(int id) {
        log.debug("Deleting trainer with id={}", id);
        TrainerEntity deleteEntity = trainerRepository.findById(id).orElseThrow(() -> {
            log.error("Delete failed. Trainer not found for id={}", id);
            return new RuntimeException("Trainer not found with id" + id);
        });
        trainerRepository.deleteById(id);
        log.info("Trainer details deleted successfully");
        return deleteEntity;
    }

    public List<TrainerEntity> searchTrainerByName(String name) {
        return trainerRepository.findByTrainerName(name);
    }
}
