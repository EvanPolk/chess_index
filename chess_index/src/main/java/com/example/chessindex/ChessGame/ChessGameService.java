package com.example.chessindex.ChessGame;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
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
        Optional<ChessGame> chessGameOptional = chessGameRepository.findChessGameByPNG(chessGame.getPNG());
        if(chessGameOptional.isPresent()) throw new IllegalStateException("Game is already registered");
        chessGameRepository.save(chessGame);
    }

    public void deleteChessGame(Long chessGameId) {
        boolean exists = chessGameRepository.existsById(chessGameId);
        if(!exists) throw new IllegalStateException("Chess Game " + chessGameId + " does not exist");
        chessGameRepository.deleteById(chessGameId);
    }

    @Transactional
    public void updateChessGame(Long chessGameId, String playerWhite, String playerBlack, LocalDate datePlayed) {
        ChessGame chessGame = chessGameRepository.findById(chessGameId)
                .orElseThrow(() -> new IllegalStateException("Chess Game " + chessGameId + " does not exist"));

        if(playerWhite != null && playerWhite.length() > 0 && !playerWhite.equals(chessGame.getPlayerWhite())) {
            chessGame.setPlayerWhite(playerWhite);
        }

        if(playerBlack != null && playerBlack.length() > 0 && !playerBlack.equals(chessGame.getPlayerBlack())) {
            chessGame.setPlayerBlack(playerBlack);
        }

        if(datePlayed != null && !Objects.equals(datePlayed, chessGame.getDatePlayed())) {
            chessGame.setDatePlayed(datePlayed);
        }
    }
}
