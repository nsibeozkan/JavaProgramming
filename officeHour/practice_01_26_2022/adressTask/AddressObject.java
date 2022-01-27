package practice_01_26_2022.adressTask;

public class AddressObject {
    public static void main(String[] args) {
           Address home=new Address();
           home.setStreet("1234 Abcd road");
           home.setCity("Chicago");
           home.setState("IL");
           home.setZipCode("12345");
        System.out.println(home);
        home.setStreet("");
        home.setZipCode("123");
        System.out.println("home adress: "+home);

        Address work=new Address("russell street","overlandPark","KS","12345");
        System.out.println("Work address: "+work);


    }
}
