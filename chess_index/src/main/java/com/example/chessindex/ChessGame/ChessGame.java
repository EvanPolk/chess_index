package com.example.chessindex.ChessGame;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class ChessGame {
    @Id
    @SequenceGenerator(
            name = "chessgame_sequence",
            sequenceName = "chessgame_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "chessgame_sequence"
    )
    private Long id;
    private String playerWhite;
    private String playerBlack;
    private String outcome;
    private int moves;
    private LocalDate datePlayed;
    @Lob
    private String PNG;

    public ChessGame() {

    }

    public ChessGame(String playerWhite, String playerBlack, String outcome, int moves, String PNG) {
        this.playerWhite = playerWhite;
        this.playerBlack = playerBlack;
        this.outcome = outcome;
        this.moves = moves;
        this.PNG = PNG;
    }

    public ChessGame(String playerWhite, String playerBlack, String outcome, int moves, LocalDate datePlayed, String PNG) {
        this.playerWhite = playerWhite;
        this.playerBlack = playerBlack;
        this.outcome = outcome;
        this.moves = moves;
        this.datePlayed = datePlayed;
        this.PNG = PNG;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerWhite() {
        return playerWhite;
    }

    public void setPlayerWhite(String playerWhite) {
        this.playerWhite = playerWhite;
    }

    public String getPlayerBlack() {
        return playerBlack;
    }

    public void setPlayerBlack(String playerBlack) {
        this.playerBlack = playerBlack;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public LocalDate getDatePlayed() {
        return datePlayed;
    }

    public void setDatePlayed(LocalDate datePlayed) {
        this.datePlayed = datePlayed;
    }

    public String getPNG() {
        return PNG;
    }

    public void setPNG(String PNG) {
        this.PNG = PNG;
    }

    @Override
    public String toString() {
        return "ChessGame{" +
                "id=" + id +
                ", playerWhite='" + playerWhite + "'" +
                ", playerBlack='" + playerBlack + "'" +
                ", outcome='" + outcome + "'" +
                ", moves=" + moves +
                ", datePlayed=" + datePlayed + "'" +
                ", PNG='" + PNG + "'" +
                "}";
    }
}
