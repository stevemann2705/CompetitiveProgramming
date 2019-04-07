package in.stevemann.strings;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        boolean flag = false;

        java.util.Map<String, Integer> mapA = new java.util.HashMap<String,Integer>();
        java.util.Map<String, Integer> mapB = new java.util.HashMap<String,Integer>();

        for(char ch: a.toLowerCase().toCharArray()){
            if(mapA.containsKey(Character.toString(ch))){
                mapA.replace(Character.toString(ch), mapA.get(Character.toString(ch)) + 1);
            }else{
                mapA.put(Character.toString(ch), 1);
            }
        }

        for(char ch: b.toLowerCase().toCharArray()){
            if(mapB.containsKey(Character.toString(ch))){
                mapB.replace(Character.toString(ch), mapB.get(Character.toString(ch)) + 1);
            }else{
                mapB.put(Character.toString(ch), 1);
            }
        }

        if(mapA.equals(mapB)){
            flag = true;
        }
        else{
            flag = false;
        }

        return flag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
