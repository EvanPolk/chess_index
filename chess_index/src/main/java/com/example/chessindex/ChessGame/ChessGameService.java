package com.example.chessindex.ChessGame;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChessGameService {

    private final ChessGameRepository chessGameRepository;

    public ChessGameService(ChessGameRepository chessGameRepository) {
        this.chessGameRepository = chessGameRepository;
    }
    public List<ChessGame> getChessGames() {
        return chessGameRepository.findAll();
    }

    public void addNewChessGame(ChessGame chessGame) {
        // Optional<ChessGame> chessGameOptional = chessGameRepository.findChessGameByPNG(chessGame.getPNG());
        // if(chessGameOptional.isPresent()) throw new IllegalStateException("Game is already registered");
        chessGameRepository.save(chessGame);
    }
}
