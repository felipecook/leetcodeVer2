package com.felipecook;

/*
 Move the first letter of each word to the end of it,
 then add "ay" to the end of the word. Leave punctuation marks untouched.

 Examples:
 pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 pigIt('Hello world !');     // elloHay orldway !
  */

public class SimplePigLatin {

  public static String pigIt(String str) {

    StringBuilder pigifiedString = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      StringBuilder word = new StringBuilder();
      if(Character.isLetter(str.charAt(i))){
        word.append(str.charAt(i));
      } else if (!Character.isSpaceChar(str.charAt(i))){

        char firstLetter = word.charAt(0);
        word.replace(0,1, "");
        word.append(firstLetter);
        word.append("ay");
        String pigifiedWord = word.toString();
        pigifiedString.append(pigifiedWord + " ");

      } else {
        pigifiedString.append(str.charAt(i));
      }

    }

    return pigifiedString.toString();


  }

}

