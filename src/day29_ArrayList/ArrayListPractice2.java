package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employess=new ArrayList<>();
        employess.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","Ahmed","David","Shay"));

        employess.retainAll(Arrays.asList("Ahmed","David"));
        System.out.println("employess = " + employess);


        System.out.println("==============================");

        String[]names={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
                    //p.startsWith("M")
        list.removeIf(p->p.charAt(0)=='M');

        System.out.println("list = " + list);
        // burda arraylisti arraye ceviriyoruz!!!
          names=list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

        






    }
}
