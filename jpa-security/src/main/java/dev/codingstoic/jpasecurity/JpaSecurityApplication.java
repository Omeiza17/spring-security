package dev.codingstoic.jpasecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaSecurityApplication {

    public static final String PASSWORD = "P@ssw0rd";

    public static void main(String[] args) {
        SpringApplication.run(JpaSecurityApplication.class, args);
    }

}
