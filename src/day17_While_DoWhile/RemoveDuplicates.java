package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="AABBCC";
        String result="";//"ABC"
        for (int i = 0; i < str.length() ; i++) {
            String  ch= ""+str.charAt(i);//"A" "A" "B".......
            // char ch = str.charAt(i);
            //if(result.contains(""+ch)!!!!!
            if(result.contains(ch)) {
                continue;//skip
                //break:---->exit
            }
            result += ch;
        }
        System.out.println(result);








    }
}
