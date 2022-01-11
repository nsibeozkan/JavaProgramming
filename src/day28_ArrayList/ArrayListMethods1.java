package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();

       numbers.add(10);//autoboxing
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        numbers.add(2,25);//2
        numbers.add(6,80);//5

        System.out.println(numbers);

        System.out.println(numbers.size());
        int lastIndex=numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
        
        int num=numbers.get(3);
        System.out.println("num = " + num);

        System.out.println("=====================");

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("============================");

        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"JavaScript");
        list.set(3,"C++");
        System.out.println(list);

     System.out.println("=========================");

     ArrayList<String> employees=new ArrayList<>();
     employees.add("Suat");
     employees.add("Aygun");
     employees.add("Olga");
     employees.add("Neira");
     employees.add("Ali");
     employees.add("Hulya");
     employees.add("Kaloyan");

     System.out.println(employees);

     employees.remove(0);
     System.out.println(employees);
     employees.remove(0);
     System.out.println(employees);
     employees.remove(0);
     System.out.println(employees);
     employees.remove(1);
     System.out.println(employees);
    employees.remove(employees.size()-1);//for last index
     System.out.println(employees);

     //remove for remove first element that matches;
      boolean r1=employees.remove("hulya");
     System.out.println(employees);

     boolean r2= employees.remove("Neira");
     System.out.println(employees);

     System.out.println(r1);
     System.out.println(r2);

    }
}
