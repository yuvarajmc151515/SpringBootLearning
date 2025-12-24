package Mac.SpringlearningBasics.Pojo;

public class UserResponse {

    private String name;
    private Integer age;
    private String message;

    public UserResponse(String name, Integer age, String message) {
        this.name = name;
        this.age = age;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getMessage() {
        return message;
    }
}
