package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();

        if (word.substring(0,1).equals("x")) {
            System.out.println(word.substring(0, 1).replace("x", "a") + word.substring(1));

            System.out.println("=====================================");

          if (word.charAt(0)== 'x'){
          word =    word.replaceFirst("x","a");

              System.out.println(word);
          }

        }






        /*
         Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

         */
    }
}
