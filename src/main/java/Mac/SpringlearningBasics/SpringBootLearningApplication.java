package Mac.SpringlearningBasics;


import Mac.SpringlearningBasics.Entity.AddressEntity;
import Mac.SpringlearningBasics.Entity.TrainerCourseEntity;
import Mac.SpringlearningBasics.Entity.ProfileEntity;
import Mac.SpringlearningBasics.Entity.TrainerCourseEntity;
import Mac.SpringlearningBasics.Entity.TrainerEntity;
import Mac.SpringlearningBasics.Repo.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class SpringBootLearningApplication implements CommandLineRunner {

    @Autowired
    TrainerRepository trainerRepository;
    private static Logger logger = LoggerFactory.getLogger(SpringBootLearningApplication.class);
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootLearningApplication.class, args);
        logger.debug("Debugging Started");
        logger.info("Info Started");
        logger.warn("Warn Started");
        logger.error("Error Started");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Run method is started");
        TrainerCourseEntity courseOne = new TrainerCourseEntity("Botony", "Basic Botony Course");
        TrainerCourseEntity courseTwo = new TrainerCourseEntity("Zoology", "Basic Zoology Course");
        TrainerCourseEntity courseThree = new TrainerCourseEntity("chemistry", "Basic chemistry Course");

        List<TrainerCourseEntity> courses = Arrays.asList(courseOne, courseTwo, courseThree);

        ProfileEntity profileEntity = new ProfileEntity("Vinni151515@gmail.com", "9177041754");
        AddressEntity addressEntity = new AddressEntity(22, "puttur", "Tirupati");
        TrainerEntity trainerEntity = new TrainerEntity("malar", "Python", 3.5
                , addressEntity, profileEntity);

        for(TrainerCourseEntity course : courses) {
            course.setTrainerEntity(trainerEntity);
        }
        trainerEntity.setCourses(courses);
        trainerRepository.save(trainerEntity);
    }
}
