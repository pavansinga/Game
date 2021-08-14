package com.play.game.service;

import com.play.game.domain.Board;

public interface Rules {
    Boolean checkMove(Board board);
    void botTurn(Board board);
    Boolean checkWinner(Board board);
}
