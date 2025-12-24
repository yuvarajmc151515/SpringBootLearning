package Mac.SpringlearningBasics.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("css")
@Primary
public class CalculatorService implements CalciInterface {

//    public double price;

    public CalculatorService() {
    }

    public CalculatorService(int price) {
//        this.price = price;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
