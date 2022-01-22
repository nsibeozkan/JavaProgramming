package day37_Inheritance.phoneTask;

public final class Samsung extends Phone {

    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }
       public void freeze(){
           System.out.println(brand+" "+model+" is faster than freezing Iphone");
        }





}
/*
 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

 */