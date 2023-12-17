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
            ChessGame yugoslavGame = new ChessGame(
                    "Bobby Fischer",
                    "Boris V Spassky",
                    "1-0",
                    50,
                    LocalDate.of(1992, Month.JANUARY, 1),
                    "1. e4 e5 2. Nf3 Nc6 3. Bb5 a6 4. Ba4 Nf6 5. O-O Be7 6. Re1 b5 7. Bb3 d6 8. c3 " +
                            "O-O 9. h3 Nb8 10. d4 Nbd7 11. Nbd2 Bb7 12. Bc2 Re8 13. Nf1 Bf8 14. Ng3 g6 15. " +
                            "Bg5 h6 16. Bd2 Bg7 17. a4 c5 18. d5 c4 19. b4 Nh7 20. Be3 h5 21. Qd2 Rf8 22. Ra3 " +
                            "Ndf6 23. Rea1 Qd7 24. R1a2 Rfc8 25. Qc1 Bf8 26. Qa1 Qe8 27. Nf1 Be7 28. N1d2 Kg7 " +
                            "29. Nb1 Nxe4 30. Bxe4 f5 31. Bc2 Bxd5 32. axb5 axb5 33. Ra7 Kf6 34. Nbd2 Rxa7 " +
                            "35. Rxa7 Ra8 36. g4 hxg4 37. hxg4 Rxa7 38. Qxa7 f4 39. Bxf4 exf4 40. Nh4 Bf7 41. " +
                            "Qd4+ Ke6 42. Nf5 Bf8 43. Qxf4 Kd7 44. Nd4 Qe1+ 45. Kg2 Bd5+ 46. Be4 Bxe4+ 47. " +
                            "Nxe4 Be7 48. Nxb5 Nf8 49. Nbxd6 Ne6 50. Qe5 1-0"
            );

            ChessGame worldOpen = new ChessGame(
                    "Gary Kasparov",
                    "Deep Blue",
                    "1-0",
                    50,
                    LocalDate.of(1997, Month.MAY, 3),
                    "1. e4 e5 2. Nf3 Nc6 3. Bb5 a6 4. Ba4 Nf6 5. O-O Be7 6. Re1 b5 7. Bb3 d6 8. c3 " +
                            "O-O 9. h3 Nb8 10. d4 Nbd7 11. Nbd2 Bb7 12. Bc2 Re8 13. Nf1 Bf8 14. Ng3 g6 15. " +
                            "Bg5 h6 16. Bd2 Bg7 17. a4 c5 18. d5 c4 19. b4 Nh7 20. Be3 h5 21. Qd2 Rf8 22. Ra3 " +
                            "Ndf6 23. Rea1 Qd7 24. R1a2 Rfc8 25. Qc1 Bf8 26. Qa1 Qe8 27. Nf1 Be7 28. N1d2 Kg7 " +
                            "29. Nb1 Nxe4 30. Bxe4 f5 31. Bc2 Bxd5 32. axb5 axb5 33. Ra7 Kf6 34. Nbd2 Rxa7 " +
                            "35. Rxa7 Ra8 36. g4 hxg4 37. hxg4 Rxa7 38. Qxa7 f4 39. Bxf4 exf4 40. Nh4 Bf7 41. " +
                            "Qd4+ Ke6 42. Nf5 Bf8 43. Qxf4 Kd7 44. Nd4 Qe1+ 45. Kg2 Bd5+ 46. Be4 Bxe4+ 47. " +
                            "Nxe4 Be7 48. Nxb5 Nf8 49. Nbxd6 Ne6 50. Qe5 1-0"
            );

            chessGameRepository.saveAll(
                    List.of(yugoslavGame, worldOpen)
            );
        };
    }
}
