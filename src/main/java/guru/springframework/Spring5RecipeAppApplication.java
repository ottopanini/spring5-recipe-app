package guru.springframework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Spring5RecipeAppApplication {

	public static void main(String[] args) {
		log.debug("Starting recipe application");
		SpringApplication.run(Spring5RecipeAppApplication.class, args);
	}
}
