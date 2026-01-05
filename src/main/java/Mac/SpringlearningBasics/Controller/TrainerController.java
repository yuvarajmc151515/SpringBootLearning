package Mac.SpringlearningBasics.Controller;

import Mac.SpringlearningBasics.Entity.AddressEntity;
import Mac.SpringlearningBasics.Entity.TrainerEntity;
import Mac.SpringlearningBasics.Dto.TrainerDto;
import Mac.SpringlearningBasics.Service.TrainerService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(TrainerController.class);

    @GetMapping("/trainer")
    public List<TrainerEntity> getAllTrainer() {
        log.info("Trainer - Fetching all trainers");
        List<TrainerEntity> trainers = trainerService.getAllTrainers();
        log.info("Total trainers found: {}", trainers.size());
        return trainers;
    }

    @GetMapping("/trainer/{id}")
    public TrainerEntity getTrainerById(@PathVariable int id) {
        log.info("Request Received", id);
        TrainerEntity trainer = trainerService.getTrainerById(id);
        log.info("Trainer is Fetched Successfully");
        return trainer;
    }

    @PostMapping("/trainer/create")
    public TrainerEntity createTrainer(@RequestBody TrainerDto trainer) {
        log.info(" Create Request Received");
        TrainerEntity savedTrainer = trainerService.createTrainerDetails(trainer);
        log.info("Trainer Created Successfully");
        return savedTrainer;
    }

    @PutMapping("/trainer/update/{id}")
    public TrainerEntity updateTrainer(@PathVariable int id, @RequestBody TrainerDto trainer) {
        log.info("Update Request Received");
        TrainerEntity updateTrainer = trainerService.updateTrainer(id, trainer);
        return updateTrainer;
    }

    @DeleteMapping("/trainer/delete/{id}")
    public TrainerEntity deleteTariner(@PathVariable int id) {
        log.info("Delete Request Received", id);
        TrainerEntity deleteEntity = trainerService.deleteTrainer(id);
        log.info("Trainer deleted Successfully");
        return deleteEntity;
    }

    @GetMapping("/trainer/search")
    public List<TrainerEntity> searchTrainer(@RequestParam String name) {
        log.info("trainer/search/{} - Search request received={}", name);
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        return trainerService.searchTrainerByName(name);
    }
}
