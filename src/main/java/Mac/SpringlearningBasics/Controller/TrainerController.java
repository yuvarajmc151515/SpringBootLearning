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
        return trainerService.getTrainerDetails();
    }

    @GetMapping("/trainer/{id}")
    public TrainerDetails getTrainerById(@PathVariable int id) {
        return trainerService.getTrainerIdDetails(id);
    }

    @PostMapping("/trainer/create")
    public String createTrainer(@RequestBody Trainer trainer) {
        log.info("Trainer object received : " + trainer);
        return trainerService.createTrainerDetails(trainer);
    }

    @PutMapping("/trainer/update/{id}")
    public String updateTrainer(@PathVariable int id, @RequestBody Trainer trainer) {
        log.info("Trainer object is received : " + trainer);
        return trainerService.updateTrainerDetails(id, trainer);
    }

    @DeleteMapping("/trainer/delete/{id}")
    public String deleteTariner(@PathVariable int id) {
        log.info("Trainer id is received : " + id);
        return trainerService.deleteTrainerDetails(id);
    }


}
