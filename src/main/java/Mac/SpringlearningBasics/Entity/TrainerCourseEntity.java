package Mac.SpringlearningBasics.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "trainer_course")
 public class TrainerCourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String courseName;
    private String description;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private TrainerEntity trainerEntity;

    public TrainerCourseEntity(){

    }
    public TrainerCourseEntity(String courseName, String description) {
        this.courseName = courseName;
        this.description = description;
    }



    public TrainerEntity getTrainerEntity() {
        return trainerEntity;
    }

    public void setTrainerEntity(TrainerEntity trainerEntity) {
        this.trainerEntity = trainerEntity;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCourseId() {
        return id;
    }

    public void setCourseId(Long id) {
        this.id = id;
    }
}
