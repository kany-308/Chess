package com.kany.chess;

import java.util.ArrayList;
import java.util.List;


public class King implements Piece {

  @Override
  public String possibleMovement(String position) {
    int i = Helper.getRowIndexFromPosition(position);
    int j = Helper.getColumnIndexFromPosition(position);
    List<String> result = new ArrayList<>();
    if (Helper.isValidIndex(i - 1, j))
      result.add(Helper.getPosition(i - 1, j));
    if (Helper.isValidIndex(i - 1, j + 1))
      result.add(Helper.getPosition(i - 1, j + 1));
    if (Helper.isValidIndex(i, j + 1))
      result.add(Helper.getPosition(i, j + 1));
    if (Helper.isValidIndex(i + 1, j + 1))
      result.add(Helper.getPosition(i + 1, j + 1));
    if (Helper.isValidIndex(i + 1, j))
      result.add(Helper.getPosition(i + 1, j));
    if (Helper.isValidIndex(i + 1, j - 1))
      result.add(Helper.getPosition(i + 1, j - 1));
    if (Helper.isValidIndex(i, j - 1))
      result.add(Helper.getPosition(i, j - 1));
    if (Helper.isValidIndex(i - 1, j - 1))
      result.add(Helper.getPosition(i - 1, j - 1));
    return String.join(",", result);
  }

}
