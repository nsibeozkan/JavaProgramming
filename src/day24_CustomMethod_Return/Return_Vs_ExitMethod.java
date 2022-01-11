package day24_CustomMethod_Return;

public class Return_Vs_ExitMethod {

    public static void main(String[] args) {
        nameOfMonth(50);
        System.out.println("Hello World");
    }
    // Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        if(number>12||number<1){
            System.out.println("Invalid");//exits nameOfMonth method,remaining code fragments of the method never gets executed
           // return;
            System.exit(0);
        }

              String name=(number==1)?"Jan":
                (number==2)?"Feb":
                (number==3)?"Mar":(number==4)?"Apr":
                (number==5)?"May":
                (number==6)?"June":(number==7)?"July":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct":
                (number==11)?"Nov":"Dec";

        System.out.println(" Month name = " + name);

    }





}
