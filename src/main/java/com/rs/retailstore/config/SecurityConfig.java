package com.rs.retailstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails user = User.builder()
                .username("lanhh")
                .password("{bcrypt}$2a$10$7pnbE3SYMB.tRSZXXR81GewoMF5BHi83GQYj6OVYO7TYgOaWOzzaS")
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password("{bcrypt}$2a$10$ASkz8BTXG4Bgv/hmOS9SFezpW841wpsA1e1uY0itjIh3L/mkwa/Ju")
                .roles("USER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
}
