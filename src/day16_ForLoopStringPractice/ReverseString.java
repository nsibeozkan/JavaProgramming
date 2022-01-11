package day16_ForLoopStringPractice;

public class ReverseString {
    public static void main(String[] args) {
String str = "Nesibe Ozkan";
//index:      012345
        String result = "";//contain the reversed version of str

        for (int i= str.length()-1; i >=0 ; i--) {//i:index number of str(starting last index to index 0)
          result +=str.charAt(i);//adding each character to result
        }
    /* result +=  str.charAt(11);//n
        result +=   str.charAt(10);//o
        result +=   str.charAt(9);//o
        result +=   str.charAt(8);//p
        result +=   str.charAt(7);//''
        result +=   str.charAt(6);//n
        result +=   str.charAt(5);//e
        ......*/
;

        System.out.println(result);





        /*
        write a program that can reverse a String
        input:
        Wooden Spoon
        Output : noopS nedooW
         */
    }
}
