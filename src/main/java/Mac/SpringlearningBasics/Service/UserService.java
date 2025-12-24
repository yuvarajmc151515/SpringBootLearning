package Mac.SpringlearningBasics.Service;

import Mac.SpringlearningBasics.Pojo.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse checkEligibility(String name, Integer age) {
        String msg;
        if (age >= 18) {
            msg = "Eligible for Voting";
        } else {
            msg = "Not Eligible for Voting";
        }
        return new UserResponse(name, age, msg);
    }
}
