package Practice_01_05_2022;

public class RemoveSpaces {

    public static void main(String[] args) {

        String input="  Hello world      I      love      Java    ";
        removeSpaces(input);


    }

    public static void removeSpaces(String str){
        String result="";
        String [] strArr=str.trim().split(" ");

        for(String each:strArr){
            if(!each.isEmpty()){
                result+=each+ " ";
            }
        }
        System.out.println(result.trim());
    }





}
/*  (RemoveSpaces)

                      Task 3 :   Write a method that can remove  all extra space from String


                            Input: "  Hello world      I      love      Java    "
                           Output: Hello world I love Java

                     */