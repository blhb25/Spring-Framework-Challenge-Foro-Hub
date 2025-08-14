package java.org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ForumApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForumApiApplication.class, args);
    }
}