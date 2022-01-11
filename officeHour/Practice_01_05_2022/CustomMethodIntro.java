package Practice_01_05_2022;

public class CustomMethodIntro {

    public static void main(String[] args) {
        sum(5,4);

        System.out.println(sum1(5,4));
        double a=5.4;
        double b=5.6;
        System.out.println(sum1 ((int)a,(int)b));
    }





    public static void sum(int a,int b){
        System.out.println(a+b);
    }


    public static int sum1(int a,int b){
        return a+b;
    }
}
