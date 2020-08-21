package com.felipecook;

import java.util.LinkedList;
import java.util.List;

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

  /*
   * Write a function that takes a list of strings and returns the sum of the list items that represent an integer (skipping the other items)
   *
   * */
  public int sumListOfStrings (List<String> stringItems) {
    int sum = 0;
    for (int i = 0; i < stringItems.size(); i++) {
      if (isNumeric(stringItems.get(i))){
        int number = Integer.parseInt(stringItems.get(i));
        sum += number;
      }
    }
    return sum;
  }

  private boolean isNumeric(String word){
    try {
      Integer.parseInt(word);

      return true;
    }
    catch (NumberFormatException e){
      return false;
    }
  }


  /*
  * Write a function that takes a list of strings and returns the sum of the list items that represent an integer (skipping the other items)
  *
  * */
  public int sumListOfStringsRecursion (LinkedList<String> stringItems) {
    if (stringItems.size() != 0) {
      if (isNumeric(stringItems.get(0))) {
        int number = Integer.parseInt(stringItems.get(0));
        stringItems.removeFirst();
        return number + sumListOfStrings(stringItems);
      }
    }
    return 0;

  }
  
  /*
  * Solve the game "Guess a number", find a secret integer between 1 and 1000000
in less than 50 guesses. Write a function that solves the game without user input and returns the
solution by using the function verify() which is defined with the following
specification:
function verify(guess: integer) -> integer
Argument:
     guess (integer) the number to verify
Returns:
     0 if the guess is the solution, your program won
     -1 if the solution is smaller than the guess parameter
     1  if the solution is bigger than the guess parameter

Warning: You are not allowed to call verify() more that 50 times or you lose.
* */
  public void guessingGame(int randomNumber) {
    int max = 1000000;
    int min = 1;
    boolean flag = false;

    while (!flag){

      int guessNumber = (max + min) / 2;

      int answer = verify(guessNumber, randomNumber);

      if (answer == 0) {
        System.out.println("The random number is :" + guessNumber);
        flag = true;

      } else if (answer == 1) {
        max = guessNumber - 1;

      } else if (answer == -1) {
        min = guessNumber + 1;

      }

    }
  }

  private int verify(int guessedNumber, int randomNumber) {
    if (guessedNumber == randomNumber) {
      return 0;
    } else if (guessedNumber < randomNumber) {
      return -1;
    } else {
      return 1;
    }
  }





  public static void main(String[] args) {

    System.out.println(isHappy(19));

  }





}
