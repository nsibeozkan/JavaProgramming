package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData);//private is not visible outside of class.

        System.out.println("---------------------");

        AccessModifiers.method1();
        AccessModifiers.method2();
       // AccessModifiers.method3();//it is not visible outside of class(private access modifier)




    }




}
