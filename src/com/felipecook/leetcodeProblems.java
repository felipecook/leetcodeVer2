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

  /*A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.*/
  public static boolean isHappy(int n) {

    if (n == 1) {
      return true;
    }
    if (n < 1) {
      return false;
    }

    boolean flag = true;
    int sum = 0;
    while (flag) {

      int lastDigit = n % 10;
      sum += lastDigit * lastDigit;

      n /= 10;

      if (n < 1) {
        flag = false;
      }
    }

    isHappy(sum);


  }

  public static void main(String[] args) {

    System.out.println(isHappy(19));

  }

}
