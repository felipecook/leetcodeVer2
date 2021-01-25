package com.felipecook;

public class KataHighAndLow {


  public static String highAndLow(String numbers) {
      int high = 0;

      int low = 0;

    for (int i = 0; i < numbers.length(); i++) {
      if (!Character.isSpaceChar(numbers.charAt(i))){
        int value = Character.getNumericValue(numbers.charAt(i));

        if (value > high) {
          high = value;
        } else if (value < low) {
          low = value;
        }
      }
    }
    return high + " " + low;
  }



}
