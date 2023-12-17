package com.example.chessindex.ChessGame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
