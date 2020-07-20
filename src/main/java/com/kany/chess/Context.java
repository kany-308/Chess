package com.kany.chess;

public class Context {
  private Piece piece;

  public Context(Piece piece) {
    this.piece = piece;
  }

  public String possibleMovements(String pos) {
    return piece.possibleMovement(pos);
  }
}
