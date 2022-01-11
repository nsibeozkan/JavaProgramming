package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData);//default access modifier is not visible outside of the package
        //System.out.println(AccessModifiers.privateData);//private access modifier is not visible outside of the class

       AccessModifiers.method1();//public access modifier
        // AccessModifiers.method2();//not use because access modifier (default )not visible outside of it's package
        // AccessModifiers.method3();// not use because access modifier( private) not visible outside of it's class.

    }





}
