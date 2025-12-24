package Mac.SpringlearningBasics.Service;


import Mac.SpringlearningBasics.Pojo.BmiResponse;
import org.springframework.stereotype.Service;

@Service
public class BmiCalculatorService {

    public BmiResponse calculateBmi(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String category;

        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal";
        } else {
            category = "Overweight";
        }

        return new BmiResponse(bmi, category);
    }
}

