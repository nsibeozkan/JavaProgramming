package Practice_01_05_2022;

import java.util.ArrayList;

public class HidePassword {


    public static void main(String[] args) {
        String [] password={"one","hi","hold"};
        ArrayList<String> hiddenPassword=new ArrayList<>();

        for(String each:password){
            hiddenPassword.add(each);
        }

        System.out.println(hiddenPassword);
    }




}
/*
            Task 2 : Hide Passwords

                    Given an array of passwords (String). Hide each password as a star () and show the hidden password

                    Ex:

                    Input:
                    {"one", "hi", "hold}

                    Output:
                    [ **, , ** ]

                */
