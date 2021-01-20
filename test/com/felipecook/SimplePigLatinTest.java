package com.felipecook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimplePigLatinTest {

  String testString = "Pig latin is cool";
  String expectedString = "igPay atinlay siay oolcay";

  @Test
  void pigIt() {

    assertEquals(expectedString, SimplePigLatin.pigIt(testString));

  }
}