package com.lucashoeft.huddle.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User user1 = new User(1L, "luka", "luka123@gmail.com", "luka456");
            User user2 = new User(2L, "ben","benqwertz@gmail.com","benasdf");

            userRepository.saveAll(
                    List.of(user1, user2)
            );
        };
    }

}
