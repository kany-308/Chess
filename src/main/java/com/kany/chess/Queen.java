package com.kany.chess;

import java.util.ArrayList;
import java.util.List;

public class Queen implements Piece {

  @Override
  public String possibleMovement(String position) {
    int i = Helper.getRowIndexFromPosition(position);
    int j = Helper.getColumnIndexFromPosition(position);
    List<String> result = new ArrayList<>();
    result.addAll(Helper.getHorizontalAndVerticalMovements(i, j));
    result.addAll(Helper.getDiagonalMovements(i, j));
    return String.join(",", result);
  }

}
