package Mac.SpringlearningBasics.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trainer_details")
public class TrainerDetails {


    @Id
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "trainer_name", nullable = false)
    private String trainerName;

    private String subject;

    @Column(name = "experience_years")
    private double experience;

    public TrainerDetails() {

    }

    public TrainerDetails(int id, String name, String subject, double experience) {
        this.empId = id;
        this.trainerName = name;
        this.subject = subject;
        this.experience = experience;
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getSubject() {
        return subject;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {

        return trainerName;
    }

    public void setName(String trainerName) {
        this.trainerName = trainerName;
    }
}
