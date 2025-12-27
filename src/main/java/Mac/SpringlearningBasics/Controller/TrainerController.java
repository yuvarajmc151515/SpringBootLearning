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
        log.info("GET /trainer - Fetching all trainers");
        List<TrainerEntity> trainers = trainerService.getAllTrainers();
        log.info("GET /trainer - Total trainers found: {}", trainers.size());
        return trainers;
    }

    @GetMapping("/trainer/{id}")
    public TrainerEntity getTrainerById(@PathVariable int id) {
        log.info("GET /trainer/{} - Request received", id);
        TrainerEntity trainer = trainerService.getTrainerById(id);
        log.info("GET/Trainer/{} - Trainer fetched Successfully", id);
        return trainer;
    }

    @PostMapping("/trainer/create")
    public String createTrainer(@RequestBody TrainerDto trainer) {
        log.info("POST/trainer/create - request received ");
        String response = trainerService.createTrainerDetails(trainer);
        return response;
    }

    @PutMapping("/trainer/update/{id}")
    public String updateTrainer(@PathVariable int id, @RequestBody TrainerDto trainer) {
        log.info("PUT/trainer/update/{}- update request received", id);
        String response = trainerService.updateTrainer(id, trainer);
        return response;
    }

    @DeleteMapping("/trainer/delete/{id}")
    public String deleteTariner(@PathVariable int id) {
        log.info("DELETE/trainer/delete/{} - Delete request received", id);
        String response = trainerService.deleteTrainer(id);
        log.info("DELETE/trainer/delete/{} - Delete successful", id);
        return response;
    }

    @GetMapping("/trainer/search")
    public List<TrainerEntity> searchTrainer(@RequestParam String name) {
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name must not be empty");
        }
        log.info("trainer/search/{} - Search request received={}",name);
        return trainerService.searchTrainerByName(name);
    }
}
