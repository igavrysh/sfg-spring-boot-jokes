package guru.springframework.sfgspringbootjokes;

import guru.springframework.sfgspringbootjokes.services.JokesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgSpringBootJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgSpringBootJokesApplication.class, args);

        JokesService jokesService = new JokesService();

        System.out.println(jokesService.getRandomQuote());
    }

}
