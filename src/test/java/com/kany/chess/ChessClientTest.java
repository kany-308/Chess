package com.kany.chess;

import org.junit.Assert;
import org.junit.Test;

public class ChessClientTest {

  private Context context = null;

  @Test
  public void testKingsPossibleMovementForD5() {
    String expected = "D6,E6,E5,E4,D4,C4,C5,C6";
    context = new Context(new King());
    String actual = context.possibleMovements("D5");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testKingsPossibleMovementForH8() {
    String expected = "H7,G7,G8";
    context = new Context(new King());
    String actual = context.possibleMovements("H8");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testKingsPossibleMovementForA1() {
    String expected = "A2,B2,B1";
    context = new Context(new King());
    String actual = context.possibleMovements("A1");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testQueensPossibleMovementForA1() {
    String expected = "B1,C1,D1,E1,F1,G1,H1,A8,A7,A6,A5,A4,A3,A2,B2,C3,D4,E5,F6,G7,H8";
    context = new Context(new Queen());
    String actual = context.possibleMovements("A1");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testQueensPossibleMovementForE3() {
    String expected = "A3,B3,C3,D3,F3,G3,H3,E8,E7,E6,E5,E4,E2,E1,F2,G1,D2,C1,F4,G5,H6,D4,C5,B6,A7";
    context = new Context(new Queen());
    String actual = context.possibleMovements("E3");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testQueensPossibleMovementForH6() {
    String expected = "A6,B6,C6,D6,E6,F6,G6,H8,H7,H5,H4,H3,H2,H1,G5,F4,E3,D2,C1,G7,F8";
    context = new Context(new Queen());
    String actual = context.possibleMovements("H6");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testBishopsPossibleMovementForH6() {
    String expected = "G5,F4,E3,D2,C1,G7,F8";
    context = new Context(new Bishop());
    String actual = context.possibleMovements("H6");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testBishopsPossibleMovementForD5() {
    String expected = "E4,F3,G2,H1,C4,B3,A2,E6,F7,G8,C6,B7,A8";
    context = new Context(new Bishop());
    String actual = context.possibleMovements("D5");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testBishopsPossibleMovementForA2() {
    String expected = "B1,B3,C4,D5,E6,F7,G8";
    context = new Context(new Bishop());
    String actual = context.possibleMovements("A2");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testHorsesPossibleMovementForA2() {
    String expected = "B4,C3,C1";
    context = new Context(new Horse());
    String actual = context.possibleMovements("A2");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testHorsesPossibleMovementForD8() {
    String expected = "F7,E6,C6,B7";
    context = new Context(new Horse());
    String actual = context.possibleMovements("D8");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testHorsesPossibleMovementForE3() {
    String expected = "F5,G4,G2,F1,D1,C2,C4,D5";
    context = new Context(new Horse());
    String actual = context.possibleMovements("E3");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testRooksPossibleMovementForE3() {
    String expected = "A3,B3,C3,D3,F3,G3,H3,E8,E7,E6,E5,E4,E2,E1";
    context = new Context(new Rook());
    String actual = context.possibleMovements("E3");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testRooksPossibleMovementForA1() {
    String expected = "B1,C1,D1,E1,F1,G1,H1,A8,A7,A6,A5,A4,A3,A2";
    context = new Context(new Rook());
    String actual = context.possibleMovements("A1");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testPawnsPossibleMovementForD5() {
    String expected = "D6,D4";
    context = new Context(new Pawn());
    String actual = context.possibleMovements("D5");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testPawnsPossibleMovementForD1() {
    String expected = "D2";
    context = new Context(new Pawn());
    String actual = context.possibleMovements("D1");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testPawnsPossibleMovementForD8() {
    String expected = "D7";
    context = new Context(new Pawn());
    String actual = context.possibleMovements("D8");
    Assert.assertEquals(expected, actual);
  }
}
