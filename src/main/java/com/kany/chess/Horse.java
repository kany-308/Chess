package com.kany.chess;

import java.util.ArrayList;
import java.util.List;

public class Horse implements Piece {

  @Override
  public String possibleMovement(String position) {
    int i = Helper.getRowIndexFromPosition(position);
    int j = Helper.getColumnIndexFromPosition(position);
    List<String> result = new ArrayList<>();
    if (Helper.isValidIndex(i - 2, j + 1))
      result.add(Helper.getPosition(i - 2, j + 1));
    if (Helper.isValidIndex(i - 1, j + 2))
      result.add(Helper.getPosition(i - 1, j + 2));
    if (Helper.isValidIndex(i + 1, j + 2))
      result.add(Helper.getPosition(i + 1, j + 2));
    if (Helper.isValidIndex(i + 2, j + 1))
      result.add(Helper.getPosition(i + 2, j + 1));
    if (Helper.isValidIndex(i + 2, j - 1))
      result.add(Helper.getPosition(i + 2, j - 1));
    if (Helper.isValidIndex(i + 1, j - 2))
      result.add(Helper.getPosition(i + 1, j - 2));
    if (Helper.isValidIndex(i - 1, j - 2))
      result.add(Helper.getPosition(i - 1, j - 2));
    if (Helper.isValidIndex(i - 2, j - 1))
      result.add(Helper.getPosition(i - 2, j - 1));
    return String.join(",", result);
  }

}
