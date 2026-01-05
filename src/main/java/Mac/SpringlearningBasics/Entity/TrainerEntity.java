package Mac.SpringlearningBasics.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "trainer")
@Data
public class TrainerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "trainer_name", nullable = false)
    private String trainerName;

    private String subject;

    @Column(name = "experience_years")
    private double experience;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", nullable = false)
    private ProfileEntity profileEntity;

    @OneToMany(cascade = CascadeType.ALL,mappedBy ="")
    private List<CourseEntity> courses;

    public TrainerEntity() {
    }

    public TrainerEntity(String trainerName, String subject, double experience, AddressEntity address, ProfileEntity profileEntity) {
        this.trainerName = trainerName;
        this.subject = subject;
        this.experience = experience;
        this.address = address;
        this.profileEntity = profileEntity;
    }

    public Integer getEmpId() {
        return empId;
    }

    public ProfileEntity getProfileEntity() {
        return profileEntity;
    }

    public void setProfileEntity(ProfileEntity profileEntity) {
        this.profileEntity = profileEntity;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
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

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

}
