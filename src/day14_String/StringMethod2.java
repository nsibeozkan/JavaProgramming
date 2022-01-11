package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
         String str = "Java is fun,I love learning Java";
          String str2= str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email= "JohnSmith@yahoo.com";
         email = email.replace("yahoo" ,"gmail");//JohnSmith@gmail.com

        System.out.println("email1 = " + email);

        String sentence ="Java Java Pyhton Pyhton C# C# C++ C++ Pyhton Pyhton Pyhton Pyhton";
        String sentence2 =sentence.replace("Pyhton", "");
        System.out.println("sentence2 = " + sentence2);//java java c# c# c++ c++


           sentence2 =sentence2.replace("  " ,"");
           System.out.println("sentence2 = " + sentence2);



           String s = "Dog Dog Dog Dog Dog Dog";
           s = s.replace("Dog","Cat");
        System.out.println("s = " + s);//"cat cat cat cat cat cat cat"

        String s2= "C# is fun, C# is cool";
        s2= s2.replace(" C#"," Java");
        //s2=s2.replace("C# is c" , "Java is c"
        System.out.println("s2 = " + s2);

        String s3= "Java";

        s3=s3.replace("a","e");//"Jeve"
        System.out.println("s3 = " + s3);

        System.out.println("========================");

        String result= "Java Java Java ";
        result=result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);

        String result2="C# is fun, C# is cool";
       result2= result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);

        String result3="Java";
       result3 = result3.replaceFirst("va","vo");
        System.out.println("result3 = " + result3);



    }
}
