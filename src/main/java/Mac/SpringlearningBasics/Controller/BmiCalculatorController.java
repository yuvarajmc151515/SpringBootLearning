package Mac.SpringlearningBasics.Controller;


import Mac.SpringlearningBasics.Pojo.BmiRequest;
import Mac.SpringlearningBasics.Pojo.BmiResponse;
import Mac.SpringlearningBasics.Service.BmiCalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BmiCalculatorController {

    private static final Logger log = LoggerFactory.getLogger(BmiCalculatorController.class);

    @Autowired
    private BmiCalculatorService bmiCalculatorService;

    @PostMapping("/bmi")
    public BmiResponse calculateBmi(@RequestBody BmiRequest request) {
        log.info("bmi request done");
        return bmiCalculatorService.calculateBmi(request.getWeight(), request.getHeight());
    }
}

