package com.felipecook;

public class KataProblemDataReverse {

  public static int[] DataReverse(int[] data) {

    int[] returnArray = new int[data.length];

    int countingBackwards = data.length - 1;



    for (int i = 0; i < data.length; i++) {

      returnArray[i] = data[countingBackwards];
      countingBackwards--;


    }

    return returnArray;

  }

}
