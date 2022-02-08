package day45_Abstraction_Continue;

//extends :
class C{

}
class A{

}
class B extends A{
 }

 interface X{

 }
interface Y{

}

interface Z extends Y,X{

}


class D implements X,Y,Z {

}
public class Extends_vs_Implements  extends A implements X,Y,Z{
}
