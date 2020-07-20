package com.kany.chess;

import java.util.ArrayList;
import java.util.List;

public class Rook implements Piece {

  @Override
  public String possibleMovement(String position) {
    int i = Helper.getRowIndexFromPosition(position);
    int j = Helper.getColumnIndexFromPosition(position);
    List<String> result = new ArrayList<>();
    result.addAll(Helper.getHorizontalAndVerticalMovements(i, j));
    return String.join(",", result);
  }

}
