package day45_Abstraction_Continue;




public  interface PropertiesOfInterface {

    int a=100;//static &final by default
    static int b=200;//final by default

  /*  public PropertiesOfInterface(int a) {
        this.a = a;
    }*/


   /*
    static {
        b=100;
    }*/

    /*
     public void method1(){
         System.out.println("Instance method");
     }*/ //no object no instance method


     public static void method2(){
         System.out.println("Static method");
     }



     public abstract void method3();

  public default void  drink(){
      System.out.println("Default method ");
  }




}
