package com.example.chessindex.ChessGame;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChessGameRepository extends JpaRepository<ChessGame, Long> {
    // Query SELECT s FROM chessgame WHERE s.PNG = ?1
    // Optional<ChessGame> findChessGameByPNG(String PNG);
}
