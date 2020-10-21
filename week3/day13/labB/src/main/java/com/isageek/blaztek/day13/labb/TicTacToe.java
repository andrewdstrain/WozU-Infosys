package com.isageek.blaztek.day13.labb;

import java.util.Arrays;

public class TicTacToe {
    public final static char X = 'x';
    public final static char O = 'o';

    private char player;
    private char[][] grid;
    private boolean played;

    public TicTacToe() {
        reset();
    }

    /**
     * Resets the game to it's initial state
     */
    public void reset() {
        grid = new char[3][3];

        for (char[] row : grid) {
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

    private void checkIndex(int index) {
        if ((index < 0) || (index >= 3)) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void mark(int row, int col) throws NotYourTurnException, AlreadyPlayedHereException {
        if (played) throw new NotYourTurnException();
        checkIndex(row);
        checkIndex(col);

        if (grid[row][col] == ' ') {
            grid[row][col] = player;
            played = true;
        } else {
            throw new AlreadyPlayedHereException();
        }
    }

    private boolean checkRowForWin() {
        boolean win = false;

        for (char[] row : grid) {
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

    private boolean checkColForWin() {
        boolean win = false;

        for (int col = 0; col < 3; col++) {
            boolean same = true;
            for (int row = 0; row < 3; row++) {
                if (grid[row][col] != player) {
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

    private boolean checkDiagForWin() {
        return (grid[0][0] == player &&
                grid[1][1] == player &&
                grid[2][2] == player) ||
                (grid[0][2] == player &&
                 grid[1][1] == player &&
                 grid[2][0] == player);
    }

    public boolean checkBoardForWin() {
        return checkRowForWin() || checkColForWin() || checkDiagForWin();
    }

}
