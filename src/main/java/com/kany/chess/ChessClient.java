package com.kany.chess;

import java.util.Scanner;

public class ChessClient {

  public static boolean isValidInput(String[] strArr) {
    return strArr.length == 2 && Helper.isValidPiece(strArr[0])
        && Helper.isValidPosition(strArr[1]);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strArr = null;
    do {
      System.out.print("Please Enter the Valid Piece and Position : ");
      String input = sc.nextLine();
      strArr = input.split(" ");
    } while (!isValidInput(strArr));

    switch (strArr[0]) {
      case "King":
        break;
      case "Queen":
        break;
      case "Bishop":
        break;
      case "Horse":
        break;
      case "Rook":
        break;
      case "Pawn":
        break;
    }
    sc.close();
  }

}
