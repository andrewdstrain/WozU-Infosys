# Tic Tac Toe

The class implements an entire game.

On instantiation (or `reset`), everything is set up for play with X going
first. Player X then `mark`s their move. Then you `checkBoardForWin`. If no
win, then you'd select the `next` player. This process repeats for player O.

## Exceptions

If a player makes a mark followed by another mark, it is considered cheating
and a `NotYourTurnException` occurs. Likewise, if a player tries to mark a
location that has already been played, it is considered cheating and an
`AlreadyPlayedHereException` occurs.
