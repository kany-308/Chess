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

    Piece piece = null;
    switch (strArr[0]) {
      case "King":
        piece = new King();
        break;
      case "Queen":
        piece = new Queen();
        break;
      case "Bishop":
        piece = new Bishop();
        break;
      case "Horse":
        piece = new Horse();
        break;
      case "Rook":
        piece = new Rook();
        break;
      case "Pawn":
        piece = new Pawn();
        break;
    }
    Context context = new Context(piece);
    System.out.println(context.possibleMovements(strArr[1]));
    sc.close();
  }

}
