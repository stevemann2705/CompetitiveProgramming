package in.stevemann.problemsolving.strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SpecialPalindrome {
    private static String[] getAllSubStrings(String str) {
        List<String> list = new LinkedList<>();

        for (int lengthOfSubString = 0; lengthOfSubString < str.length(); lengthOfSubString++) {
            for (int i = 0; i <= str.length() - lengthOfSubString; i++) {
                String substr = str.substring(i, i + lengthOfSubString);
                if (!substr.isEmpty()) {
                    list.add(substr);
                }
            }
        }

        list.add(str);

        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    private static boolean checkPalindrome(String str) {
        StringBuilder string = new StringBuilder(str);
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();

        return string.toString().equals(rev.toString());
    }

    private static boolean checkSpecialPalindrome(String str) {
        if (checkPalindrome(str)) {
            int midIndex = str.length() / 2;

            char charUsed = str.charAt(0);

            for (int i = 0; i < str.length(); i++) {
                if (i == midIndex) {
                    continue;
                }
                if (str.charAt(i) != charUsed) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int count = 0;
        String[] arr = getAllSubStrings(a);

        for (int i = 0; i < arr.length; i++) {
            if (checkSpecialPalindrome(arr[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
