package com.example.chessindex.ChessGame;

import jakarta.persistence.PostRemove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/ChessGame")
public class ChessGameController {
    private final ChessGameService chessGameService;

    @Autowired
    ChessGameController(ChessGameService chessGameService) {
        this.chessGameService = chessGameService;
    }

    @GetMapping
    public List<ChessGame> getChessGames() {
        return chessGameService.getChessGames();
    }

    @PostMapping
    public void registerNewChessGame(@RequestBody ChessGame chessGame) {
        chessGameService.addNewChessGame(chessGame);
    }

    @DeleteMapping(path="{chessGameId}")
    public void deleteChessGame(@PathVariable("chessGameId") Long chessGameId) {
        chessGameService.deleteChessGame(chessGameId);
    }

    @PutMapping(path="{chessGameId}")
    public void updateChessGame(
            @PathVariable("chessGameId") Long chessGameId,
            @RequestParam(required = false) String playerWhite,
            @RequestParam(required = false) String playerBlack,
            @RequestParam(required = false) LocalDate datePlayed) {
        chessGameService.updateChessGame(chessGameId, playerWhite, playerBlack, datePlayed);
    }
}
