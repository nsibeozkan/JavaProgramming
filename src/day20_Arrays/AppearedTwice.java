package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars = {'A','A','A','B','C','C','D','D','D'};

        for (int j = 0; j < chars.length; j++) {
            int frequency = 0;
            char ch = chars[j];
            for (int i = 0; i < chars.length; i++) {
                if (ch == (chars[i])) {
                    frequency++;
                }
            }
            if (frequency == 2) {

                System.out.println("ch = " + ch);
            }

        }



    }
}
