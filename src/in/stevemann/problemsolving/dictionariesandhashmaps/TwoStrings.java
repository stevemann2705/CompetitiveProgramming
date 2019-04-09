package in.stevemann.problemsolving.dictionariesandhashmaps;

import java.util.LinkedHashSet;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        LinkedHashSet<Character> set1 = new LinkedHashSet<>();
        LinkedHashSet<Character> set2 = new LinkedHashSet<>();

        int longer = s1.length() > s2.length() ? s1.length() : s2.length();

        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.toLowerCase().charAt(i));
        }

        for (int i = 0; i < s1.length(); i++) {
            set2.add(s2.toLowerCase().charAt(i));
        }

        // ----------------- APPROACH 1 -------------------------
//        if(s1.length() == longer){
//            for(int i=0; i<longer; i++){
//                if(set2.contains(s1.toLowerCase().charAt(i))){
//                    return "YES";
//                }
//            }
//        }else{
//            for(int i=0; i<longer; i++){
//                if(set1.contains(s2.toLowerCase().charAt(i))){
//                    return "YES";
//                }
//            }
//        }
//        return "NO";


        // ----------------- APPROACH 2 -------------------------
//        set1.retainAll(set2);
//        if (set1.isEmpty()) {
//            return "NO";
//        } else {
//            return "YES";
//        }


        // ----------------- APPROACH 3 -------------------------
//        for(int i=0; i<str1.length; i++){
//            for(int j=0; j<str2.length; j++){
//                if(str1[i] == str2[j]){
//                    return "YES";
//
//                }
//            }
//        }
//        return "NO";

        // ----------------- APPROACH 4 -------------------------
        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                return "YES";
            }
        }
        return "NO";

    }

    public static void main(String[] args) {
        String s1 = "hello", s2 = "world";
        System.out.println(twoStrings(s1, s2));
    }
}
