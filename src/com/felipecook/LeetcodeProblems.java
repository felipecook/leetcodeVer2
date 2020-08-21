package com.felipecook;

public class LeetcodeProblems {

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

   // if(n)

    while(n > 1) {

      boolean flag = true;
      int sum = 0;
      int reflectionOfN = n;
      while(flag) {
        int lastDigit = reflectionOfN % 10;
        sum += lastDigit * lastDigit;

        reflectionOfN /= 10;

        if(reflectionOfN < 1) {
          flag = false;
        }
      }
      n = sum;

    }

    return n == 1;


  }

  /*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.*/
  public int maxSubArray(int[] nums) {

    //'i' will hold the initial marker, 'j' will hold the sums progressing forward from 'i' and 'k' will hold the sums progressing from the end.

    int startingIndex = 0;
    int endingIndex = nums.length;
    int maxSum = 0;

    for (int i = 0; i < nums.length - 1; i++) {

      int leftBoundMarker = nums[i];
      int tempSum = leftBoundMarker;
      for (int j = i + 1; j < nums.length; j++) {
        int rightBoundMarker = nums[j];
        tempSum += nums[j];
        if (tempSum > maxSum) {
          maxSum = tempSum;
          startingIndex = i;
          endingIndex = j;
        }
      }
      tempSum = 0;
      for (int k = nums.length; k > i; k--) {
        tempSum += nums[k];
        if (tempSum > maxSum){
          maxSum = tempSum;
          startingIndex = i;
          endingIndex = k;
        }
      }
      return maxSum;

    }

    return 0;
  }



  public static void main(String[] args) {

    System.out.println(isHappy(19));

  }

}
