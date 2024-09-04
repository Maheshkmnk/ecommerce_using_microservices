package in.kmnk.configServer.configuration;


import io.micrometer.observation.ObservationRegistry;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.cloud.config.server.environment.JGitEnvironmentProperties;
import org.springframework.cloud.config.server.environment.SearchPathLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
public class CustomeConfigServerConfiguration {

    @Bean
    public EnvironmentRepository environmentRepository(ConfigurableEnvironment environment, JGitEnvironmentProperties properties, ObservationRegistry observationRegistry){
        return new CustomGitTemplate(environment, properties, observationRegistry);
    }
    @Bean
    public ObservationRegistry observationRegistry(){
        return ObservationRegistry.create();
    }
}
