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
    private String player;
    private String PNG;
    private Double outcome; // win: 1, draw: .5, loss: 0
    private LocalDate datePlayed;

    public ChessGame() {

    }

    public ChessGame(Long id, String player, Double outcome, String PNG) {
        this.id = id;
        this.player = player;
        this.PNG = PNG;
        this.outcome = outcome;
    }

    public ChessGame(Long id, String player, Double outcome, LocalDate datePlayed, String PNG) {
        this.id = id;
        this.player = player;
        this.outcome = outcome;
        this.datePlayed = datePlayed;
        this.PNG = PNG;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Double getOutcome() {
        return outcome;
    }

    public void setOutcome(Double outcome) {
        this.outcome = outcome;
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
                ", player='" + player + "'" +
                ", outcome=" + outcome +
                ", datePlayed=" + datePlayed +
                ", PNG='" + PNG + "'" +
                "}";
    }
}
