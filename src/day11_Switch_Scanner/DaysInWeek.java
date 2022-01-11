package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        //long, float,double ,boolean =not allow use with switch
        //char,int,String you can use with switch
        int number= 4;
// <= >= (you can not use these with switch!!!)
      switch (number){//1,2,3,4,5,6,7 ==

          case 1 :
              System.out.println("Monday");
         break;
          case 2 :
              System.out.println("Tuesday");
              break;//exits the switch after executing the case block
          case 3 :
              System.out.println("Wednesday");
              break;
              case 4 ://exits the switch after executing the case block
              System.out.println("Thursday");
              break;
          case 5 ://exits the switch after executing the case block
              System.out.println("Friday");
              break;
          case 6 :
              System.out.println("Saturday");
              break;

          case 7 :
              System.out.println("Sunday");
              break;
          default://only gets executed if none of the case blocks are matching
               System.out.println("Invalid");
              //we don't use break for default(not mandatory) because it has } for end to executing
      }
      /*
        if (number==1){
       System.out.println("monday")
       }
       */
    }
}
