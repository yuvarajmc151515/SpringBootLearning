package Mac.SpringlearningBasics.Configurations;

import Mac.SpringlearningBasics.Controller.MainController;
import Mac.SpringlearningBasics.Service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    private static final Logger log = LoggerFactory.getLogger(Config.class);

    @Bean
    public RestTemplate createNewRestTemplate() {
        log.info("Rest Template object creation started");
        return new RestTemplate();
    }

    @Bean("cs1")
    public CalculatorService createNewCal() {
        log.info("Configuration Class calculatorService is working");
        return new CalculatorService(500);
    }
}
