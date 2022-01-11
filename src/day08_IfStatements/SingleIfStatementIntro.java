package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
/*......*/
        int number = 100;
         boolean evenNumber = number%2 == 0;
         boolean oddNumber = !evenNumber; //not even number
         if(evenNumber){//even number//true
             System.out.println("evenNumber = " + evenNumber);
         }

         if(oddNumber){// not even number//false //i can use  if !evenNumber
             System.out.println("oddNumber = " + oddNumber);
         }


        System.out.println("=====================");

         int n =200;
          // positive
        if(n > 0){ //if the n is greater than zero, then its positive

            System.out.println(n + " is positive ");

        }//negative
        if (n < 0){   //if the n is less than zero, then its negative
            System.out.println(n + " is negative ");

        }

        //zero
        if ( n == 0) {
            System.out.println( n+ " is zero" );

        }


    }








}
