package Mac.SpringlearningBasics.Controller;

import Mac.SpringlearningBasics.Entity.TrainerDetails;
import Mac.SpringlearningBasics.Pojo.Trainer;
import Mac.SpringlearningBasics.Service.TrainerService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(TrainerController.class);

    @GetMapping("/trainer")
    public List<TrainerDetails> getAllTrainer() {
        log.info("GET /trainer - Fetching all trainers");
        List<TrainerDetails> trainers = trainerService.getTrainerDetails();
        log.info("GET /trainer - Total trainers found: {}\", trainers.size()");
        return trainers;
    }

    @GetMapping("/trainer/{id}")
    public TrainerDetails getTrainerById(@PathVariable int id) {
        log.info("GET /trainer/{} - Request received", id);
        TrainerDetails trainer = trainerService.getTrainerIdDetails(id);
        log.info("GET/Trainer/{} - Trainer fetched Successfully", id);
        return trainer;
    }

    @PostMapping("/trainer/create")
    public String createTrainer(@RequestBody Trainer trainer) {
        log.info("POST/trainer/create - request received for id={}", trainer.getId());
        String response = trainerService.createTrainerDetails(trainer);
        log.info("POST/trainer/create - Trainer created successfully with id ={}", trainer.getId());
        return response;
    }

    @PutMapping("/trainer/update/{id}")
    public String updateTrainer(@PathVariable int id, @RequestBody Trainer trainer) {
        log.info("PUT/trainer/update/{}- update request received", id);
        String response = trainerService.updateTrainerDetails(id, trainer);
        return response;
    }

    @DeleteMapping("/trainer/delete/{id}")
    public String deleteTariner(@PathVariable int id) {
        log.info("DELETE/trainer/delete/{} - Delete request received", id);
        String response = trainerService.deleteTrainerDetails(id);
        log.info("DELETE/trainer/delete/{} - Delete successful", id);
        return response;
    }
}
