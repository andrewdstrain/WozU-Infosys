package com.isageek.blaztek.day13.labb;

import java.util.Arrays;

public class TicTacToe {
    public final static char X = 'x';
    public final static char O = 'o';

    private char player;
    private char[][] board;
    private boolean played;

    public TicTacToe() {
        reset();
    }

    /**
     * Resets the game to it's initial state. X gets first play.
     */
    public void reset() {
        board = new char[3][3];

        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }

        player = X;
        played = false;
    }

    /**
     * Checks for the nextPlayer without ending the turn.
     * NOTE: this is also the previous player
     *
     * @return the player that will be next
     */
    public char nextPlayer() {
        return player == O ? X : O;
    }

    /**
     * Returns the current player. The game starts with X.
     *
     * @return the current player
     */
    public char currentPlayer() {
        return player;
    }

    /**
     * Ends the turn and advances to the next player
     */
    public void next() {
        player = nextPlayer();
        played = false;
    }

    /**
     * Helper method to check for valid indices.
     *
     * @param index the index to be checked
     * @throws ArrayIndexOutOfBoundsException it's tic tac toe. indices are 0, 1, or 2.
     */
    private void checkIndex(int index) {
        if ((index < 0) || (index >= 3)) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * Mark the player's choice on the board.
     *
     * @param row the row coordinate
     * @param col the column coordinate
     * @throws NotYourTurnException can not go twice in a row
     * @throws AlreadyPlayedHereException can not play on an already marked position
     */
    public void mark(int row, int col) throws NotYourTurnException, AlreadyPlayedHereException {
        if (played) throw new NotYourTurnException();
        checkIndex(row);
        checkIndex(col);

        if (board[row][col] == ' ') {
            board[row][col] = player;
            played = true;
        } else {
            throw new AlreadyPlayedHereException();
        }
    }

    /**
     * Checks rows for a win.
     * @return true for a win
     */
    private boolean checkRowForWin() {
        boolean win = false;

        for (char[] row : board) {
            boolean same = true;
            for (char letter : row) {
                if (letter != player) {
                    same = false;
                    break;
                }
            }
            if (same) {
                win = true;
                break;
            }
        }

        return win;
    }

    /**
     * Check columns for a win
     * @return true for a win
     */
    private boolean checkColForWin() {
        boolean win = false;

        for (int col = 0; col < 3; col++) {
            boolean same = true;
            for (int row = 0; row < 3; row++) {
                if (board[row][col] != player) {
                    same = false;
                    break;
                }
            }
            if (same) {
                win = true;
                break;
            }
        }

        return win;
    }

    /**
     * Check diagonals for a win
     * @return true for a win
     */
    private boolean checkDiagForWin() {
        return (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) ||
                (board[0][2] == player &&
                 board[1][1] == player &&
                 board[2][0] == player);
    }

    /**
     * Checks the entire board for a win.
     *
     * @return true if there is a win
     */
    public boolean checkBoardForWin() {
        return checkRowForWin() || checkColForWin() || checkDiagForWin();
    }

}
