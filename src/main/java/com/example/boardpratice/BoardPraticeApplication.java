package com.example.boardpratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BoardPraticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardPraticeApplication.class, args);
    }

}
