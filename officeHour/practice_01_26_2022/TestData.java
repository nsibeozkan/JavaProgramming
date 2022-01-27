package practice_01_26_2022;

public class TestData {

    public static final String username="username";
    public static final String password="123";

    public final  void finalMethod(){
        System.out.println("Final method");
    }





}
  class Child extends TestData{
    //we cannot overriding final method(finalMethod())

  }