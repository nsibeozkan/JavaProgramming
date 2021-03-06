package practice_01_26_2022.adressTask;

public class Address {


    private String street, city, state, zipCode;
    private final String country = "USA";

    public Address() {
    }

    //constructor
    public Address(String street, String city, String state, String zipCode) {
        setStreet(street);
        this.city = city;
        this.state = state;
        setZipCode(zipCode);
    }

    //getter
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }



    //setter

    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR: Invalid street");
            return;
        }
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length() != 5) {
            System.out.println("ERROR:Invalid zipcode");
            return;//exit statement
        }
            this.zipCode = zipCode;
        }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
/*
            AdressTask

            Create a class named Address

            Private variables:
                    street, city, state, zipCode,country

            encapsulate all the fields

            add a constructor that can set all the instances
                  overload constr with no arg constr

            - if the street name isEmpty or street length is bigger than 50
             otherwise
                 ERROR : Invalid Street

            - ZipCode length should be equal 5 otherwise
                 ERROR :Invalid ZipCode

            DO NOT duplicate any code fragments
        */