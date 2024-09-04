package in.kmnk.configServer.configuration;

import io.micrometer.observation.ObservationRegistry;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.server.environment.JGitEnvironmentProperties;
import org.springframework.cloud.config.server.environment.JGitEnvironmentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;


//testing purpose created not mandatory write this code to config server
//ignore this configuration package code
@Component
public class CustomGitTemplate extends JGitEnvironmentRepository {
    public CustomGitTemplate(ConfigurableEnvironment environment, JGitEnvironmentProperties properties, ObservationRegistry observationRegistry) {
        super(environment, properties, observationRegistry);
    }

    @Override
    public Environment findOne(String application, String profile, String label, boolean includeOrigin){
//        System.out.println("CustomGitTemplate: findOne method called");
//        try {
//            Thread.sleep(400);
//            System.out.println("CustomGitTemplate: inside try after 4 sec waited");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        return super.findOne(application, profile, label, includeOrigin);
    }
}
