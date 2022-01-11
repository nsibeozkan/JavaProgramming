package practice_12_15_2021;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String [] color={"Yellow","Blue","Purple"};
        String [] color2=new String[3];
        color2[0]="Red";
        color2[1]="Orange";
        color2[2]="Blue";
        System.out.println(Arrays.toString(color2));

        //equals
        int [] num1={1,2,3,4};
        int [] num2={142,35,12,9};
        System.out.println(Arrays.equals(num1,num2));
      //sort
        int[] num={1,98,4,5,0,8,7,5};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));



    }
}
