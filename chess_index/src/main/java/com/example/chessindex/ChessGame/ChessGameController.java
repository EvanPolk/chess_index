package com.example.chessindex.ChessGame;

import jakarta.persistence.PostRemove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/ChessGame")
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
}
