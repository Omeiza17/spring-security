package dev.codingstoic.basicsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails userI = User.withDefaultPasswordEncoder()
                .username("user")
                .password("P@ssw0rd")
                .roles("USER")
                .build();

        UserDetails userII = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("P@ssw0rd")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(userI, userII);
    }

    @Bean
    public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/").permitAll();
                    auth.requestMatchers("/user").hasRole("USER");
                    auth.requestMatchers("/admin").hasRole("ADMIN");
                })
                .httpBasic(Customizer.withDefaults())
                .build();
    }
}
