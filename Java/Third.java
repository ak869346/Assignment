package Java;

import java.util.Arrays;

public class Third {

    public static boolean isPanagram(String str) {

        if (str == null) {
            return false;
        }
        Boolean alpha[] = new Boolean[26];
        Arrays.fill(alpha, false);

        int index = 0;
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
                alpha[index] = true;
            }
        }

        for(boolean i:alpha) {
            if(!i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        String str = "Two driven jocks help fax my big quiz";
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "I am writing a code";
        System.out.println(isPanagram(str));
        System.out.println(isPanagram(str1));
        System.out.println(isPanagram(str2));
    }
}
