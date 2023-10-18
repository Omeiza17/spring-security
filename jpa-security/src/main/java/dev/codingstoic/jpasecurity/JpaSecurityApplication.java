package dev.codingstoic.jpasecurity;

import dev.codingstoic.jpasecurity.model.Post;
import dev.codingstoic.jpasecurity.model.User;
import dev.codingstoic.jpasecurity.repository.PostRepository;
import dev.codingstoic.jpasecurity.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository posts, UserRepository users) {
        return args -> {
            users.save(new User("admin", "P@ssw0rd", "ROLE_USER, ROLE_ADMIN"));
            users.save(new User("user", "P@ssw0rd", "ROLE_USER"));
            posts.save(
                    new Post("Hello, World!", "Spring Greetings",
                            "Welcome to the world of Spring Security",
                            "Codingstoic")
            );
        };
    }

}
