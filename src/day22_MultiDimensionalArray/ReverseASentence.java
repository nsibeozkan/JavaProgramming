package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseASentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
     String reversedSentence="";//java to learn to day good a is Today

        for (int i = words.length - 1; i >= 0; i--) {
           reversedSentence += words[i]+" ";

        }
        System.out.println(reversedSentence);

    }}


        /*
        write a program that can reverse sentence
        sentence="Today is a good day to learn Java"
       }


}*/