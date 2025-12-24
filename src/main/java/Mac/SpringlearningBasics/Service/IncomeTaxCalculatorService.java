package Mac.SpringlearningBasics.Service;

import org.springframework.stereotype.Service;


@Service
public class IncomeTaxCalculatorService {

    public static double calculateTax(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return income * 0.05;
        } else {
            return income * 0.10;
        }
    }
}

