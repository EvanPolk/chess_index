package com.example.chessindex.ChessGame;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChessGameService {

    private final ChessGameRepository chessGameRepository;

    public ChessGameService(ChessGameRepository chessGameRepository) {
        this.chessGameRepository = chessGameRepository;
    }
    public List<ChessGame> getChessGames() {
        return chessGameRepository.findAll();
    }
}
