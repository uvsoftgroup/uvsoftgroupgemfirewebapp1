package uvsoftgroup.uvsoftgroupgemfirewebapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@EnableGemfireRepositories
@SpringBootApplication
@EnableAutoConfiguration
public class Uvsoftgroupgemfirewebapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Uvsoftgroupgemfirewebapp1Application.class, args);
	}
}
