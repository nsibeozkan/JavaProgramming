package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
        String name = "James King",
        buildingNumber = "11287";

        String name = "Nesibe Ozkan ",
               buildingNumber = "421A";
                String streetName = "Russell Street",
                city = "Overland Park",
                state = "Kansas" ,
                 zipCode =" 66223A";
                 */


        String name ="Nesibe ozkan";
        int buildingNumber = 13910;
        String streetName = "Russell street";
        String city = "Overland Park";
        String state = "KS";
        int zipCode = 66223;


        //System.out.println(name + "\n" + buildingNumber + " "+ streetName+ "\n" + city+", " + state+ " "+zipCode );

String shippingAddress =name + "\n" + buildingNumber + " "+ streetName+ "\n" + city+", " + state+ " "+zipCode;

        System.out.println( shippingAddress);

    }




}
 /*
 Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
  */