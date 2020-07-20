package com.kany.chess;

public class Context {
  private Piece piece;

  public Context(Piece piece) {
    this.piece = piece;
  }

  public void possibleMovements(String pos) {
    piece.possibleMovement(pos);
  }
}
