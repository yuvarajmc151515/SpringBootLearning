package Mac.SpringlearningBasics.Controller;

import Mac.SpringlearningBasics.Pojo.Trainer;
import Mac.SpringlearningBasics.Service.CalciInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/main")
public class MainController {
    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    @Autowired
    @Qualifier("cs1")
    private CalciInterface cs;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/welcome")
    public String welcome() {
        log.info("Welcome API is called");
        return "WELCOME TO SPRING BOOT APPLICATION";
    }

    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        log.debug("Add inputs -> a={},b={}", a, b);
        int result = cs.add(a, b);
        log.info("Add Opearation is done Succesfully");
        return "The sum of digits is :" + result;
    }

    @GetMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {
        log.info("Sub method is invoked");
        return "The subtraction of two digits is :" + (a - b);
    }

    @GetMapping("/mul/{a}/{b}")
    public String mul(@PathVariable int a, @PathVariable int b) {
        log.info("mul Operation is done Succesfully");
        return "The Multilication of two digits is :" + (a * b);
    }

    @GetMapping("/div/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b) {
        if (b == 0) {
            log.warn("Invalid Division  Attempted b=0");
            return "Division by Zero is not allowed";
        }
        log.info("Div Operation is done Succesfully");
        return "Division of two numbers is :" + (a / b);
    }

    @GetMapping("/mod/{a}/{b}")
    public String mod(@PathVariable int a, @PathVariable int b) {
        log.info("Mod Operation is done Succesfully");
        return "The Modulus of digts is :" + (a % b);
    }

    @GetMapping("/upper/{name}")
    public String convertIntoUpperCase(@PathVariable String name) {
        log.debug("Received name:{}", name);
        return name.toUpperCase();
    }

    @GetMapping("/length/{name}")
    public int length(@PathVariable String name) {
        log.info("Received name :{}", name);
        return name.length();
    }

    @GetMapping("/palindrome/{number}")
    public String palindrome(@PathVariable int number) {
        log.debug("received number:{}" + number);
        int original = number;
        int reverse = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number = number / 10;
        }
        if (original == reverse) {
            log.info("{} is a palindrome " + original);
            return reverse + " is a palindrome number";
        } else {
            log.info("{} is not palindrome number");
            return reverse + " is not a palindrome number";
        }
    }


}
