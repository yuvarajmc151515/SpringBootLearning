package Mac.SpringlearningBasics.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "trainer")
public class TrainerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trainer_id")
    private Integer trainerId;

    @Column(name = "trainer_name", nullable = false)
    private String trainerName;


    @Column(name = "experience_years")
    private double experience;



    public TrainerEntity() {

    }

    public TrainerEntity(String trainerName, double experience) {
        this.trainerName = trainerName;
        this.experience = experience;

    }

    public Integer getEmpId() {
        return trainerId;
    }

    public void setEmpId(Integer trainerId) {
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
