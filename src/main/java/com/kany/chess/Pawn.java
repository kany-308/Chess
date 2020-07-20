package com.kany.chess;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements Piece {

  @Override
  // Assuming Pawn's movement from both the sides
  public String possibleMovement(String position) {
    int i = Helper.getRowIndexFromPosition(position);
    int j = Helper.getColumnIndexFromPosition(position);
    List<String> result = new ArrayList<>();
    if (Helper.isValidIndex(i - 1, j))
      result.add(Helper.getPosition(i - 1, j));
    if (Helper.isValidIndex(i + 1, j))
      result.add(Helper.getPosition(i + 1, j));
    return String.join(",", result);
  }
}
