package day09_IfStatements;

public class MinNumber2 {
    public static void main(String[] args) {

         int n1 = 100;
         int n2 =200;

         boolean n1isMin = n1 < n2;

        /* if (n1 < n2) {
             System.out.println( n1 + " is minimum number ");*/
         boolean n2IsMIn = n2< n1;
        /*  if (n2<n1) {
              System.out.println( n1 + " is maximum number");
          }*/
        boolean equal = n1== n2;
         /* if (n1 == n2) {
              System.out.println("equal");
}*/
        if(n1isMin){ //if n1 is min num
            System.out.println( n1 + "is the minimum number");
        }

        if(n2IsMIn){ //if n2 is min num
            System.out.println( n2 + "is the minimum number");
        }


        if(equal){ //if n1 equal to n2
            System.out.println( "Equal");
        }





    }
}
