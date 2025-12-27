package Mac.SpringlearningBasics;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLearningApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringBootLearningApplication.class);
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootLearningApplication.class, args);
        logger.debug("Debugging Started");
        logger.info("Info Started");
        logger.warn("Warn Started");
        logger.error("Error Started");
    }
}
