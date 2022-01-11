package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
        //assignment:=
        int number =100;
        System.out.println("number = " + number);//100
        
        number=200;

        System.out.println("number = " + number);//200
         
        String word ="Java programming";
        System.out.println("word = " + word);//java programming
        
        word = "Wooden Spoon";
        System.out.println("word = " + word);//wooden spoon
        
        word = "Cydeo";
        System.out.println("word = " + word);//cydeo
        
         word = "Java Programming";
        System.out.println("word = " + word);

        System.out.println("----------------------");
        //addition assignment
        int x = 100;
        System.out.println("x = " + x);//100
       // x = x+200;
        x +=200;

        System.out.println("x = " + x);//300
        System.out.println("--------------");
        String str = "Wooden";
        str +=" Spoon";

        System.out.println("str = " + str);
        System.out.println("---------------------------");


        double num1 = 2.5;
        System.out.println("num1 = " + num1);//2.5

        num1 +=5.5;

        System.out.println("num1 = " + num1);//8.0


        System.out.println("--------------------");

        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance += 300;// availableBalance= 1000.50+300

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------");

        //withdrawing 500$
        availableBalance -=500;// availableBalance = 1300.5 -500;

        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$, then 400$

        availableBalance -=200;//600.5
        availableBalance +=400;//1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("------------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *=2;//salary= salary*2
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 10000000;

        System.out.println("doge = " + doge);

        System.out.println("-------------------------");

        double num2 = 25000;

        //num2= num2/2;
        num2 /=2;

        System.out.println("num2 = " + num2);

        System.out.println("-----------------------");

        double num3 =100;
        //%
        num3 %=3;

        System.out.println("num3 = " + num3);

        System.out.println("-----------------");

        int y= 300;
         y %= 16;
        System.out.println("y = " + y);

        System.out.println("------------------");

        int balance =3500;
        //insurance fee :153
        balance %= 153;
        System.out.println("balance = " + balance);





        





    }


    }

