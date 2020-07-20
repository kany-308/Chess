package com.kany.chess;

public class Helper {
  public static boolean isValidPiece(String piece) {
    return piece.equals("King") || piece.equals("Queen") || piece.equals("Bishop")
        || piece.equals("Horse") || piece.equals("Rook") || piece.equals("Pawn");
  }

  public static boolean isValidPosition(String position) {
    int pos1Ascii = (int) position.charAt(0);
    int pos2 = Integer.parseInt(position.charAt(1) + "");
    return pos1Ascii >= 65 && pos1Ascii <= 72 && pos2 >= 1 && pos2 <= 8;
  }
}
