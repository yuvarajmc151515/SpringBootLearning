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

    private String subject;

    @Column(name = "experience_years")
    private double experience;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", nullable = false)
    private ProfileEntity profileEntity;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trainerEntity")
    private List<TrainerCourseEntity> courses;

    public List<TrainerCourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<TrainerCourseEntity> courses) {
        this.courses = courses;
    }

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
        return trainerId;
    }

    public ProfileEntity getProfileEntity() {
        return profileEntity;
    }

    public void setProfileEntity(ProfileEntity profileEntity) {
        this.profileEntity = profileEntity;
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
