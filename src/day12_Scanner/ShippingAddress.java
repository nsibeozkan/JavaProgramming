package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName=scan.nextLine();//Java Programming

        System.out.println("Enter your building name:");
        String building = scan.next();//13910A

        scan.nextLine();

        System.out.println("Enter  your street name");
        String street= scan.nextLine();

        System.out.println("Enter your city name");
        String city= scan.nextLine();

        System.out.println("Enter your state name");
        String state=scan.next();

        System.out.println("Enter zip code:");
        String  zipCode= scan.next();

        scan.nextLine();

        System.out.println("Enter your country:" );
         String country =scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + building);
        System.out.println("streetName = " + street);
        System.out.println("cityName = " + city);
        System.out.println("stateName = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

scan.close();



    }
}
/*
full name nextline
building number next
street name nextline
city name nextline
state nextline
zip code int

 */