package com.example.chessindex.ChessGame;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface ChessGameRepository extends JpaRepository<ChessGame, Long> {
    Optional<ChessGame> findChessGameByPNG(String PNG);
}
