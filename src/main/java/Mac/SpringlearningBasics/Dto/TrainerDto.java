package Mac.SpringlearningBasics.Dto;

public class TrainerDto {

    private String name;
    private String subject;
    private double experience;
    private AddressDto address;

    public TrainerDto() {
    }

    public TrainerDto(String name, String subject, double experience,AddressDto address) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
        this.address=address;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }



}
