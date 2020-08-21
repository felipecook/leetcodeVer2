package com.felipecook;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class LeetcodeProblemsTest {

  LeetcodeProblems leetcodeProblems = new LeetcodeProblems();

  List<String> testlist = Arrays.asList("Hello", "1", "2", "Hey");


  @Test
  void sumListOfStrings() {
    assertEquals(3, leetcodeProblems.sumListOfStrings(testlist));

  }

  @Test
  void sumListOfStringsRecursion() {
    assertEquals(3, leetcodeProblems.sumListOfStrings(testlist));
  }

  @Test
  void guessingGame() {
    //assertEquals(50, leetcodeProblems.guessingGame(50));
  }

  @Test
  void openSource() {
    //assertEquals(null, leetcodeProblems.openSource(2));
  }
}