package Mac.SpringlearningBasics.Controller;

import Mac.SpringlearningBasics.Pojo.IncomeRequest;
import Mac.SpringlearningBasics.Pojo.IncomeResponse;
import Mac.SpringlearningBasics.Service.BmiCalculatorService;
import Mac.SpringlearningBasics.Service.IncomeTaxCalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IncomeTaxController {

    private static final Logger log = LoggerFactory.getLogger(BmiCalculatorController.class);

    @Autowired
    private BmiCalculatorService calculatorService;

    @PostMapping("/income-tax")
    public IncomeResponse calculateIncomeTax(@RequestBody IncomeRequest request) {
        log.info("Income request Done ");
        double tax = IncomeTaxCalculatorService.calculateTax(request.getAnnualIncome());
        return new IncomeResponse(tax);
    }
}

