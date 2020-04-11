package com.felipecook;

public class leetcodeProblems {

  /*Given a non-empty array of integers, every element appears twice except for one. Find that single one.*/
  public int singleNumber(int[] nums) {

    if (nums.length == 1) {
      return nums[0];
    }

    // iterates through nums array
    for (int i = 0; i < nums.length; i++) {

      // holds the variable that we will be checking if it has a pair
      int holdingVariable = nums[i];
      boolean hasPair = false;
      // iterates through the nums array searching for pair value
      for (int j = 0; j < nums.length; j++) {

        // This is the variable we compare to the first variable to see if it is a pair
        int secondHoldingVariable = nums[j];


        if (j != i && nums[i] == nums[j]) {
          hasPair = true;
        }


      }

      if (hasPair == false) {
        return nums[i];
      }

    }
    return 0;
  }

}
