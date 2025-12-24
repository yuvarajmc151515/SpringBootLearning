package Mac.SpringlearningBasics.Controller;

import Mac.SpringlearningBasics.Pojo.UserResponse;
import Mac.SpringlearningBasics.Service.UserService;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping("/check/{name}/{age}")
    public UserResponse checkUser(@PathVariable String name, @PathVariable int age) {
        log.info("Received request via PathVariable | name={}, age={}", name, age);
        return userService.checkEligibility(name, age);
    }

    @GetMapping("/check/param")
    public UserResponse checkByParam(@RequestParam String name,@RequestParam int age){
        log.info("Received request via RequestParam | name={},age={}",name,age);
        return userService.checkEligibility(name,age);
    }
}
