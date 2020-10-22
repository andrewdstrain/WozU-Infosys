package com.isageek.blaztek.day13.labb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tic Tac Toe")
public class TicTacToeTests {
    TicTacToe game;

    @BeforeEach
    void beforeEach() {
        game = new TicTacToe();
    }

    @Test
    void nextPlayer() {
        Assertions.assertEquals(TicTacToe.O, game.nextPlayer());
        game.next();
        Assertions.assertEquals(TicTacToe.X, game.nextPlayer());
        game.next();
        Assertions.assertEquals(TicTacToe.O, game.nextPlayer());
    }

    @Test
    void currentPlayer() {
        Assertions.assertEquals(TicTacToe.X, game.currentPlayer());
        game.next();
        Assertions.assertEquals(TicTacToe.O, game.currentPlayer());
        game.next();
        Assertions.assertEquals(TicTacToe.X, game.currentPlayer());
    }

    @Test
    void checkRowForWin() {
        Assertions.assertDoesNotThrow(() -> {
            game.mark(1, 1);
            game.next();
            game.mark(1, 2);
            game.next();
            game.mark(0, 2);
            game.next();
            game.mark(2, 0);
            game.next();
            game.mark(0, 0);
            game.next();
            game.mark(2, 2);
            game.next();
            game.mark(0, 1);
        });

        Assertions.assertTrue(game.checkBoardForWin());
    }

    @Test
    void checkDiagForWin() {
        Assertions.assertDoesNotThrow(() -> {
            game.mark(1, 1);
            game.next();
            game.mark(1, 0);
            game.next();
            game.mark(2, 0);
            game.next();
            game.mark(0, 2);
            game.next();
            game.mark(2, 2);
            game.next();
            game.mark(2, 1);
            game.next();
            game.mark(0, 0);
        });

        Assertions.assertTrue(game.checkBoardForWin());

        game.reset();

        Assertions.assertDoesNotThrow(() -> {
            game.mark(1, 1);
            game.next();
            game.mark(0, 1);
            game.next();
            game.mark(0, 0);
            game.next();
            game.mark(2, 2);
            game.next();
            game.mark(2, 0);
            game.next();
            game.mark(1, 0);
            game.next();
            game.mark(0, 2);
        });

        Assertions.assertTrue(game.checkBoardForWin());

    }

    @Test
    void checkColForWin() {
        Assertions.assertDoesNotThrow(() -> {
            game.mark(1, 1);
            game.next();
            game.mark(0, 1);
            game.next();
            game.mark(2, 0);
            game.next();
            game.mark(0, 2);
            game.next();
            game.mark(0, 0);
            game.next();
            game.mark(2, 2);
            game.next();
            game.mark(1, 0);
        });

        Assertions.assertTrue(game.checkBoardForWin());
    }

    @Test
    void markAssertions() {
        Assertions.assertDoesNotThrow(() -> {
            game.mark(1, 1);
            Assertions.assertThrows(NotYourTurnException.class, () -> game.mark(1, 0));
            game.next();
            Assertions.assertThrows(AlreadyPlayedHereException.class, () -> game.mark(1, 1));
        });
    }

    @Test
    void isDraw() {
        Assertions.assertDoesNotThrow(() -> {
            game.mark(1, 1);
            game.next();
            game.mark(0, 0);
            game.next();
            game.mark(1, 0);
            game.next();
            game.mark(1, 2);
            game.next();
            game.mark(0, 2);
            game.next();
            game.mark(2, 0);
            game.next();
            game.mark(2, 1);
            game.next();
            game.mark(0, 1);
            game.next();
            game.mark(2, 2);
        });

        Assertions.assertFalse(game.checkBoardForWin());
        Assertions.assertTrue(game.isDraw());
    }
}
