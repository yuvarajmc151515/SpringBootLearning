package Mac.SpringlearningBasics.Dto;

public class TrainerDto {

    private long trainerId;
    private String trainerName;
    private double experience;

    public TrainerDto() {
    }

    public TrainerDto(String trainerName, String subject, double experience) {
        this.trainerName = trainerName;
        this.experience = experience;

    }

    public long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(long trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }


    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }


    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

}
