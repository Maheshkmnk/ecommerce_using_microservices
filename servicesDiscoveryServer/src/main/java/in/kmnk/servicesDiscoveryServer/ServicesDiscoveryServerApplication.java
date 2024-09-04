package in.kmnk.servicesDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableEurekaServer
public class ServicesDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesDiscoveryServerApplication.class, args);
	}

}
