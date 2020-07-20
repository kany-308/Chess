package com.kany.chess;

public class Helper {
  public static boolean isValidPiece(String piece) {
    return piece.equals("King") || piece.equals("Queen") || piece.equals("Bishop")
        || piece.equals("Horse") || piece.equals("Rook") || piece.equals("Pawn");
  }

  public static boolean isValidPosition(String position) {
    int pos1Ascii = (int) position.charAt(0);
    int pos2 = Integer.parseInt(position.charAt(1) + "");
    return pos1Ascii >= Constant.ASCII_A
        && pos1Ascii <= (Constant.ASCII_A + Constant.CHESS_Board_LEN - 1) && pos2 >= 1
        && pos2 <= Constant.CHESS_Board_LEN;
  }

  public static int getRowIndexFromPosition(String position) {
    return 8 - Integer.parseInt(position.charAt(1) + "");
  }

  public static int getColumnIndexFromPosition(String position) {
    return ((int) position.charAt(0)) - Constant.ASCII_A;
  }

  public static String getPosition(int i, int j) {
    return (char) (Constant.ASCII_A + j) + "" + (Constant.CHESS_Board_LEN - i);
  }

  public static boolean isValidIndex(int i, int j) {
    return i >= 0 && i < Constant.CHESS_Board_LEN && j >= 0 && j < Constant.CHESS_Board_LEN;
  }

}
