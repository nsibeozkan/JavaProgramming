package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String [] countries={"Japan","Korea","United States","Turkey","United Kingdom","Canada"};
        //converting array to Arraylist
        ArrayList<String> list=new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p-> p.length()>=10);
        System.out.println(list);

        //converting arraylist to array

      countries=  list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));//bu array arraylist degil!!! arraya dondurduk.
    }
}
