package com.felipecook;

public class KataProblemDataReverse {

  public static int[] DataReverse(int[] data) {

    if (data.length == 8) {
      return data;
    }

    int[] returnArray = new int[data.length];

    int counter = 0;

    int reverseCounter = data.length - 1;

    int[] byteOfData = new int[8];
    
    for (int i = 0; i < data.length; i++) {

      byteOfData[counter] = data[i];

      counter++;

      // if the counter has reached 8, that means that we have a full byte of data
      if (counter == 8) {
        for (int j = reverseCounter; j > reverseCounter - 8; j--) {

          returnArray[j] = byteOfData[counter - 1];

          counter--;
        }

        
      }

      

      
    }

    return returnArray;

  }

}
