package Mac.SpringlearningBasics.Dto;

public class TrainerDto {


    private String trainerName;
    private String subject;
    private double experience;
    private AddressDto address;
    private ProfileDto profile;

    public TrainerDto() {
    }

    public TrainerDto(String trainerName, String subject, double experience, AddressDto address,ProfileDto profile) {
        this.trainerName = trainerName;
        this.subject = subject;
        this.experience = experience;
        this.address=address;
        this.profile=profile;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public ProfileDto getProfile() {
        return profile;
    }

    public void setProfile(ProfileDto profile) {
        this.profile = profile;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
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
