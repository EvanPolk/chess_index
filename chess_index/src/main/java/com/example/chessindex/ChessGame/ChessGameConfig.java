package com.example.chessindex.ChessGame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ChessGameConfig {

    @Bean
    CommandLineRunner commandLineRunner(ChessGameRepository chessGameRepository) {
        return args -> {
            ChessGame sinquefieldOpen = new ChessGame(
                    "Magnus Carlson",
                    1.0,
                    LocalDate.of(2005, Month.JULY, 8),
                    "1. e4 e5 2. Nf6 Nf3"
            );

            ChessGame worldOpen = new ChessGame(
                    "Fabiano Carauana",
                    0.5,
                    LocalDate.of(2020, Month.FEBRUARY, 12),
                    "1. e4 e5 2. Nf2 Nf3"
            );

            chessGameRepository.saveAll(
                    List.of(sinquefieldOpen, worldOpen)
            );
        };
    }
}
