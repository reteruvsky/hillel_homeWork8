import java.sql.SQLOutput;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findSymbolOccurrence("Hillel", 'l'));
        System.out.println(findWordPosition("Apollo", "ollo"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("EARLRAE"));
    }

    public static int findSymbolOccurrence(String str, char ch) {
        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                index++;
            }
        }

        return index;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char ch = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = ch;
        }

        return new String(chars);
    }

    public static boolean isPalindrome(String str) {
        boolean isPalindrome = false;

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == chars[chars.length - 1 - i]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
