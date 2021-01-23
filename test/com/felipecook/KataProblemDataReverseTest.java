package com.felipecook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataProblemDataReverseTest {

  int[] testData = {1,1,1,1,1,1,1,1, 0,0,0,0,0,0,0,0, 0,0,0,0,1,1,1,1, 1,0,1,0,1,0,1,0};

  int[] reversedTestData = {1,0,1,0,1,0,1,0, 0,0,0,0,1,1,1,1, 0,0,0,0,0,0,0,0, 1,1,1,1,1,1,1,1};

  @Test
  void dataReverse() {
    assertArrayEquals(reversedTestData, KataProblemDataReverse.DataReverse(testData));
  }
}