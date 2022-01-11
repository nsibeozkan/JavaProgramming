package day15_ForLoop;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {
        String firstname ="cyDEo",
        lastname ="SCHOOL";
       //firstname= firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
        firstname= (""+ firstname.charAt(0)).toUpperCase()+firstname.substring(1).toLowerCase();

        lastname= lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();

        System.out.println(firstname);
        System.out.println(lastname);
        String fullName=firstname+" "+ lastname;
        System.out.println(fullName);
        /*
         Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */
    }
}
